package mcs.rest.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.util.StringUtils;

public class DateTimeUtil {

	private static SimpleDateFormat dateTimeFormat = new SimpleDateFormat(
			"dd-MM-yyyy hh:mm:ss a");
	private static SimpleDateFormat dateFormat = new SimpleDateFormat(
			"dd-MM-yyyy");
	private static SimpleDateFormat timeFormat = new SimpleDateFormat(
			"hh:mm:ss a");

	public static Timestamp concatDateAndTimeToTimestamp(String date,
			String time) throws ParseException {
		if (!(StringUtils.isEmpty(date) || StringUtils.isEmpty(time))) {
			String dateTime = date + " " + time;
			Date parsedDate = dateTimeFormat.parse(dateTime);
			Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
			return timestamp;
		} else
			return null;
	}

	public static String getDateByTimestamp(Timestamp timestamp) {
		return dateFormat.format(timestamp);
	}

	public static String getTimeByTimestamp(Timestamp timestamp) {
		return timeFormat.format(timestamp);
	}
	public static Timestamp getCurrentTimesatmp(){
		 java.util.Date date= new java.util.Date();
		 return new Timestamp(date.getTime());
	}
}
