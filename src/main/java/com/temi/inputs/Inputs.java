package com.temi.inputs;

import com.temi.coins.Coin;

import java.util.ArrayList;
import java.util.Random;

public class Inputs {

    ArrayList<Coin> coins = new ArrayList<>();
    Coin[] typesOfCoins = Coin.values();

    public Inputs() {
        generateRandomCoins();
    }


    public ArrayList<Coin> generateRandomCoins(){
        Random rand = new Random();
        int numberOfCoins = rand.nextInt(7 - 5)+ 5;
        for(int i = 0; i < numberOfCoins; i++){
            int index = rand.nextInt(5);
            coins.add(typesOfCoins[index]);
        }
        return coins;
    }
}
