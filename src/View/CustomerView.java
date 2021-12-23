package View;

import BAO.Cart;
import BAO.Sales;
import DAO.Warehouse;
import DTO.Customer;

import java.util.Scanner;

public class CustomerView {

    static boolean getOut = false;
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Cart myCart = new Cart();
        Customer customer ;
        String name , phone;
        System.out.println("please enter your name :");
        name = in.next();
        System.out.println("please enter your phone number :");
        phone = in.next();
        customer = new Customer(name , phone);

        while (!getOut){
            Warehouse.viewProducts();

            System.out.println("which product do you want to put into the cart ? (enter it's id)");
            System.out.println("or if you want to exit enter any letter else");

            try {
                int id = in.nextInt();
                System.out.println("the amount you want ?");
                Number amo = in.nextInt();
                myCart.addProduct(Warehouse.getProduct(id) , amo);

                System.out.println("the product is added successfully");
                System.out.println("do you want to add more products ? (Y/N)");
                if (in.next().toLowerCase().equals("y"))
                    continue;
                else
                    getOut = true;

            }catch (Exception e){
                break;
            }

            System.out.println("your total is "+myCart.getTotal());
            System.out.println("are you sure to pay ? (Y/N)");
            if (in.next().toLowerCase().equals("y"))
                Sales.makePayment(customer,myCart);
            else
                myCart.removeCart();
        }
        getOut = false;
    }
}
