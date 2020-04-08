package com.bitcamp.Baseball;

/**
 * <규칙> <br/>
1.중복없는 세자리 정수 <br/>
2.각 자리 값을 비교하여 대답  <br/>
값이 같으면서 <br/>
위치가 같으면 “스트라이크” <br/>
위치가 다르면 “볼” <br/>
3.“스트라이크” 개수가 세개면 정답. <br/>
<br/>
<순서> <br/>
1.각자 자신의 정답을 정한다. <br/>
2.세자리 정수를 상대에게 부르면 상대는 자신의 정답과 비교 후 스트라이크와 볼의 갯수를 대답한다. <br/>
3.서로 한 번씩 돌아가면서 물어보고 대답하는 것을 발견한다. <br/>

 * @author user
 *
 */

public class BaseBall {
	
	public void start() {
		Player[] pls = new Player[2]; // 선수대기실
		pls[0] = new PlayerImpl();  // 선수
		pls[1] = new Hong();
		
		int caller = 0;
		boolean run = true;
		
		pls[0].ready();
		pls[1].ready();
		
		do {
			int call = pls[caller].request(); // 부른다
			int [] resp = pls[1-caller].response(call); // 대답한다
			pls[caller].listen(resp[0], resp[1]);// 대답을 받는다. 듣는다.
			// 배열형은 참조형... 배열을 준다는 것은 즉 주소를 주는 것이므로 변조 가능성이 있다.
			
			System.out.println(call+"->"+"S: "+resp[0]+", B: " +resp[1]);
			
			caller = 1-caller;
			if( resp[0] == 3 ) { // 스트라이크 개수가 3이면 
				run = false;
				// break; -> 로 while(run) 안쓰고 빼도 됨.
			}
		} while (run); // run의 값이 true이면 반복, false가 되면 멈춤
		System.out.println("winner :" + (1-caller));
	}

}
