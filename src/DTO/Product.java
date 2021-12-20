package DTO;

public abstract class Product {
    private int id;
    private String name;
    private Number amount;
    private float price;

    public Product(int id, String name, Number amount, float price) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAmount(Number amount) {
        this.amount = amount;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Number getAmount() {
        return amount;
    }
    public float getPrice() {
        return price;
    }
    /*
    @Override
    public String toString(){
        return "Id :"+id+"      name :"+name + "        amount :"+amount+"      price :"+price;
    }
    */
}
