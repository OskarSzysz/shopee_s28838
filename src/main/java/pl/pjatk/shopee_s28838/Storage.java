package pl.pjatk.shopee_s28838;

import org.springframework.stereotype.Component;
import java.util.List;
import java.util.ArrayList;
import pl.pjatk.shopee_s28838.Product;

@Component
public class Storage {
    private List<Product> products;

    public Storage() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }
}
