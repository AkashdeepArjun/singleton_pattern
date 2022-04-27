package home;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyUtils {
    public final static  SimpleDateFormat format= new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss.SSS");
    public static void log(String title,String message){
        Date d=Calendar.getInstance().getTime();
        String timestamp=format.format(d);
        String output_message=timestamp+" "+title+": "+message;
        System.out.println(output_message);
    }

    // public String void intToString(int a){

    //     return String.valueOf()
    // }
    
}
