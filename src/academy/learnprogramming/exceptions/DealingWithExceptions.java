package academy.learnprogramming.exceptions;

public class DealingWithExceptions {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        int result = divide(a, b);
        System.out.println("result= " + result);  //will get unchecked arithmetic exception, division by 0 not allowed


        //TRY-CATCH
        try {
            int result2 = divide(a, b);
            System.out.println("result= " + result2);
        } catch(ArithmeticException e) {
            e.printStackTrace(); //will print long computer-y message
            System.out.println("Error dividing message= " + e.getMessage());  //will give specific reason
        }
    }

    private static int divide(int a, int b) {
        return a/b;
    }
}
