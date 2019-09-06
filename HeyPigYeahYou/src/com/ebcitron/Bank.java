package com.ebcitron;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Bank {
    private ArrayList<Coin> coinArray = new ArrayList<Coin>();

    DecimalFormat DF = new DecimalFormat("$###,###.00");

    public Bank() {

    }

    public void addCoin(Coin newCoin){
        coinArray.add(newCoin);
    }

    public void countMoney() {
        double arrayValue = 0;

        for (Coin coin: coinArray){
            System.out.println(coin.toString());
            arrayValue += coin.getTotal();
        }

        System.out.println("You Have Saved Up " + DF.format(arrayValue));
    }
}
