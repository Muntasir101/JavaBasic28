package dataTime;
import java.util.Date;


public class DateDemo {

    public static void main(String args[]) {
        // Instantiate a Date object
        Date date = new Date();
        // display time and date using toString()
        System.out.println(date.toString());

        // display formatted date
        System.out.printf("%s %tB %<te, %<tY", "Today's date: ", date);
    }
}