package com.temi.vendingMachineFunctionality;

import com.temi.coins.*;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    private static final double PENNYVALUE = 0.01;
    private static final double NICKELVALUE = 0.05;
    private static final double DIMEVALUE = 0.10;
    private static final double QUARTERVALUE = 0.25;

    public VendingMachine(){}
    Coin[] coins = Coin.values();
    HashMap<Coin, Double> coinValueMap = new HashMap<>();


    public void mapCoinValue(){
        coinValueMap.put(coins[0], PENNYVALUE);
        coinValueMap.put(coins[1], NICKELVALUE);
        coinValueMap.put(coins[2], DIMEVALUE);
        coinValueMap.put(coins[3], QUARTERVALUE);
    }

    public Coin measureCoinDimensions(Coin myCoin){
        if(myCoin.getEDGE().equals("plain")){
            if(myCoin.getWEIGHT().equals("2.5")
                    && myCoin.getDIAMETER().equals("19.05")
                    && myCoin.getTHICKNESS().equals("1.52")
                    && myCoin.getNUMBEROFREEDS().equals("0")) return Coin.PENNY;
            if(myCoin.getWEIGHT().equals("5.0")
                    && myCoin.getDIAMETER().equals("21.21")
                    && myCoin.getTHICKNESS().equals("1.95")
                    && myCoin.getNUMBEROFREEDS().equals("0")) return Coin.NICKEL;
        } else{
            if(myCoin.getWEIGHT().equals("2.268")
                    && myCoin.getDIAMETER().equals("17.91")
                    && myCoin.getTHICKNESS().equals("1.35")
                    && myCoin.getNUMBEROFREEDS().equals("118")) return Coin.DIME;
            if(myCoin.getWEIGHT().equals("5.670")
                    && myCoin.getDIAMETER().equals("24.26")
                    && myCoin.getTHICKNESS().equals("1.75")
                    && myCoin.getNUMBEROFREEDS().equals("119")) return Coin.QUARTER;
        }
        return null;
    }

    public double getCoinValue(Coin myCoin){
        if(coinValueMap.keySet().toArray()[0].equals(myCoin)) return 0.01;
        if(coinValueMap.keySet().toArray()[1].equals(myCoin)) return 0.05;
        if(coinValueMap.keySet().toArray()[2].equals(myCoin)) return 0.10;
        if(coinValueMap.keySet().toArray()[3].equals(myCoin)) return 0.25;
        return 0;
    }
}
