package com.bitcamp.baseball;

public class Baseball {

	private Player left;
	private Player right;
	
	public Baseball(){
		this.left = new Jung();
		this.right = new Hong();
	}
	
	public void start() {
		left.ready();
		right.ready();
		int nowCaller = 0;
		boolean isContinue = true;
		do {
			int call = (nowCaller==0)? left.request():right.request();
			int[] ar = (nowCaller==0)? right.response(call):left.response(call);
			int strike = ar[0];
			int ball = ar[1];
			if(nowCaller==0) {
				left.receive(strike, ball);
			}else{
				right.receive(strike, ball);
			}
			if( strike == 3) {
				System.out.println("winner : "+nowCaller);
				isContinue = false;
			}
			System.out.print(call);
			System.out.println("-> S: "+strike+", B: "+ball);
			nowCaller = 1 - nowCaller;
		}while( isContinue );
	}
}
