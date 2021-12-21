package BAO;

import DAO.*;
import java.util.Scanner;

public class Admin {
    private static final String Username, Password;
    static {
        Username = "moo";
        Password = "1234";
    }

    private Admin(){
    }

    public static boolean logIn(String username , String password){
        return Username.equals(username)&& Password.equals(password);
    }

    public static Admin getAccess (String username , String password){

        if (logIn(username, password))
            return new Admin();

        return null;
    }

}
