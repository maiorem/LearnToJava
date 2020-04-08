package com.bitcamp.demo;

/*	배열... 자료형이 같은 여러 개를 모아놓은 자료구조
 * 	배열명
 * 	요소 - 각각 데이터
 * 		번호로 구분하여 지정 : int
 * 	길이 : 고정, 최대 개수( - 현재 개수 )
 * 		[0] ~ [길이-1] 번 요소 마지막
 *	** 번호의 범위를 벗어나지 않아야 한다.... IndexOutofBounds
 */
public class DemoArray {

	public static void main(String[] args) {
		// 2.빈 자리를 찾아 삽입(추가)
		int[] numbers = {1,4,3,4,0,8,0};
		int isEmpty = -1;
		for(int i=0;i<numbers.length;++i) {
			if(numbers[i] == 0) {
				isEmpty = i;// 위치
				break;// 더이상 찾지 마라....
				// 검색 결과 : 없다 있다( 하나여야 한다, 여러 개 )
			}
		}
		if(isEmpty != -1) {
			numbers[isEmpty] = 10;
		}
		
		
		// 1.요소의 값을 추가하는 동작
//		int[] numbers = new int[10];
//		// 반드시 요소번호를 지정해서 입출력해야 한다...
//		int index = 0;// 곧 저장할거야...
//		numbers[index] = 1;// 추가
//		System.out.println(index+1);
//		++index;// 0번 저장, 지금 1개 
//		numbers[index] = 3;// 추가
//		System.out.println(index+1);
//		++index;
//		// 길이 10인 배열에 index 개 저장(추가)했다....
//		if(index < numbers.length) {
//			System.out.println("can store");
//		}
		
		// 1. 정수형 1차배열 - 길이 10
//		int[] numbers = new int[10];
//		for(int i=0; i<numbers.length; ++i) {
//			System.out.println(i+"-"+numbers[i]);// 요소 == 배열명[번호]			
//		}
//		System.out.println(numbers);// 배열명 == 참조변수
		// 2. 정수형 1차배열 - 초기값을 지정하는...
//		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
//		for(int i=0; i<numbers.length; ++i) {
//			System.out.println(i+"-"+numbers[i]);// 요소 == 배열명[번호]			
//		}
		
		// 3. 정수형 1차배열 - 초기값을 지정하는...
//		int[] numbers = new int[]{1,2,3,4,5};
//		for(int i=0; i<numbers.length; ++i) {
//			System.out.println(i+"-"+numbers[i]);// 요소 == 배열명[번호]			
//		}

	}

}








