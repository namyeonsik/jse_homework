package CalenderProject;

import java.util.Scanner;

public class DateController {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DateService service = new DateServiceImpl();
		
		int year = 0, month = 0, state = 0;
		
		while(true){
			System.out.println("===========날짜 프로그램===========");
			System.out.println("[메뉴] \n 1. 해당년월의 마지막날 구하기"
					+ "\n 2. 현재 날짜와 시간 구하기"
					+ "\n 8. 달력보기"
					+ "\n 9. 종료");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("해당 년을 입력 후 해당 월을 입력하시오.");
				year = sc.nextInt();
				month = sc.nextInt();
				state = service.getEndDayOfMonth(year, month);
				
				if(state == 0)
					System.out.println("[입력오류] 1~12월로 입력하세요.");
				else
					System.out.println(year + "년 " + month + "월의 마지막 날은 " + state + "일");
				
				break;
				
			case 9: return;
	        	 
			default:break;
			}		
		
			
	
		}
	}
}
