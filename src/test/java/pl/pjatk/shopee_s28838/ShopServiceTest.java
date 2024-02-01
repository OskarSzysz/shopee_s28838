package pl.pjatk.shopee_s28838;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import pl.pjatk.shopee_s28838.Cart;
import pl.pjatk.shopee_s28838.Customer;
import pl.pjatk.shopee_s28838.Product;
import pl.pjatk.shopee_s28838.Storage;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

public class ShopServiceTest {

    @Mock
    private Storage storage;

    private ShopService shopService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        shopService = new ShopService(storage);
    }

    @Test
    void testOrderItemsSuccess() {
        Cart cart = new Cart(new Customer(1, 20.00));
        cart.addItemToCart("Milk");
        Product milk = new Product("Milk", 2.50);

        when(storage.getProducts()).thenReturn(List.of(milk));

        assertTrue(shopService.orderItems(cart), "Order should be successful when customer has enough balance.");
    }

    @Test
    void testOrderItemsFailure() {
        Cart cart = new Cart(new Customer(1, 1.00));
        cart.addItemToCart("Milk");
        Product milk = new Product("Milk", 2.50);

        when(storage.getProducts()).thenReturn(List.of(milk));

        assertFalse(shopService.orderItems(cart), "Order should fail when customer does not have enough balance.");
    }
}
