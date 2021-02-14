package academy.learnprogramming.basics;

public class PrimitivesCharAndBoolean {
    public static void main(String[] args) {
        char ch = 'a'; //must be one character, it's unicode, use single quotes
        char ch1 = '1'; //this reps a char, not an integer
        char uniChar = '\u03A9'; //reps upper case greek omega character
        char romanNumber = '\u216c'; //Roman 50 number

        System.out.println("ch = " + ch);
        System.out.println("ch1 = " + ch1);
        System.out.println("uniChar" + uniChar);
        System.out.println("romanNumber" + romanNumber);

        boolean myBoolean = true;
        boolean myFalseBoolean = false;

        System.out.println("myBoolean = " + myBoolean);
        System.out.println("myBoolean = " + myFalseBoolean);

        //can't have boolean true = false because true and false are reserved words

        
    }
}
