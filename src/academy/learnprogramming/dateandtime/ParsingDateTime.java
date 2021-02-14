package academy.learnprogramming.dateandtime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class ParsingDateTime {

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date = LocalDate.parse("02 15 2010", formatter); //must enter formatter
        LocalTime time = LocalTime.parse("11:33");
        System.out.println(date); //to make this date use the custom formatting need to convert this to string, here prints default format
        String text = date.format(formatter); //now it'll use line 10
        System.out.println(text);
        System.out.println(time);

        LocalDate parsedDate = LocalDate.parse(text, formatter);
        System.out.println(parsedDate); //prints default format, not custom one. to use custom must convert to string

        //exam tricks
        LocalDate myDate = LocalDate.of(2010, Month.MAY, 5);  //create date
        String dateString = formatter.format(myDate);  //date to string
        System.out.println(dateString);
        LocalDate anotherDate = LocalDate.parse(dateString, formatter); //anotherDate and dateString will be the same date, converts string back to date
        anotherDate.plusMonths(5).plusDays(5);   //these changes don't get saved bc there isn't reassignment of anotherDate to these values
        System.out.println(formatter.format(anotherDate)); //prints values from line 23 in custom format bc anotherDate gets its values from dateString
    }
}
