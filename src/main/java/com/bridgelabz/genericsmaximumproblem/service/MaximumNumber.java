package com.bridgelabz.genericsmaximumproblem.service;

public class MaximumNumber {

    public Integer maximumIntegerValue(Integer firstNumber,Integer secondNumber,Integer thirdNumber)
    {
        if (firstNumber.compareTo(secondNumber) > 0 && firstNumber.compareTo(thirdNumber) > 0)
            return firstNumber;
        else if (secondNumber.compareTo(thirdNumber) > 0 && secondNumber.compareTo(firstNumber) > 0)
            return secondNumber;
        else
            return thirdNumber;
    }
    public Float maximumFloatValue(Float firstNumber,Float secondNumber,Float thirdNumber)
    {
        if (firstNumber.compareTo(secondNumber) > 0 && firstNumber.compareTo(thirdNumber) > 0)
            return firstNumber;
        else if (secondNumber.compareTo(thirdNumber) > 0 && secondNumber.compareTo(firstNumber) > 0)
            return secondNumber;
        else
            return thirdNumber;
    }

}

