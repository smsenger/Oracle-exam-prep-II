package academy.learnprogramming.basiccontrolflow;

public class TernaryOperator {

    public static void ternaryOperator(String[] args) {
        //boolean expression

        int x = 10;
        int y;

        if(x > 5) y = 2 * x;
        else y = 4 * x;

        //ternary operator
        y = x > 5 ? 2 * x : 4 * x; // must use same data type with assignment. y is int, conditional code must return int

        y = (x > 5) ? (2 * x) : (4 * x); //nicer to read than above

        System.out.println("y= " + y);

        //not same data type example
        System.out.println(y > 5 ? 10 : "test");//this is okay, will print 10 in this case

        //int myInt = y > 5 ? 10 : "test" // type on right must be int, does not compile

        int a = 1;
        int b = 1;
        int c = a < 10 ? a++ : b++;
        //c = a = 1;
        //a = 2;
        //next block won't run, short circuiting

        System.out.println("a= " + a + " b= " + b + " c= " + c); //2, 1, 1

        //EXAMPLE QUESTION WITH BAD FORMATTING
        int d = 1;
        int e = 2;
        int f = 3;

        if (d < 10) f = d++ < 1 ? e++ : f++;
        //d is not less than one, will use f++
        //d = 2;
        //e = 2;
        //f = 3; f++ never used because f = f

        else f = (d + e) < 2 ? d++ : e++; //this code will not execute

        System.out.println(d + ", " + 3 + ", " + f); //2, 2, 3 --bc assigning f to f, f will be 3 forever, f = f

        //MORE COMPLEX TERNARY > 1 TERNARY OPERATOR
        int xx = 5;
        System.out.println(xx > 2 ? xx < 4 ? 10 : 8 : 7);
        System.out.println(xx > 2 ? ((xx < 4) ? 10 : 8) : 7);
        System.out.println(xx > 2 ? 8 : 7);
        System.out.println(8);
    }
}
