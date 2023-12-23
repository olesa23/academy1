package by.academy1.homework3;

public class Strawberry extends Product {
    private String taste;

    public Strawberry() {
        super();
    }

    public Strawberry(String name, double price, double quantity, String taste) {
      //  super(name, price, quantity);
        this.taste = taste;
    }
    public String getTaste() {
        return taste;
    }

    public void setColor(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Strawberry{" +
                "taste='" + taste + '\'' +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';

    }

    @Override

    public double discount() {
        if (quantity < 10) {
            return 1;
        } else if (quantity < 20) {
            return 0.8;
        } else {
            return 0.75;
        }

    }}


