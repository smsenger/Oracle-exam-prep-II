package academy.learnprogramming.operators;

public class UnaryOperators {

    public static void unaryOperators(String[] args) {
        int x = +3; //+ is redundant
        System.out.println("x= " + x);

        double y = -x;
        System.out.println("x= " + x + " y= " + y); //x=3, y=3.0

        y = - y; //negation, is -1 * y
        System.out.println("x= " + x + " y= " + y);//y is 3.0

        boolean a = true;
        boolean b = !a;
        System.out.println("a= " + a + " y= " + y);//a true, b false
        b = !b;
        System.out.println("a= " + a + " b= " + b);//a true, b true

        //DOESN'T COMPILE:
        //int myInt = !5;
        //boolean myBoolean = -true;
        //boolean z = !0;

        //INCREMENT AND DECREMENT OPERATORS, BE CAREFUL, HAVE HIGHER ORDER OF PRECEDENCE THAN +, -, *, /, ETC.

        //PRE-UNARY INCREMENT
        int myInt = 5;
        int otherInt = ++myInt;
        System.out.println("myInt= " + myInt + " otherInt= " + otherInt);//myInt is incremented, so myInt is 6, otherInt is 6
                //like this: int myInt = 5;
                            //int myInt = myInt + 1;
                            //int Other int = myInt;
        //POST-UNARY INCREMENT
        int newInt = 5;
        int newOtherInt = newInt++;
        System.out.println("newInt= " + newInt + " newOtherInt= " + newOtherInt);//newInt = 6, newOtherInt = 5
                //like this: int newInt = 5;
                            //int newOtherInt = newInt; --> 5
                            //int newInt = 5 + 1

        int count = 0;
        System.out.println(count); //0
        System.out.println(++count); //1
        System.out.println(count); //1
        System.out.println(count--); //print 1, then set count to 0
        System.out.println(count); //0

        //EXAM QUESTIONS
        int e = 3;
        int f = ++e * 5 / e-- + --e;
        System.out.println("e= " + " f= " + f);
        //e=3
        //4 * 5/e-- + --e     --> ++e -> ++3 -> e=4
        //4 * 5 / 4 + --e -> e-- -> 4-- -> 3
        //4 * 5 / 4 + 2; -> e = 3 -> --3 -> 2
        //20/4 + 2;
        //5 + 2;
        //7

        int g = 6;
        int h = 2;
        int i = ++h + --g * 3 + 2  * g++ - h-- % --g;
        //h = 3 g = 6
        //3 + --g * 3 + 2 * g++ - h-- % --g;
        //h = 3, g = 5
        //3 + 5 * 3 + 2 * g++ - h-- % --g
        //3 + 5 * 3 + 2 * 5 - h-- % --g
        //h = 2, g = 5, then 6
        //3 + 5 * 3 + 2 * 5 - 3 % 5;
        //h = 2, g = 5
        //3 + 15 + 10 - 3
        //18 + 10 - 3;
        //28 - 3
        //25

        System.out.println("g= " + g + " h= " + h + " i= " + i);

//f
    }
}
