package com.ebcitron;

public class Main {

    public static void main(String[] args) {

        Bank ElisBank = new Bank();


        ElisBank.addCoin(new Dollar(666));

        ElisBank.countMoney();




    }
}
