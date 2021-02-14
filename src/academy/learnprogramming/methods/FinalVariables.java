package academy.learnprogramming.methods;

import java.util.ArrayList;
import java.util.List;

public class FinalVariables {

    private static final int SIZE = 10;
    private static final List<String> VALUES= new ArrayList<>(); //when adding strings, not reassigning variable to point to another object


    public static void main(String[] args) {
        int[] myArray = new int[SIZE];
//        SIZE = 11; //This won't work! Can't change value of this variable! --> compilation error
//        SIZE++; //will compile but will get IndexOutOfBounds Exception in for loop because myArray declared with SIZE value 10
        int doubleSize = 2 * SIZE; //Can use the variable in operations

        for(int i = 0; i < SIZE; i ++) {
            System.out.println(myArray[i]); //prints 10 zeros on separate lines
        }

        VALUES.add("changed"); //this compiles: not changing the variable, because not reassigning variable to point to another object
                                //can call methods on final var: clear, remove, sort, etc.
//        VALUES = new ArrayList<>(); //will not compile

        final int myNumber = 10;
//        myNumber = 11; //compilation error
    }
}
