package academy.learnprogramming.operators;

public class ObjectEquality {

    public static void objectEquality(String[] args) {
        //comparing objects
        Integer myInteger = 127;
        Integer myAnotherInteger = 127;

        System.out.println(myInteger == myAnotherInteger);//prints true

        System.out.println("128 == 128: " + (128 == 128));//comparing equality of two ints, TRUE


        System.out.println("myInteger hash= " + System.identityHashCode(myInteger));//THIS AND BELOW HAVE SAME MEMORY LOCATION
        System.out.println("myAnotherInteger hash= " + System.identityHashCode(myAnotherInteger));
        Integer.valueOf(128);
        //if number doesn't equal -128 to 127, assigned as new Integer (int in wrapper class)
        myInteger = 128;//now this is an int, autoboxing

        myAnotherInteger = 128;//now this is an int, autoboxing
        System.out.println("myInteger hash= " + System.identityHashCode(myInteger));//NOW THESE TWO HAVE DIFFERENT MEMORY LOCATIONS, NEW INSTANCE OF INTEGERS/DIFFERENT OBJECT REFERENCE
        System.out.println("myAnotherInteger hash= " + System.identityHashCode(myAnotherInteger));//BECAUSE Integer ALREADY INSTANTIATED, ALREADY HAVE MEMORY LOCATION, SO 127 ALWAYS HAS SAME MEMORY LOCATION



        System.out.println("myInteger= " + myInteger);//128
        System.out.println("myAnotherInteger= " + myAnotherInteger);//128
        System.out.println(myInteger == myAnotherInteger);//false

        Integer int1 = new Integer(1);//
        Integer int2 = new Integer(1);
        Integer int3 = 1;

        System.out.println("int1==int2: " + (int1 == int2));//false
        System.out.println("int1==int3: " + (int1 == int3));//false
        System.out.println("int3==int3: " + (int3 == int3));//false

        //TESTS LOGICAL EQUALITY OF VALUES WITHIN THE OBJECTS
        System.out.println(("int1.equals(int2) " + (int1.equals(int2))));
        System.out.println(("int1.equals(int3) " + (int1.equals(int3))));
        System.out.println(("int2.equals(int3) " + (int2.equals(int3))));

        ///ALL THREE BELOW HAVE DIFFERENT RESULTS BECAUSE HAVE DIFFERENT MEMORY LOCATIONS
        System.out.println("int1 hash= " + System.identityHashCode(int1));
        System.out.println("int2 hash= " + System.identityHashCode(int2));
        System.out.println("int3 hash= " + System.identityHashCode(int3));
    }
}
