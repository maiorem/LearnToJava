package com.bitcamp.demo;
// 패키자가 다른 클래스 import 패키명.클래스명
public class Googudan {
	// 멤버
	//    변수 : field
	private int serialnumber;
	
	public void showTable() {
//		for(int a = 1; a <=3; a+=1) {
//			for(int m=1; m <=9; ++m){
//				for(int j=1; j <=3 ; ++j){
//					
//				}		
//			}
//		}
		// [2][3][4]
		// [5][6][7]
		// [8][9][10]
		int cols = 4;
		for(int left = 2; left <=9; left+=cols) {
			for(int m=1; m <=9; ++m){
				for(int j=0; j < cols ; ++j){
					int i = left + j;// 출력할 단 값
					int k = i * m ;
					System.out.print(i+" x "+m+" = "+k+"\t");
				}		
				System.out.println();
			}
		}
	}
	
	//		함수 : method > 실행 내용
	public void showBy(int start, int end) {// start < end
		System.out.println("구구단 출력하기");
		for(int d=start; d <=end ; ++d) {
			dan_print(d);	
		}
	}
	public void show() {
		System.out.println("구구단 출력하기");
		for(int d=2; d <=9 ; ++d) {
			dan_print(d);	
		}
	}
	public void dan_print(int dan) {// dan = 2;값
		int i;
		// 이 부분이 계속해서 재사용될거 같애...
		for(i = 1; i <= 9; ++i)
		{
			System.out.println(dan+" x "+i+" = "+(dan*i)+"\t");
		}
		
	}// show() end
	
}// class end
