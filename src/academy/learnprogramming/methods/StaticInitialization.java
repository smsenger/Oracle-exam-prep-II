package academy.learnprogramming.methods;

import java.util.ArrayList;
import java.util.List;

public class StaticInitialization {

    private static final int SIZE;
    private static int one;
    private static final int two;
    private static final int three = 3;

    private static final List<String> NAMES = new ArrayList<>();
//    private static final int four;//will not compile without initialization

    static {            //static initialization block, all static initialization can go in one block
        System.out.println("first static init");
        int rows = 5;
        int columns = 4;
        SIZE = rows * columns;
    }

    static {
        System.out.println(("second static init"));
        one = 1;
        two = 2; //now that this is assigned compilation error goes away
        one = three; //one is not final, so can assign multiple times
//        three = 3; //can't assign again bc it's final, same with two
        one = 2;
        one = three; //one is not final var
    }

    static {
        System.out.println("third static init"); //all three static inits used when class first used/when app is run, runs top to bottom if > 1
        NAMES.add("jimmy");//can use methods with static var
        NAMES.add("timmy");
    }

    public static void main(String[] args) {
        System.out.println(NAMES); //

    }
}
