
package com.bitcamp;

public class Overview {

	public static void main(String[] args) {
	
		int[] array = new int[10];
		int sp = -1; // stack point
		//데이터를 추가한다=push
		array[++sp] = 1; // 저장보다 증가를 먼저 해야하기 때문에 왼쪽에 증감연산자
		array[++sp] = 2;
		array[++sp] = 3;
		array[++sp] = 4;
		System.out.println(sp); // [sp](sp번째) 요소에 4를 저장했고 그게 마지막 값이다.
		//꺼내서 버린다=pop한다.
		int value = array[sp--]; // 변수 저장부터 하고 감소를 나중에 하기 때문에 오른쪽에
		System.out.println(value);
		//스택 방식은 끝에서 입출력이 생긴다.
		
	}
		
	public static void array_01() {	
	
		int last = -1; // 마지막에(가장 최근에) 추가 된 번호(갯수, 요소의 번호 = 연속 상태로 저장을 할 거라는 말.)
		int[] array = new int[10];
		// 배열에 요소 추가하기 : 0 -> 9번까지의 순서.
		for(int i=0; i < 20; ++i) {
			++last;
			array[last] = i+1; // 에러의 여지가 있는 부분 앞을 확인한다.
			System.out.print(array[last]+",");
			if(last >= array.length - 1) { // 요소번호 범위 확인.
				break;
			}

		}
		System.out.println();
		// 역순 출력하기.
		for(int j=last; j >= 0; --j) {
			System.out.print(array[j]+",");
		}
		System.out.println();
		System.out.println("last :"+last);// 마지막 저장번호
	}

}
