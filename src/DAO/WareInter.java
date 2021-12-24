package DAO;

import BAO.Admin;
import DTO.Sellable;

public interface WareInter {

    public void viewProducts();
    public Sellable getProduct(int id );
    public void addProduct(Admin a , String name, Number amount, float price );
    public void deleteProduct (Admin a ,int id);
    public void modifyProduct (Admin a ,int id , String name, Number amount, float price);
}
