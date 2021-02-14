package academy.learnprogramming.basics;

public class VariableScope {
    static int myNewInt = 5;   //GLOBAL VARIABLE, CAN USE ANYWHERE IN CLASS

    public static void variableScope(String[] args) {
        int myLocalInt = 10;
        {
            int myOtherInt = 20;
            System.out.println("myOtherInt= " + myOtherInt);  //CAN ONLY PRINT THIS HERE, IN THIS CODE BLOCK
                                                              //CAN ACCESS myLocalInt here
        }

        System.out.println("myLocalInt= " + myLocalInt);
        System.out.println("myNewInt= " + myNewInt);

        int myOtherInt = 30;
        System.out.println("myOtherInt= " + myOtherInt);  //**THIS WILL PRINT 30, SINCE THE FIRST myOtherInt ISN'T IN THE SCOPE OF THIS BLOCK
    }

    public static void myMethod() {
        //can access myNewInt, not myLocalInt
    }
}
