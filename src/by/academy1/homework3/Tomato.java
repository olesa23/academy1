package by.academy1.homework3;

     public class Tomato extends Product {
    private String color;

    public Tomato(){
        super();
    }

         public Tomato(String name, double price, double quantity, String color) {
       // super(name, price, quantity);
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
 } @Override
         public String toString() {
             return "Apple{" +
                     "color='" + color + '\'' +
                     "name='" + name + '\'' +
                     ", price=" + price +
                     ", quantity=" + quantity +
                     '}';
         }
     }