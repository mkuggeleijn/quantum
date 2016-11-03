package quantum;

import java.util.Random;

public class DiceHandler {

	private static Random randomGen = new Random();
	
	public static int randomInt(int min, int max){
		return randomGen.nextInt((max - min) + 1) + min;
	}
	
	public static int rollD6(){
		return randomInt(1,6);
	}
	
	public static int[] rollDice(int numberOfDice){
		int[] result = new int[numberOfDice];
		for (int x = 0; x < numberOfDice; x++){
			result[x] = rollD6();
		}
		return result;
	}
	
}
