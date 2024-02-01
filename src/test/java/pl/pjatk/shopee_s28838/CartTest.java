package pl.pjatk.shopee_s28838;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CartTest {

    private Cart cart;
    private Customer customer;

    @BeforeEach
    void setUp() {
        customer = new Customer(1, 100.00);
        cart = new Cart(customer);
    }

    @Test
    void testAddItemToCart() {
        cart.addItemToCart("Milk");
        assertEquals(1, cart.getItems().size(), "Cart should contain one item.");
        assertTrue(cart.getItems().contains("Milk"), "Cart should contain Milk.");
    }
}

