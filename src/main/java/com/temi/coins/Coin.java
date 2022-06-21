package com.temi.coins;

public enum Coin {
    PENNY(2.5, 19.05, 1.52, "plain", 0),
    NICKEL(5.0, 21.21, 1.95, "plain", 0),
    DIME(2.268, 17.91, 1.35, "reeded", 118),
    QUARTER(5.670, 24.26, 1.75, "reeded", 119);

    private final double WEIGHT;
    private final double DIAMETER;
    private final double THICKNESS;
    private final String EDGE;
    private final int NUMBEROFREEDS;

    Coin(double WEIGHT, double DIAMETER, double THICKNESS, String EDGE, int NUMBEROFREEDS){
        this.WEIGHT = WEIGHT;
        this.DIAMETER = DIAMETER;
        this.THICKNESS = THICKNESS;
        this.EDGE = EDGE;
        this.NUMBEROFREEDS = NUMBEROFREEDS;
    }
}
