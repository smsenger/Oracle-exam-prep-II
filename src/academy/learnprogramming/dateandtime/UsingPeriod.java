package academy.learnprogramming.dateandtime;

import java.time.*;

public class UsingPeriod {

    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2020, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2020, Month.APRIL, 30);
        Period period = Period.ofWeeks(1); //once a week, can also do months, days, years, etc.


//        cleanAnimalCage(start, end); //this will print the message for jan, feb, march, april -- only goes in 1 month increments
        cleanAnimalCage(start, end, period);//this will recur for whatever period defined as


        System.out.println(start.plus(period));
        System.out.println(LocalDateTime.now().plus(period));
//        System.out.println(LocalTime.now().plus(period));  //this will throw exception bc can't add days to time since there aren't days to add to

//        Period yearAndMonth = Period.ofYears(1).ofMonths(1);
//        System.out.println(yearAndMonth); //only prints 1 month, can't chain methods on Period class -- only last method returns new period
        Period yearAndMonth = Period.of(1, 1, 0); //this is now to create the period attempted on line 19

//        start.toEpochDay(); //number of days since January 1, 1970, converts to Long
                            //LocalDateTime has toEpochTime, which is number seconds since January 1, 1970, converts to Long
                            //LocalTime has no Epoch method, can't convert it to Long

    }

    //this is a more reusable method than the one below, can adjust the period where method below is always 1 month
    public static void cleanAnimalCage(LocalDate start, LocalDate end, Period period) {
        while(start.isBefore(end)) {
            System.out.println("Need to clean cage on date= " + start);
            start = start.plus(period); //whatever period is in method call will go here
        }
    }


    public static void cleanAnimalCage(LocalDate start, LocalDate end) {
        while(start.isBefore(end)) {
            System.out.println("Need to clean the cage on date= " + start);
            start = start.plusMonths(1); //this makes the reminder print once a month
        }
    }
}
