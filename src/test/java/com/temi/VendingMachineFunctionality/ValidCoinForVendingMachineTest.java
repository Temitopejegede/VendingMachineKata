package com.temi.VendingMachineFunctionality;

import com.temi.coins.Coin;
import com.temi.vendingMachineFunctionality.VendingMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidCoinForVendingMachineTest {

    @Test
    void checkIfCoinIsValid(){
        Coin myCoin = Coin.QUARTER;
        VendingMachine myMachine = new VendingMachine();
        assertTrue(myMachine.checkIfCoinIsValidForVendingMachine(myCoin));
    }

    @Test
    void checkIfCoinIsInvalid(){
        Coin myCoin = Coin.PENNY;
        VendingMachine myMachine = new VendingMachine();
        assertFalse(myMachine.checkIfCoinIsValidForVendingMachine(myCoin));
    }
}
