package DAO;
import BAO.*;
import DTO.*;

public class Payment {

    private Customer customer;
    private Cart cart;

    public Payment (Customer customer , Cart cart){

        this.customer =customer;
        this.cart = cart;

    }

    public Customer getCustomer() {
        return customer;
    }

    public Cart getCart() {
        return cart;
    }
}
