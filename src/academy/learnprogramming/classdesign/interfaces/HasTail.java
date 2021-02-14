package academy.learnprogramming.classdesign.interfaces;

public interface HasTail {

//    public static final int DEFAULT_TAIL_LENGTH = 2; //public static and final not needed bc this is the default
    int DEFAULT_TAIL_LENGTH = 2;
//    public abstract int getTailLength(); //public abstract not needed bc this is the default, can only have public abstract methods

    int getTailLength(); //modifiers applied by default, no need for public abstract
                        //no body

//    int getWeight() {}; //will not compile, can't have body
}
