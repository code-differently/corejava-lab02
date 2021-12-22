package com.codedifferently.labs.lab02.a_loops.examples;

import java.util.Scanner;

public class Example_A02_TwoDTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] nums = new int[3][2];
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                System.out.println("Enter a value for row " + i + ", column " + j);
                nums[i][j] = in.nextInt();
            }
        }
    }
}
