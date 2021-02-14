package academy.learnprogramming.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class UsingDateAndTime {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2030, Month.JANUARY, 10);
        System.out.println(date);
        date.plusDays(5).plusMonths(2); //these calls create another instance of date because instances of Date class are immutable
        date = date.plusDays(5).plusMonths(2); //after reassigning date variable to code on right, content gets overridden
        System.out.println(date); //this will print results of code on line 12

        LocalTime time = LocalTime.of(10, 30);
        System.out.println(time);
        time = time.plusHours(2).plusMinutes(20);
        System.out.println(time);  //same idea as line 13

        LocalDateTime localDateTime = LocalDateTime.of(date, time);
        System.out.println(localDateTime);
        localDateTime = localDateTime.minusHours(10).plusDays(2).plusWeeks(1);
        System.out.println(localDateTime);

        //before Java 8
        Date myDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(myDate);
        calendar.set(Calendar.DATE, 1); //this is the DAY
        calendar.set(Calendar.MONTH, 2); //months start with 0, so this is March
        myDate = calendar.getTime();
        System.out.println(myDate);

        //exam tricks
        LocalDate ld = LocalDate.of(2010, Month.APRIL, 1);
        ld.plusDays(10); //won't add days to ld, return result is ignored bc not assigning this value to ld variable
        System.out.println(ld); //this prints value on line 39 bc 40 doesn't reassign ld variable to new value

//        ld.plusMinutes(10); //this doesn't have time in the first place, so it doesn't compile

        LocalTime lt = LocalTime.of(12, 45);
//        lt.addDays(3); //won't compile because there aren't any days assigned to lt


    }
}
