package pl.pjatk.shopee_s28838;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import pl.pjatk.shopee_s28838.Cart;
import pl.pjatk.shopee_s28838.Product;
import pl.pjatk.shopee_s28838.Storage;

@Service
public class ShopService {
    private Storage storage;

    public ShopService(Storage storage) {
        this.storage = storage;
    }

    public boolean orderItems(Cart cart) {
        List<String> items = cart.getItems();
        double cartCost = 0;

        for (String item : items) {
            Optional<Product> product = storage.getProducts().stream().filter(e -> e.getName().equals(item));
            if (product.isPresent()) {
                cartCost += product.get().getPrice();
            }
        }

        double customerBalance = cart.getCustomer().getBalance();
        if (customerBalance >= cartCost) {
            cart.getCustomer().setBalance(customerBalance - cartCost);
            return true;
        } else {
            return false;
        }
    }
}
