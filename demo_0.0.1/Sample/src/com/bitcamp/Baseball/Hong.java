package com.bitcamp.Baseball;

// 확장(보완) : 상속관계. extends {클래스명} => 하나만 쓸 수 있음. 단일상속.
public class Hong extends PlayerImpl { // 부모클래스=수퍼클래스의 멤버들을 모두 가지고 있는 상태.
	// private 멤버는 가져올 수 없음.
	public void viewName() {
		System.out.println(name); // 부모가 자식에게만 허용하기 위해 protected로 필드로 바꾸면 접근 가능.
	}
	//내가 더 추가하고 싶은 것들 나열...

	@Override
	public void ready() {
		System.out.println("Player Hong");
	}
// 부모클래스에 있는 메서드 중 일부를 바꾸고싶다면 (추가x)
	// alt + shift + s (=우클릭 source 메뉴) -> override/implement Method
	
	
	
}
