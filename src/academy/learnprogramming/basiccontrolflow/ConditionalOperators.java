package academy.learnprogramming.basiccontrolflow;

public class ConditionalOperators {

    public static void conditionalOperators(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = a && b;//false

        boolean e = a || b; //true

        System.out.println("d= " + d + " e= " + e);

        int f = 4;
        boolean g = false && (f++ < 4);//it's already false on one side, so it's all false, 2nd expression not evaluated(short circuiting)
        boolean h = (f-- == 4) && !g;//
        //f= 4, then decremented, then f = 3
        //g is false so !false is true
        //we have true && true == true

        System.out.println("f= " + f);//3
        System.out.println("g= " + g);//false
        System.out.println("h= " + h);//true

        int myInt = 3;
        int anotherInt = 4;
        boolean myBoolean = (myInt <= 3) && (anotherInt-- ==4) || (myInt++ == 4);//one big expression on left of ||, one on right
        //(myInt <=3) --> left expresion has 2 expressions
        //(anotherInt-- == 4) -> 4 == 4 --> true, anotherInt = 3 after operation
        //code to right of || never executed bc code on left of || is true, whole expression will be true bc one side is true


        System.out.println(("myInt= " + myInt));//3
        System.out.println("anotherInt= " +anotherInt);//3
        System.out.println("myBoolean= " + myBoolean);//true

        boolean x = true, z = true;
        int y = 20;
        x = (y != 10) ^ (z = false);//2nd expression is assignment, sets z to false
        //true ^ false --> true
        System.out.println(x + ", " + y + ", " + z);//true, 20, false


    }
}
