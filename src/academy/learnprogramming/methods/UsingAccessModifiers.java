package academy.learnprogramming.methods;

import academy.learnprogramming.methods.common.Common;

public class UsingAccessModifiers {

    public static void main(String[] args) {
        Common common = new Common();
        common.publicPrint();
//        common.protectedPrint(); //will not compile, protected access in common class
//        common.defaultPrint(); //compilation error, not public
//        common.privatePrint(); //compilation error

        System.out.println("publicNumber = " + common.publicNumber);    //only public access modifiers available
//        System.out.println("protectedNumber = " + common.protectedNumber);
//        System.out.println("defaultNumber = " + common.defaultNumber);
//        System.out.println("privateNumber = " + common.privateNumber);
    }
}
