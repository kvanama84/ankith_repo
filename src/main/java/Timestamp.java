import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Timestamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ScreenshotName;
		DateFormat dateTimeInstance = SimpleDateFormat.getDateTimeInstance();
		String DateTimeStamp = dateTimeInstance.format(Calendar.getInstance().getTime());
		DateTimeStamp = DateTimeStamp.replace(",", "");
		DateTimeStamp = DateTimeStamp.replace(" ", "_");
		DateTimeStamp = DateTimeStamp.replace(":", "_");
		ScreenshotName = DateTimeStamp.toString();
		
System.out.println("time=" +ScreenshotName);
	}

}
