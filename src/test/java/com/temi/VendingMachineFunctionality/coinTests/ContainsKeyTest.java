package com.temi.VendingMachineFunctionality.coinTests;

import com.temi.coins.Coin;
import com.temi.vendingMachineFunctionality.VendingMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContainsKeyTest {

    @Test
    void containsKeyWhenKeyIsPennyTest(){
        Coin myCoin = Coin.PENNY;
        VendingMachine myMachine = new VendingMachine();
        assertTrue(myMachine.checkIfCoinTypeExists(myCoin));
    }

    @Test
    void containsKeyWhenKeyIsDimeTest(){
        Coin myCoin = Coin.DIME;
        VendingMachine myMachine = new VendingMachine();
        assertTrue(myMachine.checkIfCoinTypeExists(myCoin));
    }

    @Test
    void containsKeyWhenKeyIsNickelTest(){
        Coin myCoin = Coin.NICKEL;
        VendingMachine myMachine = new VendingMachine();
        assertTrue(myMachine.checkIfCoinTypeExists(myCoin));
    }

    @Test
    void containsKeyWhenKeyIsQuarterTest(){
        Coin myCoin = Coin.QUARTER;
        VendingMachine myMachine = new VendingMachine();
        assertTrue(myMachine.checkIfCoinTypeExists(myCoin));
    }
}
