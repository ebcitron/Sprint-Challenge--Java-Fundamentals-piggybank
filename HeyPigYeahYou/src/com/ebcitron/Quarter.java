package com.ebcitron;

public class Quarter extends Coin {

    public double value = .25;

    public Quarter(double quantity){
        super(quantity);
    }

    public Quarter(){
        super();
    }

    public double getTotal() {
        return value * this.getQuantity();
    }

}
