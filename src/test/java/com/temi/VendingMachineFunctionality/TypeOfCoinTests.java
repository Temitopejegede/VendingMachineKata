package com.temi.VendingMachineFunctionality;

import com.temi.coins.Coin;
import com.temi.vendingMachineFunctionality.VendingMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TypeOfCoinTests {

    @Test
     void testTypeOfCoinWhenExpectedCoinIsPenny(){
        Coin inputCoin = Coin.PENNY;
        VendingMachine myMachine = new VendingMachine();
        Coin expectedCoin = myMachine.measureCoinDimensions(inputCoin);
        assertEquals(Coin.PENNY, expectedCoin);
    }

    private void testTypeOfCoinWhenExpectedCoinIsDime(){
        Coin inputCoin = Coin.DIME;
        VendingMachine myMachine = new VendingMachine();
        Coin expectedCoin = myMachine.measureCoinDimensions(inputCoin);
        assertEquals(Coin.PENNY, expectedCoin);
    }

    private void testTypeOfCoinWhenExpectedCoinIsNickel(){
        Coin inputCoin = Coin.NICKEL;
        VendingMachine myMachine = new VendingMachine();
        Coin expectedCoin = myMachine.measureCoinDimensions(inputCoin);
        assertEquals(Coin.PENNY, expectedCoin);
    }

    private void testTypeOfCoinWhenExpectedCoinIsQuarter(){
        Coin inputCoin = Coin.QUARTER;
        VendingMachine myMachine = new VendingMachine();
        Coin expectedCoin = myMachine.measureCoinDimensions(inputCoin);
        assertEquals(Coin.PENNY, expectedCoin);
    }
}
