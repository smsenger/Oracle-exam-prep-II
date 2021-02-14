package academy.learnprogramming.methods;

public class MethodDesign {

    public void jump() {}

    //void public jump2() () //does not compile, void before access modifier
    //void jump3() //missing access modifier

    public final void jump4() {}
    public static final void jump5() {};//static methods can't be final, but will compile
    public final static void jump6() {} //compiles, order of specifiers not important

    //public modifier void jump7() {} //will not compile, modifier not a keyword
    //public String void jump8() {} //will not compile, specified two return types
    final public void jump9() {} //this will compile
    //final public void final jump9() {} //will NOT compile, can't put specifier after return type
    final static public void jump10() {} //will compile
    //String int public void jump11() {} //two return types, won't compile
}
