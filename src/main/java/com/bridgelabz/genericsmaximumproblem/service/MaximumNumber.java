package com.bridgelabz.genericsmaximumproblem.service;

public class MaximumNumber {

    public int maximumValue(Integer firstNumber,Integer secondNumber,Integer thirdNUmber)
    {
        if (firstNumber.compareTo(secondNumber) > 0 && firstNumber.compareTo(thirdNUmber) > 0)
            return firstNumber;
        else if (secondNumber.compareTo(thirdNUmber) > 0 && secondNumber.compareTo(firstNumber) > 0)
            return secondNumber;
        else
            return thirdNUmber;
    }


}

