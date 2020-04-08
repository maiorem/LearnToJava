package com.bitcamp;

public class DemoArray {
	public static void main(String[] args) {
		
		
		
		
	// 2. 빈자리를 찾아 삽입(추가) => 빈자리를 찾고/삽입한다.
		int[] numbers = {1,4,3,0,6,8,0}; //요소가 0이면 비어있는 것으로 보겠다...
		int isEmpty = -1;
		for(int i=0;i<numbers.length;++i) {
			if(numbers[i] == 0) {
				isEmpty = i; //0의 위치. 
				break; //브레이크를 걸면 찾는 순간 멈춤. 더이상 안찾음(하나만 찾음). 안걸면 뒤쪽에 걸림.
				//검색 결과 : 없다. 있다(하나여야 한다. 여러개이다).
			}
		}
		if(isEmpty != -1) { // -1은 검색된 게 없음을 의미
			numbers[isEmpty] = 10; // 삽입.
		}
		// 검색의 기본 형태.
		
		
		// 1.요소의 값을 추가하는 동작
//		int[] numbers = new int[10];
//		// 배열은 반드시 요소번호를 지정해서 입출력을 해야하므로
//		int index = 0; // 아직 저장하진 않았음. 곧 저장할거야..
//		numbers[index] = 1; //1 값을 추가(저장).
//		System.out.println(index+1);
////		numbers[index] = 3; //추가가 아니라 덮어씀. 변경.
////		System.out.println(index+1);
//		++index; //0번 저장, 지금 1개
//		numbers[index] = 3; //추가(저장).
//		System.out.println(index+1);
//		++index; // 길이 10인 배열에 index갯수 만큼 저장(추가)했다.
//		if (index < numbers.length) {
//			System.out.println("can store");
//		}
//		
		
		
//		//1. 정수형 1차배열. 길이는 10
//		int[] numbers = new int[10];
//		for(int i=0; i<numbers.length; ++i) {
//			System.out.println(i+"-"+numbers[i]);//요소 == 배열명[번호]
//		}
//		System.out.println(numbers);//배열명 == 참조변수

		//2.정수형 1차배열 - 초기값을 지정
//		int[] numbers = {0,1,2,3,4,5,6,7,8,9,10};//중괄호 안에 초기값을 넣을 수 있음.
//		for(int i=0; i<numbers.length; ++i) {
//			System.out.println(i+"-"+numbers[i]);//요소 == 배열명[번호]
//		
//		}
	
		//3.정수형 1차배열 - 초기값을 지정
//		int[] numbers = new int[] {0,1,2,3,4,5};
//		for(int i=0; i<numbers.length; ++i) {
//			System.out.println(i+"-"+numbers[i]);//요소 == 배열명[번호]
//		
//		}
	}
}