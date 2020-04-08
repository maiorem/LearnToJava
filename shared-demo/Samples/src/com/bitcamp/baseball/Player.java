package com.bitcamp.baseball;

import java.util.Random;

public class Player implements Playable{
	private int answer;
	private int call;
	public int random() {
		boolean[] flag = new boolean[10];
		int value = 0;
		for(int i=0; i<3; ++i) {
			int r;
			do{
				r = new Random().nextInt(9)+1;
			}while(flag[r]);
			value = value * 10 + r;
			flag[r] = true;
		}
		return value;
	}

	@Override
	public void ready() {
		this.answer = random();
		this.call = random();
	}

	@Override
	public int request() {
		return call;
	}

	@Override
	public int[] response(int arg) {
		int strike = 0;
		int ball = 0;
		for(int a = 1; a < 1000; a*=10) {
			int aa = (answer/a)%10;
			for(int b = 1; b < 1000; b*=10) {
				int bb = (arg/b)%10;
				if( aa == bb ) {
					if( a == b ) {
						++strike;
					}else {
						++ball;
					}
				}
			}			
		}
		
		int[] ar = new int[2];
		ar[0] = strike;
		ar[1] = ball;
		return ar;
	}

	@Override
	public void receive(int strike, int ball) {
		int sum = strike + ball;
		if( sum < 0 || sum > 3 ) {
			System.out.println("you lie");
			System.exit(0);
		}
		if( strike + ball == 3) {
			int a = call/100;
			int b = (call/10)%10;
			int c = call%10;
			call = (b*100) + (c*10) + a; 
		}else {
			call = random();
		}
	}
}
