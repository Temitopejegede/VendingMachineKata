package com.temi.vendingMachineFunctionality;

import com.temi.coins.Coin;
import com.temi.inputs.Inputs;
import com.temi.item.Item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    private static final double PENNYVALUE = 0.01;
    private static final double NICKELVALUE = 0.05;
    private static final double DIMEVALUE = 0.10;
    private static final double QUARTERVALUE = 0.25;

    private static final double PRICEOFCOLA = 1.00;
    private static final double PRICEOFCHIPS = 0.50;
    private static final double PRICEOFCANDY = 0.65;
    HashMap<Coin, Double> coinValueMap = new HashMap<>();
    HashMap<Item, Double> itemValueMap = new HashMap<>();

    //think of method to generate arraylist with custom number of values and coins
    ArrayList<Coin> inputs = new Inputs().generateRandomCoins();

    public VendingMachine(){
        mapCoinValue();
        mapItemValue();

    }

    public String checkDisplay(){
        return "INSERT COIN";
    }
    public String checkDisplayWhenItemHasJustBeenBought(){
        return "THANK YOU";
    }
    public String displayWhenMoneyIsNotEnough(Item item){
        return "PRICE: "+ itemValueMap.get(item);
    }

    public void mapCoinValue(){
        coinValueMap.put(Coin.PENNY, PENNYVALUE);
        coinValueMap.put(Coin.NICKEL, NICKELVALUE);
        coinValueMap.put(Coin.DIME, DIMEVALUE);
        coinValueMap.put(Coin.QUARTER, QUARTERVALUE);
    }

    public void mapItemValue(){
        itemValueMap.put(Item.COLA, PRICEOFCOLA);
        itemValueMap.put(Item.CANDY, PRICEOFCANDY);
        itemValueMap.put(Item.CHIPS, PRICEOFCHIPS);
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

    //probably redundant
    public boolean checkIfCoinTypeExists(Coin myCoin){
        return coinValueMap.containsKey(myCoin);
    }


    public double getCoinValue(Coin myCoin){
        if(coinValueMap.containsKey(myCoin)) return coinValueMap.get(myCoin);
        return 0;
    }

    public boolean checkIfCoinIsValidForVendingMachine(Coin myCoin){
        return myCoin != Coin.PENNY;
    }

    public double getHowMuchMoneyWasInserted(ArrayList<Coin> coins){
        double money = 0.0;
        for(Coin currentCoin: coins){
            if(checkIfCoinIsValidForVendingMachine(currentCoin) && checkIfCoinTypeExists(currentCoin)){
                money += getCoinValue(currentCoin);
            }
        }
        return  money;
    }
    public void selectItem(Item snack){
        if(getHowMuchMoneyWasInserted(inputs) < itemValueMap.get(snack) ){
            displayWhenMoneyIsNotEnough(snack);
        }

        if(getHowMuchMoneyWasInserted(inputs) > itemValueMap.get(snack)){
            checkDisplayWhenItemHasJustBeenBought();
        }
    }

}
