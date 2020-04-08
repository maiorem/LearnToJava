package com.bitcamp.demo;
// (default)
public class Demo01 {

	// fields : 변수
	private int number;
	
	// methods : 함수
	public static void main(String[] args) {
		// 시스템(콘솔)이 바로 실행시킨다...
		Demo01 inst = null;// = new Demo01();
//		if( inst == null) {
//			// 없다.... 예외, 오류 처리
//		}else {
//			// 있다.... 
//			inst.nonstatic(args);
//		}
	}
	public void nonstatic(String[] args) {
		// non-static 들은 생성(메모리에 저장) 후 사용 가능
		System.out.println(number);
	}
	
	
}
