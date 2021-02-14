package academy.learnprogramming.basiccontrolflow;

public class WhileLoop {

    public static void whileLoop(String[] args) {

        int spaceOnHdd = 5;

        while(spaceOnHdd > 0) {         //while it's > 0, decrement, print out, then go back to test...until no longer > 0
            spaceOnHdd--;               //while print 0 before last test bc it goes [decrement to 0, print 0, test 0 > 0]
            System.out.println("spaceOnHdd= " + spaceOnHdd);
        }

        int x = 2;
        int y = 5;

        while(x < 10) { //this will run forever, not print anything out bc x will always be < 10
            y++;
            //add x++, will eventually do y++
                //1. iteration: y=6, x=3;
                //2. iteration: y=7, x=4;
                //3. iteration: y=8, x=5;
                //4. iteration: y=9, x=6;
                //5. iteration: y=10, x=7;
                //6. iteration: y=11, x=8;
                //7. iteration: y=12, x=9;
                //8. iteration: y=13, x=10;
        }
        System.out.println("x= " + x + " y= " + y);//will print after entire loop sequence completed, prints x=10, y=13

        int a = 5;
        int b = 7;

        while(a < 6) {   //THIS LOOP WILL NEVER EXECUTE BC A < 6
            b+=2;
            a++;
        }
        a = a > 6 ? a++ : b--;
            //will execute b--
            //a=b --> a=7;
            //b-- --> b=b-1 --> b=6
            //7+6=13

        System.out.println(a + ", " + b + ", " + (a + b));//7, 6, 13
    }
}
