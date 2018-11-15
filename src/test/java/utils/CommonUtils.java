/**
 * 
 */
package utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * @author JoseAdrianSolisPerez
 *
 */
public class CommonUtils {
	
	public CommonUtils() {
		
	}
	
	public Date getRandomInitDate() {
		Random r = new Random();
		Date today = Calendar.getInstance().getTime();
		return addDays(today, r.nextInt(10));
	}
	
	public Date getRandomEndDate(Date iniDate) {
		Random r = new Random();
		return addDays(iniDate, r.nextInt(5)+1);		
	}
	
	public Date addDays(Date date,int days) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, days);
		return cal.getTime();
	}
	
	public String convertDateToString(Date date) {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		return format.format(date);
	}

}
