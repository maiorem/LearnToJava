package com.bitcamp.demo;

import com.bitcamp.parking.ParkController;

public class AppStarter {
	
	public static void main(String[] args) {
		ParkController carparking = new ParkController();// 생성하는 함수:생성자
		carparking.start();//non-static member
		// 사용자 : 주차장 관리자....

	}
	
	public void math_01(String[] args) {
		// 1차함수(Y=wX+B), 표준편차, 분산(포) : 데이터 분석, 계산
		int min = -5;
		int max = 20;
		int length = max-min+1;
		for( int i=min; i<=max ; ++i) {
			System.out.print(i+"," );// i를
		}
		System.out.println();
		
		// 1에서부터 5개의 정수들....
		int v = min;
		for( int i=0; i < length ; ++i) {// i번
			System.out.print(v+"," );
			v++;
		}
		System.out.println();
		
		
		
		
	}// end main	

	public void gugudan() {
		Googudan go = new Googudan();
		go.showTable();
		go.show();
		go.showBy(5, 10);
//		Googudan.show();
		
	}

}// end class AppStarter
