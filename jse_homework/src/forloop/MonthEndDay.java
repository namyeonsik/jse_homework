package forloop;

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
		System.out.println("월 입력 :");
		int month = sc.nextInt();
		
		switch (month) {
		case 1:case 3:case 5: case 7: case 8: case 10: case 12: System.out.println("31일");break;
		case 4:case 6: case 9: case 11: System.out.println("30일");break;
		case 2: System.out.println("29일");break;

		default:System.out.println("잘못 입력됨.");break;
		}
		
	}
}
