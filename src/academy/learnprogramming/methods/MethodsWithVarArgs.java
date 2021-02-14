package academy.learnprogramming.methods;

import java.util.Arrays;

public class MethodsWithVarArgs {

    public static void main(String[] args) {
        jump(1); //can only have start parameter
        //jump(); //can also call w/0 any parameters if edit method to delete int start parameter
        jump(2, 3);
        jump(2, 5, 6, 7);
        jump(1, new int[] {4, 5, 6}); //redundant array creation
        jump(1, null); //null pointer exception, trying to call length property on null object
                                    //will work if call empty []

        run(); //will compile, can have zero to many arguments, prints [], for loop will not execute, 2nd print will print []
        run(11, 22, 33, 44, 55, 66, 77, 88, 99);//add as many as you want
                                                        //...numbers same as using array
    }

    public void jump1(int... numbers) {} //has varargs

    public void jump2(int start, int ... numbers) {}//varargs, first arg is start

//    public void jump2(int... numbers, int start)//will not compile, varargs have to go last

//    public void jump4(int... start, int... numbers) {} will not compile, can only have 1 vararg/method, must be last in list

    public void jump5(int[] start, int[] numbers) {}//can use more than one vararg with []

    public static void jump(int start, int... numbers) {
        System.out.println("start= " + start + " number.length " + numbers.length);
    }

    public static void run(int... numbers) {
        for(int number: numbers) {
            System.out.println("number= " + number);
        }
        System.out.println((Arrays.toString(numbers)));
    }
}
