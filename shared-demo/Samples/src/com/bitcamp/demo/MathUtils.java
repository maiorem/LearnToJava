package com.bitcamp.demo;

import java.util.Random;

/**
 * 계산기 feat. Math, Random
 * - static methods
 * @author bit0
 *
 */
public class MathUtils {
	
	public static String convert(int timevalue) {//1750
		int hour = timevalue/100;// 17
		int min = timevalue%100;	// 50
		return ""+hour+"시 "+min+"분";
	}
	public static int convertMinutes(int timevalue) {//1750
		int hour = timevalue/100;// 17
		int min = timevalue%100;	// 50
		return (hour*60)+min;	// 10분, 5분
	}
	public static int diffMinutes(int input, int output) {
		// 주차한 시간(분)
		int out = convertMinutes(output);//1750
		int in = convertMinutes(input);//1000
		return out-in;	// 음수?
	}

	/**
	 * 10진 정수를 반환한다...
	 * @param digits 자리수
	 * @return
	 */
	public static int generate(int digits) {
		// 10진 정수
		Random random = new Random();
		int number = random.nextInt(9)+1;//0
		for(int i=1;i<digits;++i){	//1,2
			number = number * 10 + (random.nextInt(9));
		}
		return number;
	}
	
	/**
	 * 3자리 정수 2개를 전달받아서...
	 * - 자릿수,값을 비교한다...
	 * top 		[2][3][4]
	 * bottom 	[3][5][6]
	 */
	public static void compare(int ptop, int pbottom) {
		// 123
		int top = ptop;
		int bottom = pbottom;
		int tv;
		int bv;	// bottom 의 각 자리 값
		for(int t=0;t<3;++t) {// top
			tv = top % 10;
			bottom = pbottom;//다시 비교
			for(int b=0;b<3;++b) {	//bottom			
				bv = bottom % 10;
				if( tv == bv ) {// 값이 같으면
					if(t == b) {//자리 같으면
						System.out.print("O");
					}else {//자리 다르면
						System.out.print("x");
					}
				}
				bottom /= 10;				
			}// loop bottom
			
			top /= 10;
		}// loop top
	}
	
}
