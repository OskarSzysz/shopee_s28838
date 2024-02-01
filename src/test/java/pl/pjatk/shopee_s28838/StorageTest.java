package pl.pjatk.shopee_s28838;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.pjatk.shopee_s28838.Product;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StorageTest {

    private Storage storage;

    @BeforeEach
    void setUp() {
        storage = new Storage();
    }

    @Test
    void testAddProduct() {
        Product product = new Product("Milk", 2.50);
        storage.addProduct(product);
        assertEquals(1, storage.getProducts().size(), "Storage should contain one product.");
        assertTrue(storage.getProducts().contains(product), "Storage should contain the added product.");
    }
}
