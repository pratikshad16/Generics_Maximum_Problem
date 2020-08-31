package com.bridgelabz.genericsmaximumproblem.service;

public class MaximumNumber {
    public <E extends Comparable> E maximumValue(E[] array) {
        E max = array[0];
        for (int element = 0; element < array.length; element++) {
            if (array[element].compareTo(max) > 0)
                max = array[element];
        }
        return max;
    }

}

