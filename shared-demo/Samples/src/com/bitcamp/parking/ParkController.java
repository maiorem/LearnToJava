package com.bitcamp.parking;

import java.util.Scanner;

public class ParkController {
	private Service service;
	private Scanner kb;// 키보드 입력 처리
	// 생성자 : public {클래스명}(){}
	public ParkController() {
		// 생성 시 필드의 초기화 작업
		this.service = new Service();
		this.kb = new Scanner(System.in);//키보드에서...
	}
	
	// 주차요금 프로그램 앞단(사용자의 입출력 제어)
	public void start() {
		System.out.println(":::: 주차장 영업 중 ::::");
		boolean isExit = false;//true:종료, false:계속
		while(!isExit){
			String table = service.getTable();
			System.out.println(table);
			System.out.println("[1]입차 [2]출차 [0]종료 선택 > ");
			int menu = kb.nextInt();// 계속 입력을 받다보면 종종 1.자료형틀림, 2.지나감
			kb.nextLine();
			// 선택에 따라 처리(기능) 실행
			if(menu == 0) {
				isExit = true;// 반복 멈춘다....
			}else {
				if(menu == 1) {// 들어올 때
					System.out.println("[IN]car number > ");
					String number = kb.nextLine();// 키보드 행 전체 가져온다..
					System.out.println("[IN] Time (00xx) > ");
					int timev = kb.nextInt();
					kb.nextLine();
					
					int index = service.input(number, timev);// 어디다?	
					if(index == -1) {
						System.out.println("Full");
					}
				}
				if(menu == 2) {// 나갈 때
					System.out.println("[OUT]car number > ");
					String number = kb.nextLine();// 키보드 행 전체 가져온다..
					System.out.println("[OUT] Time (00xx) > ");
					int timev = kb.nextInt();
					kb.nextLine();// 키보드 비우기...
					
					// 서비스에게 시킬 일... 1. 계산, 2.비우기
					double price = service.output(number, timev);// 수학
					System.out.println("요금 : "+price);
				}
			}
			// 결과 출력
		}//while		
		
		end();
		System.out.println(":::: 주차장 영업 끝 ::::");
	}// start()
	
	public void end() {
		// 프로그램 종료 될 때 뒷 정리
		this.kb.close();// 키보드 닫기
		
	}// end()

}
