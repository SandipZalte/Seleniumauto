package Important_classes;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateTime {

	public static String getdate() { // method

		Date dt = Calendar.getInstance().getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		String date = sdf.format(dt);
		return date;
	}

	public static String datetime() { // method

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd  hh-mm-ss-SS"); // What Foramt date and Time you
																						// required
		LocalDateTime ldt = LocalDateTime.now(); // its get What current system time get by mynow () method
		String d = ldt.format(dtf); // Format the cuurent time by now () method into Required format and its return
									// as String

		//System.out.println("Screen Shot Capurture by Given Date and time " + d);
		return d;

		// String p=dtf.format(ldt);
		// System.out.println(d);
	}
		public static String getdate(String name) {
			Date dt = Calendar.getInstance().getTime();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
			String date = sdf.format(dt);
			return date;
			
			
		}
	}


