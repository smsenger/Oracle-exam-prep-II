package academy.learnprogramming.exceptions;

public class CatchWithReturn {

    public static void main(String[] args) {
        System.out.println(calculate());
    }

    public static int calculate() {
        try {
//            System.exit(0);//here nothing will be printed
            return 10/0;
        } catch (ArithmeticException e) {
            System.out.println("Error");
//            System.exit(0);  //with this, just prints "Error" and stops executing, finally doesn't run
                                //***IF CATCH DOESN'T EXECUTE THIS WILL NEVER EXECUTE AND BOTH TRY AND FINALLY WILL EXECUTE
            return 1;
        }
//        finally {
//            System.out.println("Finally");  //prints "Finally" and returns 0 --doesn't execute catch return stmt bc finally has to execute
//            return 0;
//        }
        finally {
            System.out.println("Finally"); //prints "Finally", then returns 1 because return closes the method and finally must run before that
        }
    }
}
