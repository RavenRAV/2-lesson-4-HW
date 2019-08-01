package com.company;

public class Consumer implements Runnable {
    Stock stock;
    public Consumer(Stock stock){
        this.stock = stock;
    }

    public void run() {

        System.out.println("Запуск потока Потребителя");

        for(int i =1; i<=5; i++){
            stock.getProduct();
            System.out.println("Потребитель Забрал " + i);
        }

    }
}
