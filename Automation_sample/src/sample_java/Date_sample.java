package sample_java;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date_sample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
		Date today = calendar.getTime();

		calendar.add(Calendar.DAY_OF_YEAR, 10);
		Date tomorrow = calendar.getTime();
		Date dNow = new Date( );
	      SimpleDateFormat ft = 
	      new SimpleDateFormat ("dd MMM yyyy");

	      System.out.println("Current Date: " + ft.format(tomorrow));
	      String date=ft.format(dNow);
	      System.out.println(date);
	      
	
	}

}
