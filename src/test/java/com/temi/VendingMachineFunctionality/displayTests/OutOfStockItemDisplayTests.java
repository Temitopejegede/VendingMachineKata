package com.temi.VendingMachineFunctionality.displayTests;

import com.temi.coins.Coin;
import com.temi.item.Item;
import com.temi.vendingMachineFunctionality.VendingMachine;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OutOfStockItemDisplayTests {

    @Test
    void  GetAnItemWhenItsOutOfStockTest(){
        VendingMachine myMachine = new VendingMachine(2, 3, 4);
        ArrayList<Coin> inputCoins = new ArrayList<>();
        inputCoins.add(Coin.QUARTER);
        inputCoins.add(Coin.QUARTER);
        inputCoins.add(Coin.QUARTER);
        inputCoins.add(Coin.QUARTER);
        myMachine.inputCoins(inputCoins);
        myMachine.getHowMuchMoneyWasInserted(inputCoins);
        myMachine.selectItem(Item.COLA);
        myMachine.inputCoins(inputCoins);
        myMachine.getHowMuchMoneyWasInserted(inputCoins);
        myMachine.selectItem(Item.COLA);
        myMachine.getHowMuchMoneyWasInserted(inputCoins);
        myMachine.selectItem(Item.COLA);
        String answer = myMachine.getDisplayMessage();
        String expectedAnswer = "OUT OF STOCK";
        assertEquals(expectedAnswer, answer);
    }

    @Test
    void  GetAnItemWhenItsOutOfStockSecondTest(){
        VendingMachine myMachine = new VendingMachine(2, 3, 4);
        ArrayList<Coin> inputCoins = new ArrayList<>();
        inputCoins.add(Coin.QUARTER);
        inputCoins.add(Coin.QUARTER);
        myMachine.inputCoins(inputCoins);
        myMachine.getHowMuchMoneyWasInserted(inputCoins);
        myMachine.selectItem(Item.CHIPS);
        myMachine.inputCoins(inputCoins);
        myMachine.getHowMuchMoneyWasInserted(inputCoins);
        myMachine.selectItem(Item.CHIPS);
        myMachine.inputCoins(inputCoins);
        myMachine.getHowMuchMoneyWasInserted(inputCoins);
        myMachine.selectItem(Item.CHIPS);
        myMachine.inputCoins(inputCoins);
        myMachine.getHowMuchMoneyWasInserted(inputCoins);
        myMachine.selectItem(Item.CHIPS);
        String answer = myMachine.getDisplayMessage();
        String expectedAnswer = "OUT OF STOCK";
        assertEquals(expectedAnswer, answer);
    }

    @Test
    void  GetAnItemWhenItsOutOfStockThirdTest(){
        VendingMachine myMachine = new VendingMachine(2, 3, 4);
        ArrayList<Coin> inputCoins = new ArrayList<>();
        inputCoins.add(Coin.QUARTER);
        inputCoins.add(Coin.QUARTER);
        inputCoins.add(Coin.DIME);
        inputCoins.add(Coin.NICKEL);
        myMachine.inputCoins(inputCoins);
        myMachine.getHowMuchMoneyWasInserted(inputCoins);
        myMachine.selectItem(Item.CANDY);
        myMachine.inputCoins(inputCoins);
        myMachine.getHowMuchMoneyWasInserted(inputCoins);
        myMachine.selectItem(Item.CANDY);
        myMachine.inputCoins(inputCoins);
        myMachine.getHowMuchMoneyWasInserted(inputCoins);
        myMachine.selectItem(Item.CANDY);
        myMachine.inputCoins(inputCoins);
        myMachine.getHowMuchMoneyWasInserted(inputCoins);
        myMachine.selectItem(Item.CANDY);
        myMachine.inputCoins(inputCoins);
        myMachine.getHowMuchMoneyWasInserted(inputCoins);
        myMachine.selectItem(Item.CANDY);
        String answer = myMachine.getDisplayMessage();
        String expectedAnswer = "OUT OF STOCK";
        assertEquals(expectedAnswer, answer);
    }
}
