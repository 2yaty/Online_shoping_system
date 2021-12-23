package DAO;

import BAO.*;
import DTO.*;
import java.util.ArrayList;

public class Warehouse {
    private static ArrayList<Product> products = new ArrayList<>();

    public static void viewProducts (){

        for (Product product : products)
            System.out.println(product);
    }
    public static Sellable getProduct (int id ){

        return (Sellable) products.get(id);
    }

    public static void addProduct (Admin a , String name, Number amount, float price ){

        if (amount instanceof Integer)
            products.add(new CountableProduct(products.size(), name , amount , price));

        else
            products.add(new UncountableProduct(products.size() , name , amount , price));

    }

    public static void deleteProduct (Admin a ,int id){

        products.remove(id);
        products.trimToSize();
    }

    public static void modifyProduct (Admin a ,int id , String name, Number amount, float price){

        Product product = products.get(id);
        product.setName(name);
        product.setAmount(amount);
        product.setPrice(price);
    }

   static  {
        addProduct(Admin.getAccess("moo","1234") , "Rice", 20 , 5);
    }
}
