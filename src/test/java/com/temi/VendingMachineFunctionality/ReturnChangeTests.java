package com.temi.VendingMachineFunctionality;

import com.temi.coins.Coin;
import com.temi.item.Item;
import com.temi.vendingMachineFunctionality.VendingMachine;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReturnChangeTests {

    @Test
    void testReturnChangeWhenThereIsNone(){
        ArrayList<Coin> money = new ArrayList<>();
        money.add(Coin.QUARTER);
        money.add(Coin.QUARTER);
        money.add(Coin.QUARTER);
        money.add(Coin.QUARTER);
        money.add(Coin.QUARTER);
//        money.add(Coin.NICKEL);
//        money.add(Coin.DIME);
//        money.add(Coin.NICKEL);
        VendingMachine myMachine = new VendingMachine();
        ArrayList<Coin> userInput = myMachine.inputCoins(money);
        double inputMoney = myMachine.getHowMuchMoneyWasInserted(userInput);
        myMachine.selectItem(Item.COLA);
        ArrayList<Double> change = myMachine.returnChangeAmount();
        ArrayList<Double> answer = new ArrayList<>();
        answer.add(0.25);
        assertEquals(answer, change);
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
    void testReturnChangeNumberSecondTest(){
        ArrayList<Coin> money = new ArrayList<>(); //$1.45
        money.add(Coin.QUARTER);
        money.add(Coin.QUARTER);
        money.add(Coin.QUARTER);
        money.add(Coin.QUARTER);
        money.add(Coin.QUARTER);
        money.add(Coin.NICKEL); //0.05
        money.add(Coin.DIME); //0.10
        money.add(Coin.NICKEL);
        VendingMachine myMachine = new VendingMachine();
        ArrayList<Coin> userInput = myMachine.inputCoins(money);
        double inputMoney = myMachine.getHowMuchMoneyWasInserted(userInput);
        myMachine.selectItem(Item.COLA);
        double change = myMachine.returnChangeNumber();
        assertEquals(0.45, Math.round(change*100)/100D);

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
        money.add(Coin.NICKEL); //0.05
        money.add(Coin.DIME); //0.10
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
        ArrayList<Coin> money = new ArrayList<>();
        VendingMachine myMachine = new VendingMachine();
        ArrayList<Coin> userInput = myMachine.inputCoins(money);
        double inputMoney = myMachine.getHowMuchMoneyWasInserted(userInput);
        ArrayList<Coin> change = myMachine.returnChangeInCoins(inputMoney);
        assertEquals(0, change);
    }

    @Test
    void testReturnChangeTest3(){
        ArrayList<Coin> money = new ArrayList<>();
        VendingMachine myMachine = new VendingMachine();
        ArrayList<Coin> userInput = myMachine.inputCoins(money);
        double inputMoney = myMachine.getHowMuchMoneyWasInserted(userInput);
        ArrayList<Coin> change = myMachine.returnChangeInCoins(inputMoney);
        assertEquals(0, change);
    }

}
