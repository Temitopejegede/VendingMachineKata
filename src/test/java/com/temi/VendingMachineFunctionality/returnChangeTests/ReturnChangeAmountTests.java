package com.temi.VendingMachineFunctionality.returnChangeTests;

import com.temi.coins.Coin;
import com.temi.item.Item;
import com.temi.vendingMachineFunctionality.VendingMachine;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReturnChangeAmountTests {

    @Test
    void testReturnChangeNumberWhenTheChangeIsZero(){
        ArrayList<Coin> money = new ArrayList<>();
        money.add(Coin.QUARTER);
        money.add(Coin.QUARTER);
        money.add(Coin.QUARTER);
        money.add(Coin.QUARTER);
        VendingMachine myMachine = new VendingMachine();
        ArrayList<Coin> userInput = myMachine.inputCoins(money);
        double inputMoney = myMachine.getHowMuchMoneyWasInserted(userInput);
        myMachine.selectItem(Item.COLA);
        double change = myMachine.returnChangeNumber();
        assertEquals(0, change);
    }

    @Test
    void testReturnChangeNumberFirstTest(){
        ArrayList<Coin> money = new ArrayList<>();
        money.add(Coin.QUARTER);
        money.add(Coin.QUARTER);
        money.add(Coin.QUARTER);
        money.add(Coin.QUARTER);
        money.add(Coin.QUARTER);
        money.add(Coin.QUARTER);
        money.add(Coin.NICKEL);
        money.add(Coin.PENNY);
        VendingMachine myMachine = new VendingMachine();
        ArrayList<Coin> userInput = myMachine.inputCoins(money);
        double inputMoney = myMachine.getHowMuchMoneyWasInserted(userInput);
        myMachine.selectItem(Item.COLA);
        double change = myMachine.returnChangeNumber();
        assertEquals(0.55, change);
    }

    @Test
    void testReturnChangeNumberSecondTest(){
        ArrayList<Coin> money = new ArrayList<>();
        money.add(Coin.QUARTER);
        money.add(Coin.QUARTER);
        money.add(Coin.QUARTER);
        money.add(Coin.QUARTER);
        money.add(Coin.QUARTER);
        money.add(Coin.QUARTER);
        money.add(Coin.QUARTER);
        money.add(Coin.DIME);
        money.add(Coin.NICKEL);
        money.add(Coin.NICKEL);
        money.add(Coin.PENNY);
        money.add(Coin.PENNY);
        money.add(Coin.PENNY);
        money.add(Coin.PENNY);
        money.add(Coin.PENNY);
        VendingMachine myMachine = new VendingMachine();
        ArrayList<Coin> userInput = myMachine.inputCoins(money);
        double inputMoney = myMachine.getHowMuchMoneyWasInserted(userInput);
        myMachine.selectItem(Item.COLA);
        double change = myMachine.returnChangeNumber();
        assertEquals(0.95, Math.round(change*100)/100D);
    }

    @Test
    void testReturnChangeNumber(){
        ArrayList<Coin> money = new ArrayList<>();
        money.add(Coin.QUARTER);
        money.add(Coin.QUARTER);
        money.add(Coin.QUARTER);
        money.add(Coin.QUARTER);
        money.add(Coin.QUARTER);
        VendingMachine myMachine = new VendingMachine();
        ArrayList<Coin> userInput = myMachine.inputCoins(money);
        double inputMoney = myMachine.getHowMuchMoneyWasInserted(userInput);
        myMachine.selectItem(Item.COLA);
        double change = myMachine.returnChangeNumber();
        assertEquals(0.25, change);
    }

    @Test
    void testReturnChangeTest1(){
        ArrayList<Coin> money = new ArrayList<>(); //$1.70
        money.add(Coin.QUARTER);
        money.add(Coin.QUARTER);
        money.add(Coin.QUARTER);
        money.add(Coin.QUARTER);
        money.add(Coin.QUARTER);
        money.add(Coin.QUARTER);
        money.add(Coin.DIME); //0.10
        money.add(Coin.NICKEL); //0.05
        money.add(Coin.NICKEL);
        VendingMachine myMachine = new VendingMachine();
        ArrayList<Coin> userInput = myMachine.inputCoins(money);
        double inputMoney = myMachine.getHowMuchMoneyWasInserted(userInput);
        myMachine.selectItem(Item.COLA);
        ArrayList<Double> change = myMachine.returnChangeAmount();
        ArrayList<Double> answer = new ArrayList<>();
        answer.add(0.25);
        answer.add(0.25);
        answer.add(0.10);
        answer.add(0.10);
        assertEquals(answer, change);
    }

    @Test
    void testReturnChangeTest2(){
        ArrayList<Coin> money = new ArrayList<>(); //$1.70
        money.add(Coin.QUARTER);
        money.add(Coin.QUARTER);
        money.add(Coin.QUARTER);
        money.add(Coin.QUARTER);
        money.add(Coin.QUARTER);
        money.add(Coin.QUARTER);
        money.add(Coin.DIME); //0.10
        money.add(Coin.NICKEL); //0.05
        money.add(Coin.NICKEL);
        VendingMachine myMachine = new VendingMachine();
        ArrayList<Coin> userInput = myMachine.inputCoins(money);
        double inputMoney = myMachine.getHowMuchMoneyWasInserted(userInput);
        myMachine.selectItem(Item.COLA);
        ArrayList<String> change = myMachine.returnChangeInCoins();
        ArrayList<String> answer = new ArrayList<>();
        answer.add(Coin.QUARTER.getNAME());
        answer.add(Coin.QUARTER.getNAME());
        answer.add(Coin.DIME.getNAME());
        answer.add(Coin.DIME.getNAME());
        assertEquals(answer, change);
    }


}
