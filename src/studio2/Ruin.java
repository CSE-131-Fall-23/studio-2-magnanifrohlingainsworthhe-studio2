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

		while (startAmount < winAmount && startAmount > 0) {
			if (Math.random() < winChance) {
				System.out.println("Win");
				startAmount++;
			} else {
				System.out.println("Lose");
				startAmount -= 2;
			}
		}
		if (startAmount <= 0) {
			System.out.println("You had a ruin day");
		} else {
			System.out.println("You won YAY");
		}
	}

}
