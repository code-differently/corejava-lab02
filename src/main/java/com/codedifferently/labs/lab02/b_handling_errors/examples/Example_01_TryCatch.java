package com.codedifferently.labs.lab02.b_handling_errors.examples;

import java.util.Scanner;

public class Example_01_TryCatch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10");
        int value = in.nextInt();
        try{
            if (value >10 || value < 0 )
                throw new Exception("Index " + value + " is out of bounds!");
        } catch (Exception e){
            if(value > 10)
                value -= 10;
            else
                value += 10;
        }
        System.out.println("Index " + value + " is in bounds");
    }
}
