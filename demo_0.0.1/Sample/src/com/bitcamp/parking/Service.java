package com.bitcamp.parking;

import com.bitcamp.Mathutils;

/*
자료형이 다른 여러개의 데이터가 필요.. 자료형이 다르면 같은 배열에 넣을 수 없다.
*/

class Car {
	String number; //(default) : 동일 패키지에서 접근 가능하다. 제한적 공개.
	int time_in;
	int time_out;
}


public class Service {
	private Mathutils util;
	private Car[] list = new Car[20]; // 배열이라는 공간을 만든 것. Car을 만든 것이 아님.
	
	public String getTable() {
		
		String table = "[";
		// for-each : 각 요소를 하나씩 꺼낸다. (번호 사용하지 않음)  for(요소명:배열명)
		for(int i=0; i<list.length; ++i) {
			Car c = list[i];
			if(c != null) { // null=빈자리
				table += i+":"+c.number+",";
			}
		}
		table += "]"; // 문자열을 합친다.
		return table; // return 뒤에 쓰는건 함수의 반환타입 (이경우 string)에 맞춰야함.
	}

	public int input(String number, int inputtime) {
		// 주차한다 = 차 정보를 새로 저장한다.(등록한다)
		int index = -1; // 빈 곳이 없다. 주차장이 꽉 찬 상태. -1 = EOF:end of File
		Car car = new Car();
		car.number = number;
		car.time_in = inputtime; // MathUtils에 메소드 만든 것을 덧붙일 수 있음...
		// 빈자리를 찾는다.(검색한다)
		for(int i=0; i<list.length; ++i) {
			if (list[i] == null ) {
			//-> 빈자리가 있으면 저장.
				index = i;
				break;
			}
		}
		if (index > -1) {// != -1   =>비어있지 않으면 차를 주차한다.
			list[index] = car;

		}
		return index;
	}

	public double output(String number, int outputtime) { //input과 다르게 새로 만드는게 아니라 찾아야함 
		double price = 0;
		Car car = null;
		int index = -1;
		for(int i=0; i<list.length; ++i) {
			Car c = list[i];
			if ( c != null ) {
				if( c.number.equals(number) ) {
				//참조변수간의 같다 비교.. == 보다는 equals 메서드 사용 권장. 객체와 객체 비교.
					car = c;
					index = i;
//					list[i] = null; => 여기에 쓰면 위의 index 지정도 위의 -1 지정도 필요없을 수 있음... 실험해보기
					break;
				}
			}
		}
		if ( car != null ) {
		//1.요금 계산
			car.time_out = outputtime;
			int units = 
					Mathutils.diffMinutes(car.time_in, car.time_out) / 10;
			price = 5000.0 + (units*500.0);
		//2.비우기
			list[index] = null;
		}
		return price;
	}
}
	

