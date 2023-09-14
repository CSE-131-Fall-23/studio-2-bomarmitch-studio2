package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		//Starting Amount
		System.out.println("How much money are you starting with? ");
		int startAmount = in.nextInt();
		
		
		//Our chance of winning
		System.out.println("What is your chance of winning? ");
		double winChance = in.nextDouble();
		winChance = .5;
		
		
		//How much money we have in a successful day
		System.out.println("How much money in can win in a successful day? ");
		double winLimit = in.nextDouble();
		
		//next step
		int currentMoney = startAmount;
		
		
		
		//while statement to do da maff
		while (currentMoney>0 && currentMoney < winLimit)
			{
			double WL = Math.random();
			System.out.println("Math Random = " + WL);
			
		if (WL > winChance)
				{
				currentMoney = currentMoney - 1;
				}
			else 
					{
					currentMoney = currentMoney + 1;
					}
			System.out.println(currentMoney);
			}
		
		
		
		
		
		
		//this is the final  readings
				System.out.println(" ");
				System.out.println("Starting Amount: " + startAmount);
				System.out.println(winChance);
				System.out.println(winLimit);
				
				if (currentMoney == winLimit) {
					System.out.println("Success! :) ");
				                              }
				else
				{
					System.out.println("Failure! :( ");
				}
	}

}
