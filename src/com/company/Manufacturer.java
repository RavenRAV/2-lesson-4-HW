package com.company;

public class Manufacturer implements Runnable {
    Stock stock;
    public Manufacturer(Stock stock){
        this.stock=stock;
    }
    public void run(){

        System.out.println("Запуск потока производителя");

        for(int i=1; i<=5; i++){
            stock.putProduct();
            System.out.println("Производитель положил " + i);
        }
    }

}
