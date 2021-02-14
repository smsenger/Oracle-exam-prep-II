package academy.learnprogramming.dateandtime;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class FormattingDateAndTime {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2010, Month.APRIL, 15); //Java throws exception if impossible date entered (month, day)
        LocalTime time = LocalTime.of(11, 22, 33);
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        //predefined formats, converts to string
        //also: ofLocalizedDate and ofLocalizedDateTime
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE)); //date as a string
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)); //DateTime as a string
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_TIME));  //time as a string

        //First create a formatter, defining date/time, etc and style
        //then implement it, using .format(parameter)
        DateTimeFormatter shortFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT); //can also do time
        DateTimeFormatter mediumFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM); //can also do time
        System.out.println(shortFormatter.format(dateTime));
        System.out.println(mediumFormatter.format(date));
//        System.out.println(shortFormatter.format(time )); //UnsupportedTemporalTypeException

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm"); //the more of each letter you use, the more letters/numbers you get in result
                                                                                        //for day, hour --two letters includes leading 0 for single digit day, hour
                                                                                        //can use whatever commas, colons, dashes you like
        System.out.println(dateTime.format(formatter));

        //before Java 8
        SimpleDateFormat sf = new SimpleDateFormat("hh:mm");
        System.out.println(sf.format(new Date())); //prints leading 0 for single digit hour

        //tricks on exam
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm");
        System.out.println(dtf.format(dateTime)); //just prints actual time no date
//        System.out.println(dtf.format(date));  //this throws exception
        System.out.println(dtf.format(time)); //prints time created on line 16
    }
}
