package com.company;

import java.util.ArrayList;

/**
 * Created by student on 05.04.2017.
 */
public class SetOfDrinks {
    public static ArrayList<Coffe> getAllDrinks() {
        return allDrinks;
    }

    public static void setAllDrinks(ArrayList<Coffe> allDrinks) {
        SetOfDrinks.allDrinks = allDrinks;
    }

    public Coffe newDrink(String name, int price){
        Coffe newDrink = new Coffe();
        newDrink.setName(name);
        newDrink.setPrice(price);
        return newDrink;
    }

    public static ArrayList<Coffe> allDrinks;

    public static ArrayList<Coffe> setDrinks(){
        ArrayList<Coffe> setOfDrinks = new ArrayList<Coffe>();
        Coffe newDrink = new Coffe();
        setOfDrinks.add(newDrink("Espresso",600));
        setOfDrinks.add(newDrink("Americano", 700));
        setOfDrinks.add(newDrink("AmerikanoMilk",800));
        setOfDrinks.add(newDrink("Cappuchino",900));
        setOfDrinks.add(newDrink("Latte",1000));
        return setOfDrinks;
    }



    public static ArrayList<Coffe> avaliabaleSet(int amount,ArrayList<Coffe> setOfDrinks){
        int a = amount;
        ArrayList<Coffe> avalibale = new ArrayList<Coffe>();
        for(int i = 0; i < setOfDrinks.size(); i++){
            if(setOfDrinks.get(i).getPrice() <= amount){
                avalibale.add(setOfDrinks.get(i));

            } else {
                System.out.printf("Not enough money");
            }

        }

        return avalibale;
    }
}
