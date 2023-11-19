package com.example.billsplitter;

public class Entry{
    double price = 0.00;
    String owner = "add name";
    String item = "item";

    public double getPrice() {
        return price;
    }

    public String getOwner() {
        return owner;
    }

    public String getItem() {
        return item;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Entry(double price, String item, String owner) {
        this.price = price;
        this.owner = owner;
        this.item = item;
    }


    public Entry(double price, String item) {
        this.price = price;
        this.item = item;

        }
}