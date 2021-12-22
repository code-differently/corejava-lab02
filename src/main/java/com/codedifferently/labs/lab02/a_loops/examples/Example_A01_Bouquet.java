package com.codedifferently.labs.lab02.a_loops.examples;

public class Example_A01_Bouquet {
    public static void main(String[] args) {
        String[] myBouquet  = {"Rose", "Sunflower", "Daisy", "Dandelion", "Violet", "Lilly"};
        for(int index = 0; index < myBouquet.length; index++){
            System.out.println(myBouquet[index]);
        }
        for(String myFlower: myBouquet){
            System.out.println(myFlower);
        }
    }
}
