package View;

import BAO.Admin;
import java.util.Scanner;

public class Main {

    static boolean getOut = false;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String input ;
        while (!getOut){
            System.out.println("are you the admin ? (Y/N)");
            input = in.next().toLowerCase();
            if (input.equals("y"))
                AdminView.main(null);
            else if (input.equals("n"))
                CustomerView.main(null);
            else
                getOut = true;
        }
    }
}
