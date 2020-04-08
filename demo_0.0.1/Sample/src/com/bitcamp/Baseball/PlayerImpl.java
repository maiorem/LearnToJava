package com.bitcamp.Baseball;

import com.bitcamp.Mathutils;

public class PlayerImpl implements Player {
	protected String name = "Hong";
	private int answer;
	private int call; // 바로 직전에 부른 값을 기억 (전부 기억하려면 배열로)

	@Override
	public String getName() {
		// 복사해서 사본으로 내 보낼 수도 있음.
		return this.name; // 내보냄
	}
	public PlayerImpl setName(String arg) { //=> 반환타입을 클래스명이 아닌 void를 넣어도 됨. 그럴땐 return 삭제
		this.name = arg; // 저장함
		return this; // new를 쓰면 arg값이 아닌 새로운 생성자를 만들어서 반환함. 
	}

	@Override
	public void ready() {
		// 정답을 결정해서 게임을 준비하라.
		this.answer = Mathutils.generate(3); // 필드에 있는 거랑 지역 변수에 있는 거랑 생명 주기가 다름. 

	}

	@Override
	public int request() {
		// 상대에게 정답을 물어봄.
		if(this.call == 0) { // 가장 처음에만 임의 난수를 반환.
			this.call = Mathutils.generate(3); 
		} 
		//이후에는 listen에서 처리 된 값을 반환.
		return call; 
	}

	@Override
	public int[] response(int call) {
		// 상대가 부른 값을 듣고 값을 비교하여 대답.
		return Mathutils.compare(answer, call);
//		int[] rst = new int[2];
//		return rst;
	}

	@Override
	public void listen(int strike, int ball) {
		// 전략이 들어감. 대답을 듣고 다음에 물어볼 값을 냄.
		if(strike + ball == 3) { // 숫자는 다 맞고 자리가 다름.
			// 로테이션
			int a = call/100; // 방금 내가 불렀던 값의 100의 자리
			int b = (call/10)%10; // 10의 자리.
			int c = call%10; // 1의 자리
			call = (b*100) + (c*10) + (a); // 로테이션
		} else {
			call = Mathutils.generate(3); // 임의값
		}
	}

}
