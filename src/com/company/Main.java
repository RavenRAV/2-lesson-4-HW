package com.company;

public class Main {

    public static void main(String[] args) {
        Stock stock = new Stock();
        Manufacturer manufacturer = new Manufacturer(stock);
        Consumer consumer = new Consumer(stock);
        Thread t1=new Thread(manufacturer);
        Thread t2 = new Thread(consumer);
        t1.start();
        t2.start();
    }
}
