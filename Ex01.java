package week01.day4_1;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
	
       // 수를 입력받아서 = > 짝수의 개수 출력 ( 반복횟수 = MAX )
		
	   //변수 선언
		 int number;   // 입력변수
		 int even_cnt =0; // 출력변수
         
		 int i=0; // 반복제어변수
         final int MAX = 5;		
		
		
		//입력
 		//처리
         Scanner sc = new Scanner(System.in);
         while( i< MAX) {
        	 i=i+1;
        	 number = sc.nextInt();
        	 if( number %2 ==0 ) {
        		 even_cnt = even_cnt +1;
        	 }
         
         }
		
		
		
		//출력
		System.out.println("짝수의 총 개수=" + even_cnt);
		//콘솔로 출력하기위한 약속된 기호
	}
	
}
