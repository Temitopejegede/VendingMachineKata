package com.temi.vendingMachineFunctionality;

import com.temi.coins.*;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    private static final double PENNYVALUE = 0.01;
    private static final double NICKELVALUE = 0.05;
    private static final double DIMEVALUE = 0.10;
    private static final double QUARTERVALUE = 0.25;

    HashMap<String, Integer> coinValueMap = new HashMap<>();
    public double getCoinValue(Coin myCoin){
        if(myCoin.getEDGE().equals("plain")){
            if(myCoin.getWEIGHT().equals("2.5")
                    && myCoin.getDIAMETER().equals("19.05")
                    && myCoin.getTHICKNESS().equals("1.52")
                    && myCoin.getNUMBEROFREEDS().equals("0")) return PENNYVALUE;
            if(myCoin.getWEIGHT().equals("5.0")
                    && myCoin.getDIAMETER().equals("21.21")
                    && myCoin.getTHICKNESS().equals("1.95")
                    && myCoin.getNUMBEROFREEDS().equals("0")) return NICKELVALUE;
        } else{
            if(myCoin.getWEIGHT().equals("2.268")
                    && myCoin.getDIAMETER().equals("17.91")
                    && myCoin.getTHICKNESS().equals("1.35")
                    && myCoin.getNUMBEROFREEDS().equals("118")) return DIMEVALUE;
            if(myCoin.getWEIGHT().equals("5.670")
                    && myCoin.getDIAMETER().equals("24.26")
                    && myCoin.getTHICKNESS().equals("1.75")
                    && myCoin.getNUMBEROFREEDS().equals("119")) return QUARTERVALUE;
        }
        return 0;
    }
}
