package com.bitcamp;

import com.bitcamp.Baseball.BaseBall;

//import com.bitcamp.parking.ParkController;


public class Appstarter {

	public static void main(String[] args) {
		
		BaseBall game = new BaseBall();
		game.start();
		
//		ParkController carparking = new ParkController(); //생성하는 함수. : 생성자
//		carparking.start();
//		// 사용자 : 주차장 관리자
//		
//		Mathutils.compare(234, 674);
//		int number;
//		for(int i=0;i<5;++i) {
//			number = Mathutils.generate(3);
//			System.out.println(number);
//		}

	}
}

	
//	public void math_01(String[] args) {
//		
//		int min = 10;
//		int max = 20;
//		int length = max-min+1; //갯수를 구하는 공식
//		for (int i = min; i <= max; ++i ) { //i를
//			System.out.print(i+",");
//		} 
//		System.out.println();
//	
//		int v = min;
//		for (int i = 0; i < length; ++i ) { // i번
//			System.out.print(v+",");
//			v++;
//		} 
//		System.out.println();
//	}
//}
