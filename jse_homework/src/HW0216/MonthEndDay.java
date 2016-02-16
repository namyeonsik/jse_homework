package HW0216;

import java.util.Scanner;

public class MonthEndDay {
/**
 * 
 * 월을 입력하면 해당 월의 끝날이 몇일 출력하는 프로그램
 * 1을 입력하면 31일
 * 단, 2월은 29일로 통일
 * 주의점..입력값이 1~12 를 넘어서면 잘못입력
 * sw..
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("연도, 월 입력 :");
		int year = sc.nextInt();
		int month = sc.nextInt();
		int state = 0;
		
		switch (month) {
		case 1:case 3:case 5: case 7: case 8: case 10: case 12: state = 31;break;
		case 4:case 6: case 9: case 11: state = 30;break;
		case 2: state = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))? 29: 28;break;
	        	 
		default:;break;
		}		
		
		if(state == 0)
			System.out.println("[입력오류] 1~12월로 입력하세요.");
		else
			System.out.println(year + "년 " + month + "월의 마지막 날은 " + state + "일");
	}
}
