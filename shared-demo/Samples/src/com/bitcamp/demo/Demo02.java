package com.bitcamp.demo;

public class Demo02 {
	public static void main(String[] args) {
		// 1 ~ 25 연속 정수 출력하는 몇 가지 방법 : 5 행 5 열
		// 출력 폼 잡는다... 값을 삽입한다....
		int value = 0;
		for(int row=0; row < 5; ++row) {	// 행:부서
			for(int col=0; col<5; ++col) {	// 열:부서원
				// row col
				++value;// 출력할 값을 가져오기...
				System.out.print(value+"\t");				
			}
			System.out.println("");
		}
				
		int a;
		int b;
		for(a=1; a<=5 ; a++) {
			for(b=1; b<=10 ; b++) {
				System.out.print("*");
			}
			System.out.println("");
		}
				
		for(int i=1; i<=25; i++) {
			System.out.print(i+"\t");
			if( (i%5) == 0) {
				System.out.println("");
			}
		}
		
		int count = 0;
		for(int i=1; i<=25; i++) {
			System.out.print(i+"\t");// 행을 내리는 조건
			count++;
			if( count == 5/*출력한 개수가 5개이면*/) {
				System.out.println("");
				count = 0;// 각 행의 출력한 개수
			}
		}
		
	}// end main
	
	public void demo01_01() {
		int m;
		int value;
		m = 5;
		value = 21;
		// 수학적 사고....
		for( ; value > 0 ; value -= 5) {
			System.out.println(value);
		}
		// 종료 후
		System.out.println("end loop : "+value);
		if( value == 0) {
			System.out.println("true : "+value);
		}else {
			System.out.println("false : "+value);			
		}
		

	}

}
