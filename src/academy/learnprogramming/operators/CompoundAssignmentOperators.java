package academy.learnprogramming.operators;

public class CompoundAssignmentOperators {

    public static void compoundAssignmentOperators(String[] args) {
        int x= 2;
        int z = 3;

        x = x * z; //simple assignment, x=6
        x*=z;//same as above, x=18

        System.out.println("x= " + x);

        //int a += 5;//won't compile bc a has no value

        //without explicit cast
        long a = 10;
        int b = 4;
        //b = b * a;//doesn't compile bc result promoted to long on the right, but expects int on left
        b =(int) (b * a);//this works
        b *= a; //short for above, automatically casts a to long
        System.out.println("b= " + b);

        long c = 4;
        //c = 2;
        //long d = c;
        //BELOW IS SHORTHAND FOR ABOVE
        long d =(c = 2);
        System.out.println("c= " + c + " d= " + d); //both are 2, changed value of c is printed here, not original value b4 operation

        long e = 3;
        long f = 2;
        long h = 1;

        long i = e + 3 * (f = 3) - (h -=2);

        //f = 3
        //e + 3 * 3 - (-1) // h -= 2 also sets h to -1
        //e + 3 * 3 + 1
        //3 + 9 + 1
        //13

        System.out.println("e=" + e);//3
        System.out.println("f=" + f);//3
        System.out.println("h=" + h);//-1
        System.out.println("i=" + i);//13
    }
}
