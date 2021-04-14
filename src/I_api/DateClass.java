package I_api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		Date today = new Date(); // 기본적으로 현재날짜와 시간이 저장되어있음
		System.out.println(today);
				
		//날짜 -> 문자열
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss.SSS"); // HH는 24h .SSS는 초를 1/1000초 단위로 표현
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd(E) hh:mm:ss a"); //(E)는  요일. hh는 12h 그래서 오전오후인지 알려주는게 a
		
		System.out.println(sdf1.format(today));
		System.out.println(sdf2.format(today));
		System.out.println(sdf3.format(today));
		System.out.println(sdf4.format(today));
		
		
		//문자열 - > 날짜
		String str = "1987년 05월 01일";
		SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy년 MM월 dd일");
		//Date dateStr = sdf5.parse(str); 에러가 나서 try, catch로 해줌.
		
		try {
			Date dateStr = sdf5.parse(str);
			System.out.println(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Calendar cal = Calendar.getInstance(); //싱글톤 패턴
//		Calendar cal = Calendar.getInstance(); //이렇게 하면 객체를 여러개 만들어서 사용하는게 아니라, 이미 만들어진 객체를 다시 불러오는? 
		new Date();
		
		cal.setTime(new Date());
		cal.set(2020, 8, 29); //2020/09/29(월은 0부터 시작)
			 
		System.out.println(cal.getTime());
		
		//날짜 계산
		cal.add(Calendar.YEAR, 1);
		cal.add(Calendar.MONTH, 2);
		cal.add(Calendar.DAY_OF_MONTH, -3);
		cal.add(Calendar.HOUR, 4);
		cal.add(Calendar.MINUTE, 10);
		cal.add(Calendar.SECOND, -15);
		
		System.out.println(sdf3.format(cal.getTime()));
		
	}

}
