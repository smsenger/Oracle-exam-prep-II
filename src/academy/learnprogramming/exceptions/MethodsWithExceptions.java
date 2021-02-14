package academy.learnprogramming.exceptions;

import academy.learnprogramming.classdesign.interfaces.Run;

class NoMoreMeatException extends Exception {} // this is a checked exception bc it extends Exception ---> MUST HANDLE OR DECLARE

class NoMOrePlantsException extends RuntimeException {} //this is an unchecked exception bc it extends RuntimeException

interface Omnivore {
    void eatMeat(int amount) throws NoMoreMeatException;
    void eatPlants(int amount);
}

class Bear implements Omnivore {
    @Override
    public void eatMeat(int amount) throws NoMoreMeatException{  //for checked exception, must indicate that method might throw checked exception
        if(amount  <= 0) {
            throw new NoMoreMeatException();
        }
        System.out.println("Eating meat");
    }

    @Override
    public void eatPlants(int amount) {
        if(amount <= 0) {
            throw new NoMOrePlantsException();  //this will compile bc it throws an unchecked exception, no need to throw in interface method declaration
        }
        System.out.println("Eating plants");
    }
}

public class MethodsWithExceptions {

    public static void main(String[] args) {
        Bear bear = new Bear();

        try {
            bear.eatMeat(-2); //doesn't compile w/o try-catch bc need to declare/handle exception
            bear.eatPlants(-2); //this goes to catch below because this unchecked exception is handled
        } catch(NoMOrePlantsException e)  { //this must come b4 RuntimeException below bc it is a child of that exception
            e.printStackTrace();
            System.out.println("No plants");
        } catch (RuntimeException e) {
            System.out.println("Runtime");
        } catch (NoMoreMeatException e) {
            e.printStackTrace();
            System.out.println("Bear is hungry.");
        } finally {
            System.out.println("finally");
        }

        bear.eatPlants(-2); //this compiles bc it throws an unchecked exception, but can use try-catch if desired
                                    //exception stack trace will print
    }
}
