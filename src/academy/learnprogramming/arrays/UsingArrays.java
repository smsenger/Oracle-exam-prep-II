package academy.learnprogramming.arrays;

import java.util.Arrays;

public class UsingArrays {

    public static void usingArrays(String[] args) {
        String[] pets = {"parrot", "cat", "dog"}; //without initialization array will always be null
        System.out.println(pets[0]); //prints parrot
        System.out.println(pets[1]); //prints cat
        System.out.println(pets[2]); //prints dog
        //System.out.println(pets[3]); //prints exception: ArrayIndexOutOfBounds: 3 --> index 3 DOESN'T EXIST


        //printing arrays
        pets[0] = "bird"; //can change individual elements
        for(int i = 0; i < pets.length; i++) {
            System.out.println(pets[i]); //will print all items in array, each on new line
        }

        for(int i = 0; i <= pets.length -1; i++) { //length of index 0-2 / 0 - length -1
            System.out.println(pets[i]);
        }

        System.out.print(Arrays.toString(pets)); //uses a String Builder, appends [] and comma, returns null if array is null --> all on one line between []

        int[] numbers = new int[5];
        System.out.println(Arrays.toString(numbers)); //will print 5 0s FOR INT, NOT FOR STRING

        String[] newPets = new String[5];
        System.out.println(Arrays.toString(newPets)); //will print null 5 times

        for(int i = 0; i < numbers.length; i++) { //this initializes the array
            //i = 0
            //numbers[0] = 0 + 10 = 10
            //i = 1
            //numbers[1] = 11
            //i = 2
            //numbers[2] = 12
            //i = 3
            //numbers[3] = 13
            //i = 4
            //numbers[4] = 14 // index 5
            numbers[i] = i + 10;
        }

        for(int i = 0 ; i < numbers.length; i++) {                  //WILL PRINT ARRAY DEFINED IN ABOVE "FOR LOOP" BC ARRAY ASSIGNMENT IS IN SCOPE WITHIN THE REST OF THE METHOD
            System.out.println("numbers[" + i + "]= " + numbers[i]);//SO numbers GETS ASSIGNED AS [10, 11, 12, 13, 14] AND YOU CAN PRINT THAT FROM THE SECOND "FOR LOOP"
        }

        System.out.println(numbers); //[I means int, [L means string, followed by hash code
        System.out.println(Arrays.toString(numbers));//prints nice in square brackets


        //arrays with WRAPPERS
        Integer[] nums = new Integer[4];
        System.out.println(Arrays.toString(nums));  //this will be null elements because obj array is null when empty

        for(int i = 0; i < nums.length; i++) {      //this initializes the array
            //i = 0, 0 % 3 = 0
            //i = 1, 1 % 3 = 1
            //i = 2, 2 % 3 = 2
            //i = 3, 3 % 3 = 0
            nums[i] = i % 3;
        }
        System.out.println(Arrays.toString(nums));//this has the new assignment, so it will print [0,1,2,0]


    }
}
