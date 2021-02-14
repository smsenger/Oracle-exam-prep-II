package academy.learnprogramming.strings;

import java.sql.SQLOutput;

public class MethodChaining {

    public static void methodChaining(String[] args) {
        String start = "  Java  ";
        String trimmed = start.trim();
        System.out.println("trimmed= " + trimmed);
        String lowerCase = trimmed.toLowerCase();
        System.out.println("lowerCase= " + lowerCase);
        String result = lowerCase.replace("j", "J");
        System.out.println("result= " + result);

        //written in one line
        String anotherResult = "  java  ".trim().toLowerCase().replace("j", "J");
        System.out.println("anotherResult= " + anotherResult);
        System.out.println(result.equals(anotherResult));

        String a = "abc";
        String b = a.toUpperCase(); //produces new string, doesn't change a variable
        String c = b.replace("B", "b").replace("C", "c");//produces new string
        System.out.println("a= " + a + " b= " + b + " c+ " + c);

        if(a.equalsIgnoreCase(b)) {
            System.out.println("Strings are equal");
        }

        if(a.toLowerCase().trim().equals(b.toLowerCase().trim())) {  //there's nothing to trim
            System.out.println("Equal");
        }

    }
}
