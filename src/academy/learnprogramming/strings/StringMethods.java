package academy.learnprogramming.strings;

public class StringMethods {

    public static void stringMethods(String[] args) {
        String str = "java is fun";


        //length
        System.out.println("length= " + str.length());//count of characters, including spaces, 11

        //charAt
        System.out.println(str.charAt(0));//j
        System.out.println(str.charAt(2));//v
        System.out.println(str.charAt(6));//s
        System.out.println(str.charAt(12));//out of bounds exception

        //indexOf
        System.out.println(str.indexOf('a'));//1
        System.out.println(str.indexOf('a', 2));//3: next 'a' from index 2('v') is at index 3
        System.out.println(str.indexOf("fun"));//8: f starts at index 8
        //System.out.println(str.indexOf("fun", 10));//after index 10 no letters, get -1: match not found

        //substring
        //str = str.substring(8);//put index in (), this will reassign value of str to result of method
        System.out.println(str.substring(8));//will start w/letter at 8 and continue to end = fun
        System.out.println(str.substring(0, 5));//starts a 0, ends at 4, result is "java "
        System.out.println(str.substring(4, 4));//prints empty string
        System.out.println(str.substring(4, 2));//StringIndexOutOfBoundsException, logical error, not compilation error --> -2
        //System.out.println(str.substring(8, 14));//StringIndexOutOfBoundsException also, 14 doesn't exist


        //toLowerCase/toUpperCase
        System.out.println("AbCd".toLowerCase());//abcd
        System.out.println(str.toUpperCase());//JAVA IS FUN
        System.out.println(str);//no change

        String dog = "Lucky";
        dog.toUpperCase();//this creates a new string --> assign to variable to change case in next line
        System.out.println(dog);//dog



    }
}
