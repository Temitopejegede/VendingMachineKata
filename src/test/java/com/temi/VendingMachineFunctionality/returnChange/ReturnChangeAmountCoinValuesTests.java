package com.temi.VendingMachineFunctionality.returnChange;

import com.temi.coins.Coin;
import com.temi.inputs.Inputs;
import com.temi.item.Item;
import com.temi.vendingMachineFunctionality.VendingMachine;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReturnChangeAmountCoinValuesTests {

    @Test
    void returnChangeAmountCoinValueFirstTest(){
        VendingMachine myMachine = new VendingMachine();
        ArrayList<Coin> myInput = new ArrayList<>();
        myInput.add(Coin.QUARTER);
        myInput.add(Coin.QUARTER);
        myInput.add(Coin.QUARTER);
        myInput.add(Coin.QUARTER);
        myMachine.selectItem(Item.COLA);
        ArrayList<Double> change = myMachine.returnChangeAmount();
        ArrayList<Double> answer = new ArrayList<>();
        assertEquals(answer, change);
    }

    @Test
    void returnChangeAmountCoinValueSecondTest(){
        VendingMachine myMachine = new VendingMachine();
        ArrayList<Coin> myInput = new ArrayList<>();
        myInput.add(Coin.QUARTER);
        myInput.add(Coin.QUARTER);
        myInput.add(Coin.QUARTER);
        myInput.add(Coin.QUARTER);
        myInput.add(Coin.QUARTER);
        myInput.add(Coin.QUARTER);
        myMachine.selectItem(Item.COLA);
        ArrayList<Double> change = myMachine.returnChangeAmount();
        ArrayList<Double> answer = new ArrayList<>();
        answer.add(0.25);
        answer.add(0.25);
        assertEquals(answer, change);
    }

    @Test
    void returnChangeAmountCoinValueThirdTest(){
        VendingMachine myMachine = new VendingMachine();
        ArrayList<Coin> myInput = new ArrayList<>();
        myInput.add(Coin.QUARTER);
        myInput.add(Coin.QUARTER);
        myInput.add(Coin.QUARTER);
        myInput.add(Coin.QUARTER);
        myInput.add(Coin.QUARTER);
        myInput.add(Coin.PENNY);
        myInput.add(Coin.PENNY);
        myMachine.selectItem(Item.COLA);
        ArrayList<Double> change = myMachine.returnChangeAmount();
        ArrayList<Double> answer = new ArrayList<>();
        answer.add(0.25);
        assertEquals(answer, change);
    }
}
