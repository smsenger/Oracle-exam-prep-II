package academy.learnprogramming.basics;

public class InitializePrimitives {
    static boolean myBoolean;   //0
    static byte myByte;         //0
    static short myShort;       //0
    static int myInt;           //0
    static long myLong;         //0
    static float myFloat;       //0.0
    static double myDouble;     //0.0
    static char myChar;         //PRINTS BLANK, BUT HAS A VALUE

    public static void initializePrimitives(String[] args) {
        int localInt;  //can't print this to console, local var not initialized

        //can print static var above because they have initilized value
        System.out.println(myBoolean);
        System.out.println(myByte);
        //////and so forth


    }
}
