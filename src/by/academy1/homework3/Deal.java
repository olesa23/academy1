package by.academy1.homework3;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class Deal {
    private User seller;
    private User buyer;
    private Product[] products;
    private LocalDate dealDate;

    public Deal(User seller, User buyer, Product[] products, LocalDate dealDate) {
        this.seller = seller;
        this.buyer = buyer;
        this.products = products;
        this.dealDate = dealDate;
    }

    public Deal() {

    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public LocalDate getDealDate() {
        return dealDate;
    }

    public void setDealDate(LocalDate dealDate) {
        this.dealDate = dealDate;
    }


    private void transferMoney() {
        seller.setMoney(seller.getMoney() + calculateFullPrice());
        buyer.setMoney(buyer.getMoney() - calculateFullPrice());
    }

    private void printBill() {
        System.out.println("Стоимость покупок");
        for (Product p : products) {
            if (p == null) {
                continue;
            }
            System.out.println(p + " стоимость со скидкой " + p.calculatePrice());
            System.out.println(" Общая стоимость со скидкой " + calculateFullPrice());
        }
        System.out.println(" Дата сделки " + getDealDate());

    }


    public double calculateFullPrice() {
        if (products == null) {
            return 0;
        }
        double result = 0;
        for (Product p : products) {
            if (p == null) {
                continue;
            }
            result += p.calculatePrice();
        }
        return result;
    }

    public void submitDeal() {
        double price = calculateFullPrice();
        if (!buyer.hasEnoughMoney(price)) {
            printBill();
            transferMoney();
            System.out.println("Спасибо за покупку!");
        } else {
            System.out.println("У вас нет столько денег" + price);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Deal deal = (Deal) o;
        //return seller.equals(deal.seller) && buyer.equals(deal.buyer) &&
        //  Arrays.equals(products, deal.products) && dealDate.equals(
        //deal.dealDate);

        if (!Objects.equals(seller, deal.seller)) return false;
        if (!Objects.equals(buyer, deal.buyer)) return false;
        if (!Arrays.equals(products, deal.products)) return false;
        return Objects.equals(dealDate, deal.dealDate);
    }


    @Override
    public int hashCode() {
        int result = seller != null ? seller.hashCode() : 0;
        result = 31 * result + (buyer != null ? buyer.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(products);
        result = 31 * result + (dealDate != null ? dealDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Deal{" +
                "seller=" + seller +
                ", buyer=" + buyer +
                ", products=" + Arrays.toString(products) +
                ", dealDate=" + dealDate +
                '}';
    }
}

