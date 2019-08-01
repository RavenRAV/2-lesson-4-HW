package com.company;

public class Stock {
    public int productCounter = 0;

    public Stock(int productCounter) {
        this.productCounter = productCounter;
    }

    public Stock() {
    }

    public void putProduct() {
        if (productCounter>=5){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        productCounter = productCounter + 1;
        System.out.println("На складе "+ productCounter + " продуктов");
    }

    public void getProduct() {
        if (productCounter <5) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        productCounter = productCounter - 1;
        System.out.println("На складе " + productCounter + " продуктов");
    }








}
