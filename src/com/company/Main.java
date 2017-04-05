package com.company;

import java.util.ArrayList;

public class Main {




    public static void main(String[] args) {
    int amount = 600;
    ArrayList<Coffe> allDrinks = new SetOfDrinks().setDrinks();
    for (Coffe cheked: allDrinks){
        System.out.println("You can buy "+cheked+" your rest is "+(amount - cheked.getPrice()));

    }


    }
}
