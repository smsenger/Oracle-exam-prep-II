package academy.learnprogramming.operators;

public class AssignmentOperators {

    public static void assignmentOperators(String[] args) {
        //int x = 1.0; //does not compile
        //short y = 19812345; //does not compile
        //int z = 9f; //does not compile
        //long t = 1243893458243093; //all whole numbers are integers, not long

        //same left side, different right side
        int x = (int)1.0;
        short y = (short)19812345;
        int z = (int)9f;
        long t = 1243893458243093L;

        //casting required when going from large to small numerical data types

        System.out.println("x= " + x);
        System.out.println("y= " + y); //will return different number because overflow
        System.out.println("z= " + z);
        System.out.println("t= " + t);

        //overflow and underflow w/ byte(-128 to 127)
        byte myByte = 127;
        byte mySecondByte = -128;
        System.out.println("myByte= " +myByte);
        System.out.println("mySecondByte= " + mySecondByte);

        //myByte = myByte + 1; //will not compile, converted to int on right side
        myByte++; //will work bc will be incremented after use, but becomes -128 ------->OVERFLOW
        mySecondByte = mySecondByte--; // decrements after use, will become 127 ---------UNDERFLOW

        System.out.println("myByte= " + myByte);
        System.out.println("mySecondByte= " + mySecondByte);

        short a = 10;
        short b = 12;
        short c = (short)(a * b); //needs to be casted into short because right side promoted to int and data types don't match in equation ---->use brackets for both



    }
}
