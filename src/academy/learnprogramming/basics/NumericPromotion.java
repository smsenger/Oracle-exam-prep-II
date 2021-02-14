package academy.learnprogramming.basics;

public class NumericPromotion {

    public static void numericPromotion(String[] args) {
    //PROMOTION: CONVERTING SMALLER PRIMITIVE TYPE TO BIGGER PRIMITIVE TYPE
        int x = 5;
        double y = 10.55;
        System.out.println("x+y= " + x + y);  //510.55
        System.out.println("x+y= " + (x + y));
        double result = x + y;
        System.out.println("result= " + result);

        byte b = 10;
        int c = 5;
        double d = 4.5;

        double result2 = b + c + d; //will all be promoted to double
        System.out.println("result2= " + result);//19.5

        //CASTING IS CONVERTING 'BIGGER' TYPE TO SMALLER
        double myDouble = 5.55;
        //int myInt = 4 + myDouble; //trying to assign int to double -- compilation error, left is int, right is double
        int myInt = 4 + (int)myDouble;
        System.out.println("result= " + myInt);//rounds the number to whole number
                    //5 + 4 = 9

        int anotherInt = 125;
        byte myByte = 15;

        int intResult = anotherInt + myByte;//this is fine, int on both sides
        byte byteResult = (byte)(anotherInt + myByte);//this will result in overflow, since highest value of byte is 127;
        System.out.println("intResult= " + intResult); //140
        System.out.println("byteResult= " + byteResult); //-116 bc of overflow

    }
}
