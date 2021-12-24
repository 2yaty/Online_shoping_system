package DAO;
import BAO.*;
import DTO.*;

public class Payment implements PayInter{

    private Customer customer;
    private Cart cart;

    public Payment (Customer customer , Cart cart){
        this.customer =customer;
        this.cart = cart;
    }

    @Override
    public Customer getCustomer() {
        return customer;
    }
    public Cart getCart() {
        return cart;
    }

}
