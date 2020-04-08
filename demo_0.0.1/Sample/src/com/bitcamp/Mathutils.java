package com.bitcamp;

import java.util.Random;

public class Mathutils {
	
	public static String convert(int timevalue) { //1750
		int hour = timevalue/100; //17
		int min = timevalue%100; //50
		return ""+hour+"시"+min+"분";
	}
	
	public static int convertMinutes(int timevalue) { //1750
		int hour = timevalue/100; //17
		int min = timevalue%100; //50
		return (hour*60)+min;
	}
	
	public static int diffMinutes(int input, int output) {
		//주차한 시간이 몇분인지
		int out = convertMinutes(output); //1750
		int in = convertMinutes(input); //1000 => 1750-1000
		return out-in; //음수 존재
	}

			
	// 랜덤한 정수
	public static int generate(int digits) {
		// 10진 정수 : (야구게임) 중복 없는 세자리 정수. 중복 없는 10진 정수는 10자리까지 밖에 못만듦.
		// 사용한 값은 표시 해 둔다. (다시 사용하지 않기 위해). 비트연산자를 사용하기도 함.(0과 1만 사용하니 boolean을 쓰는 것과 같은 효과...)
		boolean[] flag = new boolean[10]; // 초기값은 false:[0] ~ [9]
		Random random = new Random();
		int number = random.nextInt(9)+1; // 10진 한자리 값을 하나 뽑아서 저장함.
		flag[number] = true; // 방금 사용했음. = 중복체크 중...
		for(int i=1;i<digits;++i){ 
			int il;
			do { // 10진 한 자리의 값을 임의로 뽑아서 flag 배열의 상태값을 확인한다. == 중복을 확인한다.
				il = (random.nextInt(9)); // 1의 자리 값 0~9 사이
			} while(flag[il]);
			number = number * 10 + il;
			flag[il] = true; // 사용했음.
		}
		return number;
	}
	
//	@Deprecated
//	public static int generate(int digits) {
//		Random random = new Random();
//		int number = random.nextInt(9)+1; // 0번
//		for(int i=1;i<digits;++i){ // 1, 2번
//			number = number * 10 + (random.nextInt(9));
//		}
//		return number;
//	}





/* 야구게임 규칙 : 
 * 3자리 정수 2개를 전달 받아서 
 * 자릿수, 값을 비교한다.
 * top 	  [] [] []
 * bottom [] [] []
 * 
*/
	public static int[] compare(int ptop, int pbottom) {
		int top = ptop;
		int bottom = pbottom;
		int tv;
		int bv; // bottom의 각 자리값
		int strike = 0; // 개수를 세는 변수는 항상 0으로 초기화
		int ball = 0;
		for(int t=0;t<3;++t) {//top
			tv = top % 10;
			bottom = pbottom; //다시 비교
			for(int b=0;b<3;++b) {//bottom
				bv = bottom % 10;
				if( tv == bv ) {//값이 같으면
					if(t == b) { //자리가 같으면
						System.out.print("o");
						++strike;
					}else { //자리가 다르면
						System.out.print("x");
						++ball;
					}
				}
				bottom /= 10;
			} // loop bottom
			top /= 10;
		} // loop top
		int[] rst = {strike, ball}; // new int[2]
		return rst;
	}
}



