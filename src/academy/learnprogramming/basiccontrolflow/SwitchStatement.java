package academy.learnprogramming.basiccontrolflow;

import java.util.Random;

public class SwitchStatement {

    public static void switchStatement(String[] args) {

        int dayOfWeek = 0;

        switch (dayOfWeek) {
            case 0:
                System.out.println("Monday"); // only this code will run
                break;                        //will execute until break. w/o this would also print case 1
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wednesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");
                //break; optional!
        }

        System.out.println(dayOfWeek);

        Random rand = new Random();
        int c = rand.nextInt(26) + 'a'; //0 - 26, w/a adding offset to produce lower case letters
        System.out.println((char)c + ", " + c + ": " ); //cast as char to get char instead of int

        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'u':
                System.out.println("vowel"); //ALL ABOVE CASES WILL PRINT THIS IF CHAR IS rand VALUE + INT VALUE OF THE CHAR
                break;
            case 'y':
                System.out.println("sometimes a vowel"); //THE TWO ABOVE PRINT THIS CODE
            default:
                System.out.println("consonant"); //THIS IS EVERY OTHER POTENTIAL CHAR
        }

        int x = 4;
        switch (x) {
            case 4:
            //case x: //will not compile, not a CONSTANT EXPRESSION
            case 'x': //this will work bc a char
            //case "test" : //integer or char require
        }

        /////////////
            //can't define cases with the same name --> compilation error
            //ok to put default before case statements


    }
}
