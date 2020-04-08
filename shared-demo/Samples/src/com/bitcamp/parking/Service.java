package com.bitcamp.parking;

import com.bitcamp.demo.MathUtils;

/*
 * 자료형이 다른 여러 개의 데이터가 필요
 */
class Car{
	String number;//(default) : 동일 패키지에서 접근 가능
	int time_in;
	int time_out;
}

public class Service {
	private MathUtils util;
	private Car[] list = new Car[20];// 배열 공간
	
	public String getTable() {
		String table = "[";
		// for-each : 각 요소를 하나씩 꺼낸다...(번호 사용하지 않음)
		for(int i=0; i<list.length; ++i) {
			Car c = list[i];
			if( c != null ) {// 빈 자리
				table += i+":"+c.number+",";
			}
		}
		table += "]";// 문자열을 합친다....
		return table;
	}

	public int input(String number, int inputime) {
		// 주차한다... : 차 정보를 새로 저장한다..(등록한다.)
		int index = -1;	// End Of File
		Car car = new Car();
		car.number = number;
		car.time_in = inputime;// MathUtlis.
		// 빈 자리 찾는다... 검색
		for(int i=0;i<list.length;++i) {
			if( list[i] == null ) {
				index = i;
				break;
			}
		}
		if( index > -1 ) {// != -1
			list[index] = car;
		}
		return index;
	}

	public double output(String number, int outputime) {
		double price = 0;//	0.0
		Car car = null;
		int index = -1;
		for(int i=0; i<list.length;++i) {
			Car c = list[i];
			if( c != null ) {
				if( c.number.equals(number) ) {
					// 참조변수간의 같다 비교... == 보다는 메서드를 사용 권장
					car = c;
					index = i;
//					list[i] = null;
					break;
				}
			}
		}
		if( car != null ) {
			//1.계산
			car.time_out = outputime;
			int units = 
				MathUtils.diffMinutes(car.time_in,car.time_out ) / 10;
			price = 5000.0 + (units*500.0);
			//2.비우기
			list[index] = null;
		}
		return price;
	}

	// 주차 요금 계산 기능....
}
