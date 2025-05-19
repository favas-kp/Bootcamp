package com.math.probability;

public class Probability {
    private final int favorable;
    private final int total;

    private Probability(int favorable, int total) {
        this.favorable = favorable;
        this.total = total;
    }

    public static Probability fromValues(int favorable, int total) {
        if (favorable > total) throw new InvalidValuesException("Values are invalid");

        return new Probability(favorable, total);
    }

    public double favorProbability() {
        return (double) favorable / total;
    }

    public double nonFavorProbability() {
        return 1 - ((double) favorable / total);
    }
}
