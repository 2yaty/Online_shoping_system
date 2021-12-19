public class CountableProduct extends Product implements Countable , Sellable{


    public CountableProduct(int id, String name, Number amount, float price) {
        super(id, name, amount, price);
    }

    @Override
    public int getNum() {
        return (int) super.getAmount();
    }

    @Override
    public float getCost() {
        return super.getPrice();
    }

    @Override
    public void updateAmount(Number a) {
        super.setAmount(a);
    }
}
