package academy.learnprogramming.exceptions;

import academy.learnprogramming.classdesign.interfaces.Run;

class MuseumClosed extends RuntimeException { //RuntimeException is an unchecked exception

}

class MuseumClosedForLunch extends MuseumClosed {  //MuseumClosed is a subclass of RuntimeException
                                                    //MuseumClosedForLunch is subclass of MuseumClosed, also a subclass of RuntimeException
}


public class CatchingExceptions {


    public static void main(String[] args) {

        try {
            visitMuseum();
        } catch (MuseumClosedForLunch mc) { //catching a sublcassd
            System.out.println("Closed for lunch.");
        } catch (MuseumClosed mc) {  //superclass in this hierarchy
            System.out.println("Closed.");
        }
//        catch (MuseumClosedForLunch mc) { //catching a subclass   //this won't compile because you can't catch a superclass 1st, the 2nd catch is also calling MuseumClosed
        //2nd catch here calls an exception that has already been called --1st catch will handle both
//        System.out.println("Closed for lunch.");
//    }

        //NESTED TRY/CATCH


        System.out.println(calculate());
    }

    public static String calculate() {
        String result = "";
        String str = null;

        try {
            try{                    //the inner block gets executed 1st
                result += "start";  //executes
                str.length();       //this throws NullPointerException bc str is null, goes to catch then finally  -- would never print regardless of str content
                result += "end";
            } catch(NullPointerException e) {
                result += "npe";        //result = startnpe
                throw new RuntimeException();
            } finally {
                result += "finally";        //result = startnpefinally
                throw new Exception();  //this is handled with the catch below
            }
        } catch (Exception e) {
            result += "finished";  //result = startnpefinallyfinished, because this handles the Exception in the finally above
        }

        return result;
    }

    public static void visitMuseum() {
        boolean b = Math.random() < 0.5;
        if(b) {
            throw new MuseumClosed();
        }

        throw new MuseumClosedForLunch(); //this is an else but you don't need the keyword, will run if "if" stmt not true
    }
}
