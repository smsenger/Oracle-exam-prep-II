package academy.learnprogramming.operators;

public class RelationalOperators {

    public static void relationalOperators(String[] args) {
        int x = 10;
        int y = 20;
        int z = 10;

        boolean b = x < y;//always true
        System.out.println("b= " + b);//true
        System.out.println(("b= " + (x < y)));//same result as above, true
        System.out.println("x <= y " + (x <= y));//true
        System.out.println("x >= z " + (x >= z));//true
        System.out.println("x > z " + (x > z));//false

        int c = 10;
        long d = 5L;
        double e = 7.5;

        System.out.println("c < d " + (c < d));//false, c converted to L
        System.out.println("c > e " + (c > e));//true, c converted to double

        int f = 12;
        long g = 15L;
        double h = 14.5;
        System.out.println((f < g) + " " + (g > h));
        //f promoted to long, f less than g: true
        //g promoted to double, g more than h: true
    }
}
