package datastructures;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";
        colors[2] = "green";
        colors[3] = "red";
        colors[4] = "orange";
        System.out.println(Arrays.toString(colors));

        int[] numbers = new int[2];
        numbers[0] = 100;
        numbers[1] = 200;
        System.out.println(Arrays.toString(numbers));

        //All 3 of the code blocks below each loop through an array the same exact way

        //Regular for loop
        for(int i =colors.length - 1; i >= 0; i--) {
            System.out.println(colors[i]);
        }
            //Enhanced for loop
            for (String color : colors){
                System.out.println(color);

        }
            //Stream method
            Arrays.stream(colors).forEach(System.out::println);

    }
}
