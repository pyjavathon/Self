package self.practice.chapter10;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatEx1 {

	public static void main(String[] args) {
		Date today = new Date();
		
		SimpleDateFormat sf1, sf2, sf3, sf4;
		SimpleDateFormat sf5, sf6, sf7, sf8;
		
		sf1 = new SimpleDateFormat("yyyy-MM-dd");
		sf2 = new SimpleDateFormat("''yy년 MMM dd일 E요일");
		sf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		sf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
		
		System.out.println(sf1.format(today));
		System.out.println(sf2.format(today));
		System.out.println(sf3.format(today));
		System.out.println(sf4.format(today));
		
		

	}

}
