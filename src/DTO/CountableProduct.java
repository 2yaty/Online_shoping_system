package DTO;

public class CountableProduct extends Product implements Countable{

    public CountableProduct(int id, String name, Number amount, float price) {
        super(id, name, amount, price);
    }

    @Override
    public int getNum() {
        return (int) super.getAmount();
    }
    public float getCost() {
        return super.getPrice();
    }
    public void updateAmount(Number a) {
        super.setAmount(a);
    }
}
