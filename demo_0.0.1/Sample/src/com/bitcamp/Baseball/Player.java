package com.bitcamp.Baseball;

public interface Player {
// 클래스가 아니기 때문에 인스턴스 생성 불가. 클래스만 인스턴스를 new 해서 붙일 수 있다. 
//프로젝트의 사양서. 설명서를 만드는 것이 인터페이스. 실제로 실행되는 상태가 아님.
// new 구현체(클래스)를 만들어서 사용해야 한다.
// 정의하는 게 아니라 목록을 쓴다.
	// 필드 : 상수만 선언 가능. :final => 변경이 불가능하기 때문에 private을 쓰지 않는다. 상수 표현은 final이지만 인터페이스에선 생략해도 붙은 걸로 인지함.
	public final int CODE = 100; 
	// 멤버 : 모두 추상(abstract)이어야 한다. 구현이나 정의 없이 추상 메서드만 가능. (중괄호가 없다)
	public abstract String getName(); // abstract 생략 가능. 
	
	public abstract void ready(); // 번호를 정해서 게임을 준비하라.
	
	public abstract int request();
	

	public abstract int[] response(int call);

	public abstract void listen(int strike, int ball);

	
	
}
