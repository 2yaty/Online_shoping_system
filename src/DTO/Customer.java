package DTO;

public class Customer{
    private String name , phone ,email;

    public Customer (String name , String phone){
        this.name = name;
        this.phone = phone;
    }

    public String getName(){ return name ; }
    public String getPhone(){ return phone;}
}
