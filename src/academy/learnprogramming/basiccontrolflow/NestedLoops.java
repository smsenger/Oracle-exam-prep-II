package academy.learnprogramming.basiccontrolflow;

import java.util.Arrays;

public class NestedLoops {

    public static void nestedLoops(String[] args) {
        for(int hours = 1; hours <= 6; hours ++) {
            for(int minutes = 0; minutes < 60; minutes++) {
                //System.out.println(hours + ":" + minutes); //print all 59 minutes for each hour 1-6
            }
        }

        //to iterate over elements in multidimensional arrays we need nested loops
        int[][] myArray = {  //symmetrical 2D array
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(myArray); //[[I + hash for whole array
        System.out.println(Arrays.toString(myArray)); //[[I + hash for each row in [], not elements

        OUTER:
        for(int[] rowArray: myArray) {   //for each row
            INNER:
                for(int i = 0; i < rowArray.length; i++) {   //for each element in that rowArray
                                                            // execution finished each time when the row has been iterated over
                                                            //goes to print empty line below
                                                            //returns to first for loop, then does this loop for the next row, etc.
                    System.out.print(rowArray[i] + " ");  //prints all elements in a row separated by space, prints all rows
                }
            System.out.println();                       //creates new line for each row
        }

        OUTER2:
            for(int[] rowArray: myArray) {
                INNER2:
                for(int i = 0; i < rowArray.length; i++) {
                    if(rowArray[i] % 2 == 0) {
                        break INNER2;           //without specifying will ALWAYS BREAK THE 1ST LOOP (this loop)
                    }                           //if you break OUTER2 here, only 1 will print...will get to 2 in 1st row and break outer loop, ending execution
                    System.out.print(rowArray[i] + " ");//1, space, 7, three lines
                }
                System.out.println();
            }

        OUTER3:
        for(int[] rowArray: myArray) {
            INNER3:
            for(int i = 0; i < rowArray.length; i++) {
                if(rowArray[i] % 2 == 0) {
                    //continue INNER3;           //will print all except numbers divisible by 2
                    continue OUTER3;            //every time the if is true, moves to the next row: prints 1 7, doesn't execute empty print stmt
                }
                System.out.print(rowArray[i] + " ");//1 3
            }                                       //5
                                                    //7 9
            System.out.println();
        }

        int x = 10;
        while(x > 0) {
            //
            do{
                //1. executes until x = 5(while condition below), keeps counting subtracting from x through until x = 5
                    //will always execute at least once, even if x < 5
                //3. x = 3
                //5. x = 1
                x-=1;
            } while(x > 5);
            //2. x-- -> x = 4
            //4. x-- -> x = 2
            //5. x-- -> x = 0
            x--;
            System.out.println(x);
                    //prints 4
                    //prints 2
                    //prints 0
        }
    }
}
