package week01.day4_1;

public class arraytest2 {

	public static void main(String[] args) {
		
		//int[] arry = new int[4];
		// ���� : �迭�� ��� �� �迭 �� ���� ���� ����ϱ�
		
		//�迭 ��ü ���� �� ���
		int[] arry2 = {90,80,30,40}; //�迭�� ���� �� �ʱ�ȭ//int[] arry=new int[4];
		int sum = 0;
		int sumFor=0;
		
		
		System.out.println( sum);
		//�迭 �ݸ� �����ϱ�
		System.out.println(arry2[0]);
		System.out.println(arry2[1]);
		System.out.println(arry2[2]);
		System.out.println(arry2[3]);
		
		
		sum = arry2[0] + arry2[1]+ arry2[2] + arry2[3];
		System.out.println("�迭�� ��=" + sum);
		
		//�迭�ݺ��� ����ϱ�
		for(int i=0; i<4; i++) {
			System.out.println( arry2[i]);
			
		}
		for(int i=0; i<4; i++) {
			sumFor = sumFor + arry2[i];
			
		}
		System.out.println("�ݺ����� ����� �迭�� ��=" + sumFor);
	}
}
