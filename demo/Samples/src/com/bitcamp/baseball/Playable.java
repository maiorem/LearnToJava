package com.bitcamp.baseball;

public interface Playable {
	public void ready();
	public int request();
	public int[] response(int arg);
	public void receive(int strike, int ball);
}
