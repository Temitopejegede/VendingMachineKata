package com.temi.inputs;

import com.temi.coins.Coin;

import java.util.ArrayList;
import java.util.Random;

public class Inputs {
    public Inputs() {
        generateRandomCoins();
        generateOnlyValidCoins();
    }

    public ArrayList<Coin> generateRandomCoins() {
        ArrayList<Coin> coins = new ArrayList<>();
        Coin[] typesOfCoins = Coin.values();
        Random rand = new Random();
        int numberOfCoins = rand.nextInt(3) + 5;
        for (int i = 0; i < numberOfCoins; i++) {
            coins.add(typesOfCoins[rand.nextInt(4)]);
        }
        return coins;
    }

    public ArrayList<Coin> generateOnlyValidCoins() {
        ArrayList<Coin> coins = new ArrayList<>();
        Coin[] typesOfCoins = Coin.values();
        Random rand = new Random();
        int numberOfCoins = rand.nextInt(3) + 5;
        for (int i = 0; i < numberOfCoins; i++) {
            coins.add(typesOfCoins[rand.nextInt(3) + 1]);
        }
        return coins;
    }
}
