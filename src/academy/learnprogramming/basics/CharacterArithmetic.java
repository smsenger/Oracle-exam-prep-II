package academy.learnprogramming.basics;

public class CharacterArithmetic {

    public static void characterArithmetic(String[] args) {
        //char 0 - 65535
        char myCharA = 'A';
        char myCharNum = '1';

        System.out.println("myCharA= " + myCharA);//A
        System.out.println("myCharA isLetter= " + Character.isLetter(myCharA));//true
        System.out.println("myCharA isDigit = " + Character.isDigit(myCharA));//false

        System.out.println("myCharNum= " + myCharNum);//1
        System.out.println("myCharNum isLetter= " + Character.isLetter(myCharNum));//false
        System.out.println("myCharNum isDigit = " + Character.isDigit(myCharNum));//true

        //exam examples
        char letter = 65;//capital letter A in Ascii, A + 1 = B, ETC... A + 3 = D
        int myInt = letter + 3;
        char myNewLetter = (char) myInt;

        System.out.println("letter= " + letter);//A
        System.out.println("myInt= " + myInt);//68
        System.out.println("myNewLetter= " + myNewLetter);//D

        char myChar = 65;//A
        char newChar = (char)(myChar + 1); //when in (), must cast as char ---- 66, letter B
        boolean b = newChar == 'B';//true
        boolean c = (newChar++ < 'D');//newChar is 67, after use/increment it's 68, currently is less than D, which is 68 ---TRUE

        System.out.println("myChar= " + myChar);//A
        System.out.println("newChar= " + newChar);//C
        System.out.println("b= " + b);//TRUE
        System.out.println("c= " + c);//TRUE



    }
}
