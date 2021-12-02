package com.Torryharris.Product;

public class product {
    int sr_no;
    String name;
    int qty;
    int price;

    @Override
    public String toString() {
        return "product{" +
                "sr_no=" + sr_no +
                ", name='" + name + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                '}';
    }

    public product(int sr_no, String name, int qty, int price) {
        this.sr_no = sr_no;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    public int getSr_no() {
        return sr_no;
    }

    public void setSr_no(int sr_no) {
        this.sr_no = sr_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
