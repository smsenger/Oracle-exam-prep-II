package academy.learnprogramming.arrays;

import java.util.Arrays;

public class VariableArguments {

    public static void variableArguments(String... args) { //a valid main method, will run same as (String[] args)
        System.out.println(args.length);
//        System.out.println(Arrays.toString(args));  //change configuration to add arguments, will return more than empty array
//                                                    //now will print the argument length and content

        print(args);
        print("Java");  //don't have to pass argument, just elements of same type
        print(new String[] {"this", "is", "my", "string", "array"}); //creation of string[] unnecessary
        print("this", "is", "another", "variable", "args", "group");

    }

    private static void print(String... args) {//doesn't have to be args, can be anything
                                                //if parameters were (String[] args) the above string printings would not work, WOULD HAVE TO PASS ARRAY
        System.out.println(Arrays.toString(args));
    }
}
