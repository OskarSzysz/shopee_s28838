package pl.pjatk.shopee_s28838;

import java.util.List;
import java.util.ArrayList;

public class Cart{
    private Customer customer;
    private List<String> items;

    public Cart(Customer customer){
        this.customer = customer;
        this.items = new ArrayList<>();
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public List<String> getItems() {
        return this.items;
    }

    public void addItemToCart(String name){
        this.items.add(name);
    }

}