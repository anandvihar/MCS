package mcs.service.test;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
public static void main(String args[]) throws ParseException{
	
	String date="04-11-2014";
	String time="09:25:06 AM";
	String dateTime="04-11-2014 09:25:06 AM"; 

    SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss a");
    Date parsedDate = dateFormat.parse(dateTime);
    Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
    System.out.println(timestamp);
    long milliseconds = timestamp.getTime() + (timestamp.getNanos() / 1000000);
    SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
    System.out.println(sdf.format(timestamp));
    SimpleDateFormat sdf_new = new SimpleDateFormat("hh:mm:ss a");
    System.out.println(sdf_new.format(timestamp));
}
}
