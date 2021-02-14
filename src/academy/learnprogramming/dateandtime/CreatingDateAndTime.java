package academy.learnprogramming.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class CreatingDateAndTime {

    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        LocalDate localDate = LocalDate.of(2020, Month.DECEMBER, 1); //local date starts counting months at 1
        LocalTime localTime = LocalTime.of(10, 30);

        System.out.println(localDate); //prints what's on line 15
        System.out.println(localTime);  //prints what's on line 16
        System.out.println(LocalDateTime.of(localDate, localTime));

        //before Java 8
        System.out.println(new Date()); //contains both date and time

        //to specifically set a date, including separate year
        Calendar calendar = Calendar.getInstance();
        calendar.set(2020, Calendar.JANUARY, 1);
        Date january = calendar.getTime();
        System.out.println(january);

    }
}
