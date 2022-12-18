package self.practice.chapter10;

import java.util.Calendar;
import java.util.Date;

import part07.exam01.Cal;

public class Calendar_Date {

	public static void main(String[] args) {
		
		/*
		 * //calendar -> Date로 변환 Calendar cal = Calendar.getInstance();
		 * 
		 * Date d = new Date(cal.getTimeInMillis());
		 * 
		 * //Date -> calendar로 변환 Date d2 = new Date();
		 * 
		 * Calendar cal2 = Calendar.getInstance(); cal2.setTime(d2);
		 */
		
		Calendar today = Calendar.getInstance();
		
		System.out.println("이 해의 년도 : "+ today.get(Calendar.YEAR));
		
		System.out.println("월(0~11, 0:1월) : "+ today.get(Calendar.MONTH));
		
		System.out.println("이 해의 몇 째 주 : "+ today.get(Calendar.WEEK_OF_YEAR));
		
		System.out.println("이 달의 몇 째 주 : " + today.get(Calendar.WEEK_OF_MONTH));
		
		System.out.println("이 달의 몇 일 : "+ today.get(Calendar.DATE));
		
		System.out.println("이 달의 몇 일 : "+ today.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("이 해의 몇 일 :" + today.get(Calendar.DAY_OF_YEAR));
		
		System.out.println("요일(1~7, 1:일요일) : " + today.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("이 달의 몇 째 요일 : "+ today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		System.out.println("오전_오후 (0:오전, 1:오후): " + today.get(Calendar.AM_PM));
		
		System.out.println("시간 (0~11) : "+ today.get(Calendar.HOUR));
		
		System.out.println("시간 (0~23) : "+today.get(Calendar.HOUR_OF_DAY));
		
		System.out.println("분 (0~59) : "+today.get(Calendar.MINUTE));
		
		System.out.println("초 (0~59) : "+ today.get(Calendar.SECOND));
		
		System.out.println("TimeZone(-12~+12) : "+ (today.get(Calendar.ZONE_OFFSET)/(60*60*1000)));
		
		
	}

}
