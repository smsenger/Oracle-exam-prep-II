package academy.learnprogramming.basiccontrolflow;

public class IfElseStatement {

    public static void ifElseStatement(String[] args) {

        boolean b = true;

        if(b) {
            System.out.println(("true"));
        } else {
            System.out.println("False");
        }

        if(!b) {
            System.out.println("false");
        }else {
            System.out.println("true");
        }

        int testScore = 76;
        char grade;

        if(testScore >= 90) {
            grade='A';
        } else if(testScore >= 80) {
            grade='b';
        } else if(testScore >= 70) {
            grade='c';
        } else if (testScore >= 60) {
            grade='d';
        } else if(testScore >= 50) {
            grade='e';
        } else {
            grade='f';
        }
        System.out.println(("grade= " + grade));


        //example on exam
        int hoursOfDay = 10;
        if(hoursOfDay < 11) System.out.println("morning");  // will run this code, printing morning
        else if(hoursOfDay < 17) System.out.println("evening");
        else
            System.out.println("day");
            //hoursOfDay++  //this is not part of else

        if(hoursOfDay < 17) {
            System.out.println("afternoon"); //this will eval to true first and print afternoon, even though the else if is more accurate
        } else if (hoursOfDay < 11) {       //11 < 17, this will never execute
            System.out.println("morning");
        } else {
            System.out.println("evening");
        }
    }
}
