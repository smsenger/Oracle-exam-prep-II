package academy.learnprogramming.basics;

public class UnderstandingNull {

    static Object myObject = new Object();   //INITIALIZED, PRINTS PARTICULAR HASH
    static Object myOtherObject;            //NOT INITIALIZED, DEFAULT INITIALIZED TO NULL, PRINTS TO NULL
    static String myString;

    public static void nullExample(String[] args) {
        Object myLocalObject = new Object();
        Object anotherLocalObject;

        String name = "Java";
        String anotherName = null;

        System.out.println("myObject= " + myObject);
        System.out.println("myOtherObject= " + myOtherObject);
        //System.out.println("anotherLocalObject= " + anotherLocalObject); CAN'T PRINT BC LOCAL VARS NOT INITIALIZED, HAS NO VALUE

        System.out.println("name=" + name);
        System.out.println("anotherName= " + anotherName);

        System.out.println("myString= " + myString);  //PRINTS NULL
        myString.toLowerCase();                         //CAN'T CALL METHODS ON NULL VARIABLES
        System.out.println("myString= " + myString); //NULL POINTER EXCEPTION
    }
}
