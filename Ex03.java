package week01.day4_1;

import java.util.Scanner;

public class Ex03 {

	
	public static void main(String[] args) {
		
		// 1~10까지 입력받은 수의 합을 구하시오
 		
		//변수 선언
		int number; // 입력
		int I=1; //반복제어변수
		

		int Sum=0; //처리
		 Scanner sc = new Scanner(System.in);
		 number = sc.nextInt();
		 
		 
		while(I < 10) {
			Sum = Sum + number ;
			I = I+1;
			final int MAX = 10;
			
			
		}
		   
		
		
		System.out.println( Sum);
		System.out.println( "입력받은 수의 합:"  +  Sum  );
	}
}
