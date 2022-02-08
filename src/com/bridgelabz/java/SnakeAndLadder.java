package com.bridgelabz.java;

import java.util.Random;

public class SnakeAndLadder {
	static int position = 0;
	static final int NO_PLAY = 0;
	static final int LADDER = 1;
	static final int SNAKE = 2;
	public static int diceRoll() {
		Random random = new Random();
		int dice = random.nextInt(6)+1;
		return dice;
	}
	public static void optionCheck(int dice) {
		Random random = new Random();
		int option = random.nextInt(3);
		if(option == LADDER) {
			System.out.println("LADDER");
			position =position + dice;
		}
		else if(option == SNAKE) {
			System.out.println("SNAKE");
			position =position - dice;
		}
		else {
			System.out.println(NO_PLAY);
			position=position;
		}
		if (position<=0)
			position=0;
	}

	public static void main(String[] args) {
		System.out.println("dice= "+diceRoll());
		int dice = diceRoll();
		System.out.println("dice= "+dice);
		optionCheck(dice);
		System.out.println("position = "+position);

	}

}
