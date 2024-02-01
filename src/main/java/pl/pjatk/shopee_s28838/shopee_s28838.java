package pl.pjatk.shopee_s28838;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.pjatk.shopee_s28838.Cart;
import pl.pjatk.shopee_s28838.Customer;
import pl.pjatk.shopee_s28838.ShopService;
import pl.pjatk.shopee_s28838.Storage;

@SpringBootApplication
public class shopee_s28838 {

    public static void main(String[] args) {
        SpringApplication.run(shopee_s28838.class, args);
        Customer customer = new Customer(1, 150d);
        Cart cart = new Cart(customer);
        Storage storage = new Storage();
        ShopService shopService = new ShopService(storage);
        
        cart.addItemToCart("milk");
        cart.addItemToCart("milk");
        cart.addItemToCart("beer");
        shopService.orderItems(cart);
    }
}
