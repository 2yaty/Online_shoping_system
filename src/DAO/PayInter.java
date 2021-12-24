package DAO;

import BAO.Cart;
import DTO.Customer;

public interface PayInter {
    public Customer getCustomer();
    public Cart getCart();
}
