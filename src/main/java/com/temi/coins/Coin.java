package com.temi.coins;

public enum Coin {
    PENNY("2.5", "19.05", "1.52", "plain", "0"),
    NICKEL("5.0", "21.21", "1.95", "plain", "0"),
    DIME("2.268", "17.91", "1.35", "reeded", "118"),
    QUARTER("5.670", "24.26", "1.75", "reeded", "119");

    private final String WEIGHT;
    private final String DIAMETER;
    private final String THICKNESS;

    private final String EDGE;
    private final String NUMBEROFREEDS;

    Coin(String WEIGHT, String DIAMETER, String THICKNESS, String EDGE, String NUMBEROFREEDS){
        this.WEIGHT = WEIGHT;
        this.DIAMETER = DIAMETER;
        this.THICKNESS = THICKNESS;
        this.EDGE = EDGE;
        this.NUMBEROFREEDS = NUMBEROFREEDS;
    }

    public String getWEIGHT() {
        return WEIGHT;
    }

    public String getDIAMETER() {
        return DIAMETER;
    }

    public String getTHICKNESS() {
        return THICKNESS;
    }

    public String getEDGE() {
        return EDGE;
    }

    public String getNUMBEROFREEDS() {
        return NUMBEROFREEDS;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "WEIGHT=" + WEIGHT +
                ", DIAMETER=" + DIAMETER +
                ", THICKNESS=" + THICKNESS +
                ", EDGE='" + EDGE + '\'' +
                ", NUMBEROFREEDS=" + NUMBEROFREEDS +
                '}';
    }
}
