package com.bridgelabz.genericsmaximumproblem.service;

import java.util.Arrays;
import java.util.Collections;

public class MaximumNumber<E extends Comparable> {
    E firstValue;
    E secondValue;
    E thirdValue;

    public MaximumNumber(E firstValue, E secondValue, E thirdValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    public static <E extends Comparable> E maximumValue(E firstValue, E secondValue, E thirdValue, E... parameters) {
        E maxResult = firstValue;
        if (secondValue.compareTo(maxResult) > 0) {
            maxResult = secondValue;
        }
        if (thirdValue.compareTo(maxResult) > 0) {
            maxResult = thirdValue;
        }
        if (parameters.length != 0) {
            Arrays.sort(parameters, Collections.reverseOrder());
            if (maxResult.compareTo(parameters[0]) < 0) {
                maxResult = parameters[0];
            }
        }
        return maxResult;
    }

    public E maximumValue() {
        E maxValue = maximumValue(firstValue, secondValue, thirdValue);
        printMaxValue(maxValue);
        return maxValue;
    }

    public void printMaxValue(E maxValue) {
        System.out.println(maxValue);
    }
}



