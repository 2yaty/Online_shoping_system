package View;

import BAO.Admin;
import DAO.Warehouse;
import java.util.Scanner;

public class AdminView {

    static boolean getOut = false;
    static {
        Username = "moo";
        Password = "1234";
    }
    private static final String Username, Password;


    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        String username , password ;

        while (true){

            System.out.println("please Enter your username :");

            username = in.next();

            if (username.equals(Username))
                break;

            else
                System.out.println("username is incorrect , please try again");

        }

        while (true){

            System.out.println("please Enter your password :");

            password = in.next();

            if (password.equals(Password))
                break;

            else
                System.out.println("password is incorrect , please try again");

        }

        Admin manager = Admin.getAccess(username , password);

        while (! getOut){

            printList();
            doAction(manager , in.nextInt());
        }


    }

    static void printList (){

        System.out.println("1- view products");
        System.out.println("2- add product");
        System.out.println("3- delete product");
        System.out.println("4- modify product");
        System.out.println("5- to go back ");

    }

    static void doAction (Admin a,int i){
        Scanner in = new Scanner(System.in);

        switch (i){
            case 1 :
                Warehouse.viewProducts();
                break;

            case 2 :
                System.out.println("please enter the product's name :");
                String name = in.next();
                float price ;
                System.out.println("please enter the product's price per amount :");
                price = in.nextFloat();
                System.out.println("please enter the product's amount :");

                System.out.println("is it countable ? (Y/N)");
                String  c = in.next();
                int am;
                float amo;
                if (c.toLowerCase().equals("y")){
                    System.out.println("please enter how many ?");
                    am = in.nextInt();
                    Warehouse.addProduct(a , name , am , price);
                }else {
                    System.out.println("please enter how much ?");
                    amo = in.nextFloat();
                    Warehouse.addProduct(a , name , amo , price);
                }

                break;

            case 3 :
                System.out.println("please enter product's id :");
                Warehouse.deleteProduct(a , in.nextInt());

                break;

            case 4 :
                System.out.println("please enter product's id that you want modify :");
                int id = in.nextInt();
                System.out.println("please enter the new name :");
                String nam = in.next();
                System.out.println("please enter the new price :");
                float p = in.nextFloat();

                System.out.println("is it countable ? (Y/N)");
                String  ca = in.next();
                if (ca.toLowerCase().equals("y")){
                    System.out.println("please enter how many ?");
                    am = in.nextInt();
                    Warehouse.addProduct(a , nam , am , p);
                }else {
                    System.out.println("please enter how much ?");
                    amo = in.nextFloat();
                    Warehouse.addProduct(a , nam , amo , p);
                }
                break;

            default:
                AdminView.getOut = true;
                break;

        }
    }
}
