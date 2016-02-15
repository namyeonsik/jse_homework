package forloop;

import java.util.Scanner;

public class InputGugudan {
/**
 * 단수를 입력받아서 구구단을 출력함
 * 예를 들어 2를 입력하면 2*1 ~ 2*9 = 18
 * 단, 입력값이 0 또는 음수는 불허
 * for loop...
 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("단수 입력 :");
		int num = sc.nextInt();
		
		if(num == 0 || num < 0){
			System.out.println("0 또는 음수값은 불허입니다.");
		}else{
			for(int i=1; i<10; i++){
				System.out.println(num + " * " + i + " = " + num*i);
			}
		}
	}
}
