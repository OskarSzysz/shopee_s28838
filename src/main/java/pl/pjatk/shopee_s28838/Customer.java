package pl.pjatk.shopee_s28838;
import java.util.List;

public class Customer{
    private int id;
    private double balance;

    public Customer(int id, double balance){
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return this.id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

}