package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your start amount: ");
		int startAmount = in.nextInt();
		System.out.println("Enter your win chance: ");
		double winChance = in.nextDouble();
		System.out.println("Enter your win amount: ");
		int winAmount = in.nextInt();
		
		if(Math.random()<winChance) {
			System.out.println("Win");
		}else {
			System.out.println("Lose");
		}
		
	}

}
