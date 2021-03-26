package week01.day4_1;

public class Ex02 {

	public static void main(String[] args) {
		
		//
		int a=10, b=20, tmp;
		
		//값의 교환, 임시변수가 하나 필요함
		
/*		a=b;
		b=a;*/
				
		
		tmp =a;
		a=b;
		b=tmp;
				
	    System.out.println("a의 값은" + a);
		System.out.println("b의 값은" + b);
		
	}
}
