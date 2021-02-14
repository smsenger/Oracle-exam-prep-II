package academy.learnprogramming.methods;

public class Launcher {

    public static void main(String[] args) {
        StaticMethodsAndFields.main(args);  //calling main method inside staticmethodsandfields class  //prints 10
        System.out.println(StaticMethodsAndFields.myNumber);        //prints 10

        AnotherMain.main(args); //prints //prints "print in another main"
    }
}
