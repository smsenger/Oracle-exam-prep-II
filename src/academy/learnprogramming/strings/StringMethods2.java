package academy.learnprogramming.strings;

import java.sql.SQLOutput;

public class StringMethods2 {

    public static void stringMethods2(String[] args) {
        String str = "java";
        String str2 = "Java";
        String str3 = "ja";

        System.out.println(str.equals(str2));//false
        System.out.println(str.equalsIgnoreCase(str2));//true
        System.out.println("abc".equalsIgnoreCase("ABC"));//true

        //startsWith, endsWith
        System.out.println(str.startsWith("j"));//true
        System.out.println(str.startsWith(str3));//true
        System.out.println(str.startsWith("J"));//false -- case sensitive
        System.out.println(str.startsWith("J".toLowerCase()));//true, only possible with string literal
        System.out.println(str.endsWith("va"));//true

        //contains
        System.out.println(str.contains(str3));//true
        System.out.println(str.contains("av"));//true
        System.out.println("Java".contains("j"));//false -- case sensitive
        System.out.println("Java".contains("j".toUpperCase()));//true

        //replace
        String myString = "Java" + " " + "is" + " " + "cool";
        System.out.println(myString.replace('a', 'A'));//only changes a to A
        System.out.println(myString.replace(" ", "_"));//lower case a, only changes spaces to _
        System.out.println(myString.replace("is", "_"));//only underscore where 'is' was
        System.out.println(myString);//will be same string as start, did not change IMMUTABLE string

        //trim: removes whitespace from end/beg of string
        System.out.println("Java".trim());//no change
        System.out.println(" Java is cool   ".trim());//removes starting and ending spaces
    }
}
