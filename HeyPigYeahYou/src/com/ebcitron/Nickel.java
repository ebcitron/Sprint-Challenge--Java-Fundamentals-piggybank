package com.ebcitron;

public class Nickel extends Coin {

    public double value = .05;

    public Nickel(double quantity){
        super(quantity);
    }

    public Nickel(){
        super();
    }

    public double getTotal() {
        return value * this.getQuantity();
    }

}
