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
			position += dice;
		}
		else if(option == SNAKE) {
			position -= dice;
		}
		else {
			position = position;
		}
		if(position < 0) {
			position =0;
		}
	}

	public static void main(String[] args) {
		while(position<100) {
		int dice = diceRoll();
		System.out.println("dice= "+dice);
		optionCheck(dice);
		System.out.println("position = "+position);
		}
	}
}
