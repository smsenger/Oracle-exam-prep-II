package academy.learnprogramming.operators;

public class EqualityOperators {

    public static void equalityOperators(String[] args) {
        int a = 5;
        int b = 3;
        boolean c = a == b;//false
        boolean d = a != b;//true

        System.out.println("a=" + a);//5
        System.out.println("b= " + b);//3
        System.out.println("c= " + c);//false
        System.out.println("d= " + d);//true

        //boolean g = true == 0;//does not compile
        //boolean h = false != "test" //does not compile
        boolean x = true;
        boolean y = false;
        boolean yy = false;
        boolean z = (y = true) && (x = false);//false ==> just ASSIGNMENT, 2nd part executes because first part is true
        boolean zz= (yy != true) && (x = false);// false && false = false

        System.out.println("x=" + x);//false
        System.out.println("y= " + y);//true
        System.out.println("z= " + z);//false
        System.out.println(("zz= " + zz));//false
    }
}
