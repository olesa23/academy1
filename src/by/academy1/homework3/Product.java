package by.academy1.homework3;

import java.util.Arrays;
import java.util.Objects;

public abstract class Product {
    protected String name;
    protected double price;
    protected double quantity;

   // public Product() {
     //   super();


    public Product(String name,double price,double quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

    public Product() {

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double calculatePrice() {
        return quantity * price * discount();}
        public abstract double discount ();

    //public double discount() {
      //  if (quantity < 10) {
        //    return 1;
        //} else if (quantity < 20) {
          //  return 0.8;
        //} else {
         //   return 0.75;
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && Double.compare(product.quantity, quantity) == 0 && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, quantity);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    }




