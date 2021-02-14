package academy.learnprogramming.strings;

public class StringConcatenation {

    public static void stringConcatenation(String[] args){
        String text = "hello";
        String anotherText = new String("hello"); //

        System.out.println(2 + 3);//5
        System.out.println("a" + "b");//ab
        System.out.println(1 + 2 + "d");//3d

        int three = 2;
        String four = "4";
        System.out.println(1 + 2 + three + four);//64

        int number = 10;
        int anotherNumber = 20;
        System.out.println("result= " + number + anotherNumber);//result=1020 --> "result=" + number(concatenation), then + anotherNumber
        System.out.println("result= " + (number + anotherNumber));//result=30

        String str = "";
        for(int i = 0; i < 10; i++) {
            str += i;
        }
        System.out.println(str);//will print 0-9 in same line w/o spaces

        //first two don't change, third creates a new string
        String hello = "hello";
        String world = "world";
        String helloWorld = hello + world;

        System.out.println((hello));//prints hello

    }
}
