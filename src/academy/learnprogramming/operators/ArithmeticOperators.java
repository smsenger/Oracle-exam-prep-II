package academy.learnprogramming.operators;

public class ArithmeticOperators {

    public static void arithmeticOperators(String[] args) {
        int result = 3 - 2 + 2 * 2 + 3;
        System.out.println("result= " + result);


        //PRE-UNARY OPERATOR: DECREMENT
        int a = 4;
        int b = 3 - 2 * --a; //a decremented is 3, decrement then use a=a-1
        //3 - 2 * 3
        //3 - 6
        //-3
        System.out.println("a= " + a + "b= " + b);//a=3

        //POST-UNARY OPERATOR: DECREMENT
        a = 4;
        b = 3 - 2 * a--;//use a, then decrement a=a-1 A WILL STILL PRINT AS 3, BUT WHEN USING IT THE VALUE IS STILL 4
        //3 - 2 * 4
        //a is now 3
        //3 - 8
        //-5
        System.out.println("a= " + a + " b= " + b);

        //POST-UNARY OPERATOR: INCREMENT
        long c = 2;
        long d = 4 + 3 * c++; //use then increment add 1 to the variable
        //4 + 3 * 2
        //now c is 3
        //4 + 6
        //10
        System.out.println("c= " + c + " d= " + d);

        //CHANGE PRECEDENCE WITH ();
        result = 10 - 3 * (2 + 1) - 4 / (1 + 3);
        //10 - 3 * 3 - 4 / 4
        //10 - 9 - 1
        //0
        System.out.println("result= " + result);

        int i = 10;
        int j = 3;

        int k = i % j;
        int e = 10 % 2;


        int f = 12;
        int g = 5;
        int h = 2;
        int m = f / 2 - 10 % (4 + 3) - 2 * f % g - h * 3;
        //12 / 2 - 10 % 7 - 2 * 12 % 5 - 2 * 3;
        //6 - 3 - 24 % 5 - 6
        //6 - 3 - 4 - 6
        //-7
        System.out.println("m= " + m);
    }
}
