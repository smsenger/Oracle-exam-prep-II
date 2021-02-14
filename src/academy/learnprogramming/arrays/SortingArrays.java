package academy.learnprogramming.arrays;

import java.util.Arrays;

public class SortingArrays {

    public static void sortingArrays(String[] args) {

        //sorting int[]
        int[] numbers = {5, 10, 2};

        Arrays.sort(numbers);
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");     //this will print everything on same line with space between elements
        }
        System.out.println(); //this will create a blank line

        System.out.println(numbers); //this will print [I with hash
        System.out.println(Arrays.toString(numbers)); //this will print the numbers inside [], now in order bc array has been modified above


        //sorting string[]
        String[] strings = {"50", "9", "500"};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));//in a weird order because sorted in alphabetical order
    }
}
