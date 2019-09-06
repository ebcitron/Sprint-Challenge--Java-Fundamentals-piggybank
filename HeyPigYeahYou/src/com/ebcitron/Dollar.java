package com.ebcitron;

public class Dollar extends Coin {

    public double value = 1.00;

    public Dollar(double quantity){
        super(quantity);
    }

    public Dollar(){
        super();
    }

    public double getTotal() {
        return value * this.getQuantity();
    }

}
