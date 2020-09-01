package com.bridgelabz.genericsmaximumproblem.service;

public class MaximumNumber<E extends Comparable> {
    E firstValue;
    E secondValue;
    E thirdValue;

    public MaximumNumber(E firstValue, E secondValue, E thirdValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    public static <E extends Comparable> E maximumValue(E firstValue, E secondValue, E thirdValue) {

        if (firstValue.compareTo(secondValue) > 0 && firstValue.compareTo(thirdValue) > 0)
            return firstValue;
        else if (secondValue.compareTo(thirdValue) > 0)
            return secondValue;
        else
            return thirdValue;
    }
}


