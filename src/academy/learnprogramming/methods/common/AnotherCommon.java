package academy.learnprogramming.methods.common;

public class AnotherCommon {
    public static void main(String[] args) {
        Common common = new Common();
        common.publicPrint();
        common.defaultPrint();
        common.protectedPrint();
//        common.privatePrint(); //compilation error, only accessible in Common class

        System.out.println("publicNumber = " + common.publicNumber);    //inside same package, so all accessible except private
        System.out.println("protectedNumber = " + common.protectedNumber);
        System.out.println("defaultNumber = " + common.defaultNumber);
//        System.out.println("privateNumber = " + common.privateNumber);
    }
}
