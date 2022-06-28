package com.temi.VendingMachineFunctionality.returnChange;

import com.temi.coins.Coin;
import com.temi.item.Item;
import com.temi.vendingMachineFunctionality.VendingMachine;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReturnChangeInCoinsTests {

    @Test
    void returnChangeInCoinsFirstTest(){
        VendingMachine myMachine = new VendingMachine();
        ArrayList<Coin> myInput = new ArrayList<>();
        myInput.add(Coin.QUARTER);
        myInput.add(Coin.QUARTER);
        myInput.add(Coin.QUARTER);
        myInput.add(Coin.QUARTER);
        myInput.add(Coin.QUARTER);
        myInput.add(Coin.DIME);
        myInput.add(Coin.NICKEL);
        ArrayList<Coin> userInput = myMachine.inputCoins(myInput);
        double inputMoney = myMachine.getHowMuchMoneyWasInserted(userInput);
        myMachine.selectItem(Item.COLA);
        ArrayList<String> change = myMachine.returnChangeInCoins();
        ArrayList<String> expectedChange = new ArrayList<>();
        expectedChange.add("QUARTER");
        expectedChange.add("DIME");
        expectedChange.add("NICKEL");
        assertEquals(expectedChange, change);
    }

    @Test
    void returnChangeInCoinsSecondTest(){
        VendingMachine myMachine = new VendingMachine();
        ArrayList<Coin> myInput = new ArrayList<>();
        myInput.add(Coin.QUARTER);
        myInput.add(Coin.QUARTER);
        myInput.add(Coin.QUARTER);
        myInput.add(Coin.QUARTER);
        ArrayList<Coin> userInput = myMachine.inputCoins(myInput);
        double inputMoney = myMachine.getHowMuchMoneyWasInserted(userInput);
        myMachine.selectItem(Item.COLA);
        ArrayList<String> change = myMachine.returnChangeInCoins();
        ArrayList<String> expectedChange = new ArrayList<>();
        assertEquals(expectedChange, change);
    }

    @Test
    void returnChangeInCoinsThirdTest(){
        VendingMachine myMachine = new VendingMachine();
        ArrayList<Coin> myInput = new ArrayList<>();
        myInput.add(Coin.QUARTER);
        myInput.add(Coin.QUARTER);
        myInput.add(Coin.QUARTER);
        myInput.add(Coin.QUARTER);
        myInput.add(Coin.PENNY);
        myInput.add(Coin.PENNY);
        ArrayList<Coin> userInput = myMachine.inputCoins(myInput);
        double inputMoney = myMachine.getHowMuchMoneyWasInserted(userInput);
        myMachine.selectItem(Item.COLA);
        ArrayList<String> change = myMachine.returnChangeInCoins();
        ArrayList<String> expectedChange = new ArrayList<>();
        assertEquals(expectedChange, change);
    }
}
