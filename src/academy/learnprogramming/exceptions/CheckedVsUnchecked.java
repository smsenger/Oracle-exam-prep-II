package academy.learnprogramming.exceptions;

public class CheckedVsUnchecked {

    public static void main(String[] args) throws Exception {  //in this case nothing handles the checked exception
        myMethod(); //unhandled Exception, but checked --doesn't compile w/o exception in main method bc you have to handle checked exceptions
        anotherMethod(); //this compiles bc it's unchecked, RuntimeException and don't have to handle
    }

    public static void myMethod() throws Exception { //throws indicates possibility of method to throw exception --for checked exception
        throw new Exception("Failed to load"); //creating new instance of Exception and then throwing it --for checked exception
    }

    public static void anotherMethod() throws RuntimeException { //these two keywords not necessary
        throw new RuntimeException("Wrong parameter"); //prints stack trace of exception/lines that we are calling to get to the exception
    }
}
