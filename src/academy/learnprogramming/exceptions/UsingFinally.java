package academy.learnprogramming.exceptions;

import java.util.Locale;

public class UsingFinally {

    public static void main(String[] args) {
        String[] array = new String[5];  //all 5 elements initialized to null
        array[0] = "John"; //now will print JOHN, but w/0 assignment will go to catch for NullPointerException -- both cases run finally block

        String element = firstToUpper(array);
        System.out.println("element= " + element);  //will get NullPointerException bc trying to call method on null element;

        try {
            String element2 = firstToUpper(array);
            System.out.println("element= " + element2);
        } catch(NullPointerException npe) {
            System.out.println("Error message= " + npe.getMessage());
        } finally {
            System.out.println("finally block");
        }

        //exam question
        String str = "";
        try {
//            int result = 10/0; //now prints bcd
            str += "a";
        } catch(Exception e) {
            str += "b";
        } finally {
            str += "c";
        }

        str += "d";
        System.out.println(str); //prints acd
    }

    public static String firstToUpper(String[] array) {
        return array[0].toUpperCase();
    }
}
