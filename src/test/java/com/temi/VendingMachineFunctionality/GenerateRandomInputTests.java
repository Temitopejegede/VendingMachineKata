package com.temi.VendingMachineFunctionality;

import com.temi.coins.Coin;
import com.temi.inputs.Inputs;
import com.temi.vendingMachineFunctionality.VendingMachine;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class GenerateRandomInputTests {

    @Test
    void testGenerateRandomCoin(){
        Inputs myInputs = new Inputs();
        ArrayList<Coin> testInput = myInputs.generateRandomCoins();
        assertTrue(testInput.size() >=5 && testInput.size() <= 7);

    }
    @Test
    void testGenerateOnlyValidCoins(){
        Inputs myInputs = new Inputs();
        ArrayList<Coin> testInput = myInputs.generateOnlyValidCoins();
        assertFalse(testInput.contains(Coin.PENNY));
    }
}
