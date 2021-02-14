package academy.learnprogramming.basiccontrolflow;

public class DoWhileLoop {

    public static void doWhileLoop (String[] args) {
        int a = 0;

        do {
            a++;
        } while (false);

        System.out.println("a= " + a);//1, first executes a++, then finds false

//        while(false) {  //this will not compile because false ----> true will loop forever, won't compile
//            a++; //uncreachable
//        }

        //while vs do while
        int x = 20;

        while(x > 10) x--;
        System.out.println("x= " + x);//10

        int x2 = 20;
        do {                //could be missing brackets on exam
            x2--;
        } while (x2 > 10);
        System.out.println("x2= " + x);//10

        int y = 10;
        int z = 5;

        while (y < 10)  //will only execute y++ in loop bc no {}
            y++;
            z+=2;
            y+=10;
        System.out.println("x= " + x + " y= " + y + " z= " + z);


        int number = 10;
        do {
            number--;
            //number = 9
            while (number > 5) {    //wouldn't it get stuck here? number always > 5, so keep adding
                number += 1;
                //number = 10
            }
        } while (number < 10);    //number 10 not less than 10, goes back up, becomes 9, becomes 10 repeatedly
                                  //even if nested while loop code block changed could still run forever if number < 10
        System.out.println("number= " + number);

    }
}
