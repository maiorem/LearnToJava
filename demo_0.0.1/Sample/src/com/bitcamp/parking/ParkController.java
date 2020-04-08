package com.bitcamp.parking;

import java.util.Scanner;

public class ParkController {
	private Service service;
	// 생성자 : public {클래스명}(){}
	private Scanner kb; // 키보드 입력 처리 -> 소괄호 안에 입력을 실제로 받는 방법을 제시. 키보드?
	
	public ParkController() {
		//생성 시 필드의 초기화 작업을 한다.
		this.service = new Service(); // this : 이것. 이 인스턴스...
		this.kb = new Scanner(System.in); //키보드에서... (입력받을 준비)
	}
	
	// 주차요금 계산하는 프로그램 앞단(전면)-> 사용자가 접촉하는 부분. 사용자 입출력 제어.
	public void start() {
		// main처럼 시작
		System.out.println("::::주차장 영업 중::::");
		boolean isExit = false;//true가 종료인지 계속 할 것인지 생각할 것. "true"종료 "false"계속
		while(!isExit){
			String table = service.getTable();
			System.out.println(table);
			System.out.println("[1]입차 [2]출차 [0]종료 선택> ");
			int menu = kb.nextInt(); //계속 입력을 받다보면 종종 1.자료형 틀림 2.지나감 문제가 생길 수 있음.
			// 지나가는 경우가 생길 땐 nextLine(); 실행
			kb.nextLine();//키보드 비우기
			if(menu == 0) { 
				isExit = true; // 반복은 멈추는 상황이 나와야 함.
			} else {
				if(menu == 1) { // 차가 들어올 때
					System.out.println("[IN] car number > ");
					String number = kb.nextLine(); // 키보드 입력의 행 전체를 가져온다=키보드를 비우는 동작.(한글자라도 있으면 계속 읽으니 입력하려면 키보드를 비워야한다)
					System.out.println("[IN] Time (00xx) > ");
					int timev = kb.nextInt();
					kb.nextLine();//키보드 비우기
					int index = service.input(number, timev); // 어디에 주차했는지 반환처리로 확인.
					if(index == -1) {
						System.out.println("FULL");
					}
				} 
				if(menu == 2) { // 차가 나갈 때
					System.out.println("[OUT] car number > ");
					String number = kb.nextLine();
					System.out.println("[OUT] Time (00xx) > ");
					int timev = kb.nextInt();
					kb.nextLine();//키보드 비우기
					// 서비스에게 시킬 일. 1.계산 2.비우기
					double price = service.output(number, timev); 
					System.out.println("요금 :"+price);
				} 
			}
		}
		end();		
		System.out.println("::::주차장 영업 끝::::");
	}
	public void end( ) {
		//프로그램이 종료될 때 뒷정리 -> 키보드 닫기 등
		this.kb.close();//키보드 닫기. this는 생략 가능.
	}

}
