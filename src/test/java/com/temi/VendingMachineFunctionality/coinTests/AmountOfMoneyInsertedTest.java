package com.temi.VendingMachineFunctionality.coinTests;

import com.temi.coins.Coin;
import com.temi.vendingMachineFunctionality.VendingMachine;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AmountOfMoneyInsertedTest {

    @Test
    void checkHowMuchMoneyWasInsertedTest(){
        VendingMachine myMachine = new VendingMachine();
        ArrayList<Coin> inputCoins = new ArrayList<>();
        inputCoins.add(Coin.QUARTER);
        inputCoins.add(Coin.QUARTER);
        inputCoins.add(Coin.QUARTER);
        inputCoins.add(Coin.QUARTER);
        inputCoins.add(Coin.QUARTER);
        double money = myMachine.getHowMuchMoneyWasInserted(inputCoins);
        assertEquals(1.25, money);
    }

    @Test
    void checkHowMuchMoneyWasInsertedSecondTest(){
        VendingMachine myMachine = new VendingMachine();
        ArrayList<Coin> inputCoins = new ArrayList<>();
        inputCoins.add(Coin.QUARTER);
        inputCoins.add(Coin.DIME);
        inputCoins.add(Coin.QUARTER);
        inputCoins.add(Coin.NICKEL);
        inputCoins.add(Coin.QUARTER);
        double money = myMachine.getHowMuchMoneyWasInserted(inputCoins);
        assertEquals(0.90, money);
    }

    @Test
    void checkHowMuchMoneyWasInsertedThirdTest(){
        VendingMachine myMachine = new VendingMachine();
        ArrayList<Coin> inputCoins = new ArrayList<>();
        inputCoins.add(Coin.QUARTER);
        inputCoins.add(Coin.DIME);
        inputCoins.add(Coin.QUARTER);
        inputCoins.add(Coin.NICKEL);
        inputCoins.add(Coin.QUARTER);
        inputCoins.add(Coin.PENNY);
        double money = myMachine.getHowMuchMoneyWasInserted(inputCoins);
        assertEquals(0.90, money);
    }

    @Test
    void checkHowMuchMoneyWasInsertedFourthTest(){
        VendingMachine myMachine = new VendingMachine();
        ArrayList<Coin> inputCoins = new ArrayList<>();
        inputCoins.add(Coin.PENNY);
        inputCoins.add(Coin.PENNY);
        inputCoins.add(Coin.PENNY);
        inputCoins.add(Coin.PENNY);
        inputCoins.add(Coin.PENNY);
        inputCoins.add(Coin.PENNY);
        double money = myMachine.getHowMuchMoneyWasInserted(inputCoins);
        assertEquals(0, money);
    }
}
