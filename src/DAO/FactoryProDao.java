package DAO;

public class FactoryProDao {
    public PayInter getClassPay(){
        return new Payment();
    }
}
