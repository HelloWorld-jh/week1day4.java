package week01.day4_1;

import java.util.Scanner;

public class Ex03 {

	
	public static void main(String[] args) {
		
		// 1~10���� �Է¹��� ���� ���� ���Ͻÿ�
 		
		//���� ����
		int number; // �Է�
		int I=1; //�ݺ������
		

		int Sum=0; //ó��
		 Scanner sc = new Scanner(System.in);
		 number = sc.nextInt();
		 
		 
		while(I < 10) {
			Sum = Sum + number ;
			I = I+1;
			final int MAX = 10;
			
			
		}
		   
		
		
		System.out.println( Sum);
		System.out.println( "�Է¹��� ���� ��:"  +  Sum  );
	}
}
