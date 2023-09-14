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
		System.out.println("Enter the number of days you want to gamble: ");
		int days = in.nextInt();

		int currentAmount = startAmount;
		
		for (int i = 0; i < days; i++) {

			currentAmount = startAmount;
			
			while (currentAmount < winAmount && currentAmount > 0) {
				if (Math.random() < winChance) {
					currentAmount++;
				} else {
					currentAmount -= 2;
				}
			}
			if (currentAmount <= 0) {
				System.out.println("You had a ruin day");
			} else {
				System.out.println("You won YAY");
			}
		}
	}

}
