package by.academy1.homework3;

public class Apple extends Product {
    private String color;

   public Apple() {
        super();
    }

    public Apple(String name, double price, double quantity, String color) {
        this.name=name;
       this.price=price;
        this.quantity=quantity;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

   // @Override
    //public double calculatePrice() {
    //    return quantity * price * discount();
  //  }
    }



