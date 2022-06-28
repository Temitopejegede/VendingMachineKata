package com.temi.VendingMachineFunctionality;

import com.temi.coins.Coin;
import com.temi.item.Item;
import com.temi.vendingMachineFunctionality.VendingMachine;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OutOfStockItemTests {

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
        String answer = myMachine.selectItem(Item.COLA);
        String expectedAnswer = "OUT OF STOCK";
        assertEquals(expectedAnswer, answer);
    }

    @Test
    void  GetAnItemWhenItsOutOfStockSecondTest(){
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
        String answer = myMachine.selectItem(Item.COLA);
        String expectedAnswer = "OUT OF STOCK";
        assertEquals(expectedAnswer, answer);
    }
}
