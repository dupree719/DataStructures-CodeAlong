package datastructures;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<String> colorsUnmodifiable = List.of(
                "blue",
                "purple"

        );
        //Declaring a new list of type ArrayList
        List<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("purple");
        colors.add("red");
        System.out.println(colors.contains("red")); //true
        System.out.println(colors.size()); //3
//        colors.add(1);
//        colors.add(new Object());

        //Below are 3 ways to loop through array

        //Enhanced For Loop
        for (String color : colors){
            System.out.println(color);
        }
        //Using forEach method
        colors.forEach(System.out::println);

        //Regular for loop, ArrayList style (must use .size and .get(arrayName[i])
        for(int i =0; i < colors.size(); i++){
            System.out.println(colors.get(i));
    }


    }
}
