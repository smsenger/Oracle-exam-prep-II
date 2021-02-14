package academy.learnprogramming.basiccontrolflow;

public class ForLoop {

    public static void forLoop (String[] args) {
        for(int i = 0; i < 10; i++) {   //could also use i+=1    ALSO: must define data type in initialization
            System.out.print(i + " ");  //prints 0-9
        }

        //System.out.println("i= " + i);//compilation error bc here i only accessible w/i loop


        System.out.println();  //prints empty new line
        //to access variable outside for loop, initialize it b4 loop
        int a;
        for(a = 0; a < 10; a++) {
            System.out.println("Inside loop a=" + a);//this only executes to 0-9 bc boolean stmt will be false after 9++
        }

        System.out.println();
        System.out.println("a after loop= " + a); //a=10, this will execute because a will be 10 at last test

//        for(;;) {           //infinite/endless, will execute hello forever
//            System.out.println("hello");
//        }

        int x = 0;
        for(int y = 0, z = 4; x < 5 && y < 10; x++, x++) {
            System.out.println("y= " + y);//prints 0-4
        }
        System.out.println("x= " + x);//prints 5

        int d = 10;
//        for(int e = 0, d = 0; e < 10 || d < 10; e++, d-- ) {//will not compile bc d was already declared & initialized
//
//        }
        //for(long z = 0, int d = 4; z < 10; z++, d++) // will not compile, uses different types

//        for(long z = 0; z < 10; z++) //will compile
//        for(double xy = 0.0;xy < 10.5; xy+= 0.5) //will compile
    }
}
