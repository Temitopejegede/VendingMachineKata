package com.temi.VendingMachineFunctionality.displayTests;

import com.temi.coins.Coin;
import com.temi.item.Item;
import com.temi.vendingMachineFunctionality.VendingMachine;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VendingMachineDisplayTests {

    @Test
    void checkDisplayWhenNothingHasBeenPurchased(){
        VendingMachine myMachine = new VendingMachine();
        assertEquals("INSERT COIN", myMachine.getDisplayMessage());
    }

    @Test
    void checkDisplayWhenMoneyInsertedIsNotEnough(){
        VendingMachine myMachine = new VendingMachine();
        myMachine.selectItem(Item.COLA);
        assertEquals("PRICE: 1.0", myMachine.getDisplayMessage());
    }

    @Test
    void checkDisplayWhenMoneyIsNotEnough(){
        VendingMachine myMachine = new VendingMachine();
        ArrayList<Coin> myCoins = new ArrayList<>();
        myCoins.add(Coin.QUARTER);
        myCoins.add(Coin.QUARTER);
        myMachine.selectItem(Item.COLA);
        assertEquals("PRICE: 1.0", myMachine.getDisplayMessage());
    }

    @Test
    void checkDisplayWhenMoneyIsEnough(){
        VendingMachine myMachine = new VendingMachine();
        ArrayList<Coin> myCoins = new ArrayList<>();
        myCoins.add(Coin.QUARTER);
        myCoins.add(Coin.QUARTER);
        myCoins.add(Coin.QUARTER);
        myCoins.add(Coin.QUARTER);
        myMachine.getHowMuchMoneyWasInserted(myCoins);
        myMachine.selectItem(Item.COLA);
        assertEquals("THANK YOU", myMachine.getDisplayMessage());
    }


}
