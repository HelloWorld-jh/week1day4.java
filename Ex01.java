package week01.day4_1;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
	
       // ���� �Է¹޾Ƽ� = > ¦���� ���� ��� ( �ݺ�Ƚ�� = MAX )
		
	   //���� ����
		 int number;   // �Էº���
		 int even_cnt =0; // ��º���
         
		 int i=0; // �ݺ������
         final int MAX = 5;		
		
		
		//�Է�
 		//ó��
         Scanner sc = new Scanner(System.in);
         while( i< MAX) {
        	 i=i+1;
        	 number = sc.nextInt();
        	 if( number %2 ==0 ) {
        		 even_cnt = even_cnt +1;
        	 }
         
         }
		
		
		
		//���
		System.out.println("¦���� �� ����=" + even_cnt);
		//�ַܼ� ����ϱ����� ��ӵ� ��ȣ
	}
	
}
