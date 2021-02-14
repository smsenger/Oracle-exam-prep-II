package academy.learnprogramming.basics;

public class WrapperTypes {

    public static void wrapperTypes(String[] args) {
        int myInt = 10;
        Integer myInteger = new Integer(10); //WRAPPER METHOD, INTEGER CLASS WRAPS THE INTEGER
        Integer myInteger2 = 20; //THIS ALSO WORKS TO INITIALIZED, BUT VALUE IS A PRIMITIVE
        Integer myInteger3 = Integer.valueOf(10);
        Integer myInteger4 = Integer.parseInt("3");
        Integer myInteger5 = null;
        //int myInt2 = null; //this doesn't work. default int value is 0


        //THESE PRINT VALUES SET ABOVE
        System.out.println("myInteger= " + myInteger);
        System.out.println("myInteger2= " + myInteger2);
        System.out.println("myInteger3= " + myInteger3);
        System.out.println("myInteger4= " + myInteger4);
        System.out.println("myInteger5= " + myInteger5);

        //CONVERTING WRAPPER TO PRIMITIVE
        int myInt3 = myInteger3; //UNBOXING
        //int myInt4 = myInteger5; //INITIALIZED TO NULL, SO THIS WON'T WORK, WILL PRODUCE NULL POINTER EXCEPTION, PRIMITIVES CAN'T CONTAIN NULL

        //BOXING --> CONVERTING PRIMITIVE TO WRAPPER
        Integer myInteger6 = new Integer(10); //unnecessary boxing

        //AUTOBOXING, CREATES AUTO CONVERSION FROM INT TO INTEGER
        Integer myInteger7 = myInt;

    }

    //AUTOBOXING, call this method, result will be outer boxed

    //CALL printSum(1, 5); WILL PRODUCE AUTOBOXING, CONVERTS PRIMITIVE TO INTEGER
    //CALL printSum(myInteger, myInteger2);
    private static void printSum(Integer first, Integer second) {
        Integer sum = first + second;
        System.out.println(first + second);
        System.out.println("sum= " + (first + second));
    }
}
