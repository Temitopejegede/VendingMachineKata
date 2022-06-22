package com.temi.VendingMachineFunctionality;

import com.temi.coins.*;
import com.temi.vendingMachineFunctionality.VendingMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValueOfCoinTests {

    @Test
    void testValueOfCoinWhenCoinIsPenny(){
        Coin inputCoin = Coin.PENNY;
        VendingMachine myMachine = new VendingMachine();
        Coin actualCoin = myMachine.measureCoinDimensions(inputCoin);
        assertEquals(0.01, myMachine.getCoinValue(inputCoin));
    }

    @Test
    void testValueOfCoinWhenCoinIsNICKEL(){
        Coin inputCoin = Coin.NICKEL;
        VendingMachine myMachine = new VendingMachine();
        Coin actualCoin = myMachine.measureCoinDimensions(inputCoin);
        assertEquals(0.05, myMachine.getCoinValue(inputCoin));
    }

    @Test
    void testValueOfCoinWhenCoinIsDIME(){
        Coin inputCoin = Coin.DIME;
        VendingMachine myMachine = new VendingMachine();
        Coin actualCoin = myMachine.measureCoinDimensions(inputCoin);
        assertEquals(0.10, myMachine.getCoinValue(inputCoin));
    }

    @Test
    void testValueOfCoinWhenCoinIsQUARTER(){
        Coin inputCoin = Coin.QUARTER;
        VendingMachine myMachine = new VendingMachine();
        Coin actualCoin = myMachine.measureCoinDimensions(inputCoin);
        assertEquals(0.25, myMachine.getCoinValue(inputCoin));
    }
}
