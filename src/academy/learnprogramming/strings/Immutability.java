package academy.learnprogramming.strings;

public class Immutability {

    public static void immutability(String[] args) {
        String hello = "hello";
        String hi = hello + "world";//hi="helloworld"
        hi = hello;//hi="hello

        System.out.println(hi + hello);

        hello.toUpperCase();
        System.out.println(hello);//still prints hello, all lower case bc string is immutable

        hello = hello.toUpperCase();
        System.out.println(hello);//now is HELLO

        //concat
        String s1 = "1";//1
        String s2 = s1.concat("2");//12 (string, not number12)
        s2.concat("3");//not assigning to any variable, so this line doesn't execute
        //s2 = s2.concat("3"); //will change what s2 refers to, to new string
        System.out.println(s1);//1
        System.out.println(s2);//12
    }
}
