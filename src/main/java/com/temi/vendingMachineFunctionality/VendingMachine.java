package com.temi.vendingMachineFunctionality;

import com.temi.coins.Coin;
import com.temi.item.Item;
import com.temi.utils.AppConstants;

import java.util.ArrayList;
import java.util.HashMap;


public class VendingMachine {

    HashMap<Coin, Double> coinValueMap = new HashMap<>();
    HashMap<Item, Double> itemValueMap = new HashMap<>();
    HashMap<Item, Integer> itemQuantityMap = new HashMap<>();

    /**
     * keeps track of how much money is in the vending machine
     */
    private double money = 0.0;

    /**
     * this is the default display message
     */
    private String displayMessage = "INSERT COIN";


    public VendingMachine() {
        mapCoinValue();
        mapItemValue();
        mapItemQuantity();
    }

    /**
     *This constructor allows the user to create a new vending machine and set how many items are in it
     */
    public VendingMachine(int cokeQuantity, int chipsQuantity, int candyQuantity) {
        mapCoinValue();
        mapItemValue();
        mapItemQuantity(cokeQuantity, chipsQuantity, candyQuantity);
    }


    /***********************************************************************/
    /***********************************************************************/
    /*******************      MAPPINGS    **********************************/
    /***********************************************************************/
    /***********************************************************************/


    public void mapCoinValue() {
        coinValueMap.put(Coin.PENNY, AppConstants.PENNY_VALUE);
        coinValueMap.put(Coin.NICKEL, AppConstants.NICKEL_VALUE);
        coinValueMap.put(Coin.DIME, AppConstants.DIME_VALUE);
        coinValueMap.put(Coin.QUARTER, AppConstants.QUARTER_VALUE);
    }

    public void mapItemValue() {
        itemValueMap.put(Item.COLA, AppConstants.PRICE_OF_COLA);
        itemValueMap.put(Item.CANDY, AppConstants.PRICE_OF_CANDY);
        itemValueMap.put(Item.CHIPS, AppConstants.PRICE_OF_CHIPS);
    }

    public void mapItemQuantity(int coke, int chips, int candy) {
        itemQuantityMap.put(Item.COLA, coke);
        itemQuantityMap.put(Item.CHIPS, chips);
        itemQuantityMap.put(Item.CANDY, candy);
    }

    public void mapItemQuantity() {
        itemQuantityMap.put(Item.COLA, 7);
        itemQuantityMap.put(Item.CHIPS, 6);
        itemQuantityMap.put(Item.CANDY, 5);
    }

    /**End of mapping methods**/


    public void setDisplayMessage(String message) {
        if(message.equals("")) {
            displayMessage = "INSERT COIN";
            return;
        }
        displayMessage = message;
    }


    /***********************************************************************/
    /***********************************************************************/
    /*******************      COIN METHODS    ******************************/
    /***********************************************************************/
    /***********************************************************************/

    public Coin measureCoinDimensions(Coin myCoin) {
        if (myCoin.getEDGE().equals("plain")) {
            if (myCoin.getWEIGHT().equals("2.5") && myCoin.getDIAMETER().equals("19.05") && myCoin.getTHICKNESS().equals("1.52") && myCoin.getNUMBER_OF_REEDS().equals("0"))
                return Coin.PENNY;
            if (myCoin.getWEIGHT().equals("5.0") && myCoin.getDIAMETER().equals("21.21") && myCoin.getTHICKNESS().equals("1.95") && myCoin.getNUMBER_OF_REEDS().equals("0"))
                return Coin.NICKEL;
        } else {
            if (myCoin.getWEIGHT().equals("2.268") && myCoin.getDIAMETER().equals("17.91") && myCoin.getTHICKNESS().equals("1.35") && myCoin.getNUMBER_OF_REEDS().equals("118"))
                return Coin.DIME;
            if (myCoin.getWEIGHT().equals("5.670") && myCoin.getDIAMETER().equals("24.26") && myCoin.getTHICKNESS().equals("1.75") && myCoin.getNUMBER_OF_REEDS().equals("119"))
                return Coin.QUARTER;
        }
        return null;
    }

    public ArrayList<Coin> inputCoins(ArrayList<Coin> coins) {
        return coins;
    }

    //probably redundant
    public boolean checkIfCoinTypeExists(Coin myCoin) {
        return coinValueMap.containsKey(myCoin);
    }

    public double getCoinValue(Coin myCoin) {
        if (coinValueMap.containsKey(myCoin)) return coinValueMap.get(myCoin);
        return 0;
    }

    public boolean checkIfCoinIsValidForVendingMachine(Coin myCoin) {
        return myCoin != Coin.PENNY;
    }

    public double getHowMuchMoneyWasInserted(ArrayList<Coin> coins) {
        for (Coin currentCoin : coins) {
            if (checkIfCoinIsValidForVendingMachine(currentCoin) && checkIfCoinTypeExists(currentCoin)) {
                this.money += getCoinValue(currentCoin);
            }
        }
        return money;
    }

    /**End of coin methods**/

    public void selectItem(Item snack) {
        if (itemQuantityMap.get(snack) > 0) {
            if ((int) (money * 100) < (int) (itemValueMap.get(snack) * 100)) {
                setDisplayMessage("PRICE: " + itemValueMap.get(snack));
            } else{
                this.money = this.money - itemValueMap.get(snack);
                itemQuantityMap.replace(snack, itemQuantityMap.get(snack) - 1);
                setDisplayMessage("THANK YOU");
            }
        } else {
            setDisplayMessage("OUT OF STOCK");
        }
    }

    /***********************************************************************/
    /***********************************************************************/
    /*******************      COMPUTE CHANGE METHODS    ********************/
    /***********************************************************************/
    /***********************************************************************/

    public double returnChangeNumber() {
        return money;
    }

    public ArrayList<Double> returnChangeAmount() {
        ArrayList<Double> changeInCoins = new ArrayList<>();
        int temp = (int) (money * 100);
        int divisor;

        while (temp > 0) {
            if (temp >= (int) (AppConstants.QUARTER_VALUE * 100)) {
                divisor = (temp / (int) (AppConstants.QUARTER_VALUE * 100));
                for (int i = 0; i < divisor; i++) changeInCoins.add(AppConstants.QUARTER_VALUE);
                temp -= (int) (AppConstants.QUARTER_VALUE * 100) * divisor;
            }
            if (temp >= (int) (AppConstants.DIME_VALUE * 100)) {
                divisor = (temp / (int) (AppConstants.DIME_VALUE * 100));
                for (int i = 0; i < divisor; i++) changeInCoins.add(AppConstants.DIME_VALUE);
                temp -= (int) (AppConstants.DIME_VALUE * 100) * divisor;
            }
            if (temp >= (int) (AppConstants.NICKEL_VALUE * 100)) {
                divisor = (temp / (int) (AppConstants.NICKEL_VALUE * 100));
                for (int i = 0; i < divisor; i++) changeInCoins.add(AppConstants.NICKEL_VALUE);
                temp -= (int) (AppConstants.NICKEL_VALUE * 100) * divisor;
            }
            if (temp >= (int) (AppConstants.PENNY_VALUE * 100)) {
                divisor = temp;
                for (int i = 0; i < divisor; i++) changeInCoins.add(AppConstants.PENNY_VALUE);
                temp -= divisor;
            }
        }
        return changeInCoins;
    }

    public ArrayList<String> returnChangeInCoins() {
        return convertNumberToCoins(money);
    }

    public ArrayList<String> convertNumberToCoins(double number) {
        ArrayList<String> changeInCoins = new ArrayList<>();
        int temp = (int) (number * 100);
        int divisor;

        while (temp > 0) {
            if (temp >= (int) (AppConstants.QUARTER_VALUE * 100)) {
                divisor = temp / (int) (AppConstants.QUARTER_VALUE * 100);
                for (int i = 0; i < divisor; i++) changeInCoins.add(Coin.QUARTER.getNAME());
                temp -= (int) (AppConstants.QUARTER_VALUE * 100) * divisor;
            }
            if (temp >= (int) (AppConstants.DIME_VALUE * 100)) {
                divisor = temp / (int) (AppConstants.DIME_VALUE * 100);
                for (int i = 0; i < divisor; i++) changeInCoins.add(Coin.DIME.getNAME());
                temp -= (int) (AppConstants.DIME_VALUE * 100) * divisor;
            }
            if (temp >= (int) (AppConstants.NICKEL_VALUE * 100)) {
                divisor = temp / (int) (AppConstants.NICKEL_VALUE * 100);
                for (int i = 0; i < divisor; i++) changeInCoins.add(Coin.NICKEL.getNAME());
                temp -= (int) (AppConstants.NICKEL_VALUE * 100) * divisor;
            }
            if (temp >= (int) (AppConstants.PENNY_VALUE * 100)) {
                divisor = temp;
                for (int i = 0; i < divisor; i++) changeInCoins.add(Coin.PENNY.getNAME());
                temp -= divisor;
            }
        }

        return changeInCoins;
    }

    /**End of compute change methods**/

    public double getMoney() {
        return money;
    }

    public String getDisplayMessage(){
        return displayMessage;
    }
}
