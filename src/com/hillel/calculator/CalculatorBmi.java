package com.hillel.calculator;

public class CalculatorBmi {
    public void calcBmi(double weight, double height) {

        if (weight <= 0 || weight > 130) {
            System.out.println("weight is invalid");
            return;
        }
        {
            if (height <= 0 || height > 3.1) {
                System.out.println("height is invalid");
                return;
            }
        }


        System.out.println(weight / (height * height));
    }

}

