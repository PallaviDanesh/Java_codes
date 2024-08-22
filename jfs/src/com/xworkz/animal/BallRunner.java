package com.xworkz.animal;

public class BallRunner {

	public static void main(String[] args) {

		Ball ball1 = new Ball("Nike", "Rubber", 5, "Red", true, 300, true, 10);
		Ball ball2 = new Ball("Adidas", "Leather", 7, "White", false, 400, false, 8);
		Ball ball3 = new Ball("Puma", "Plastic", 4, "Blue", true, 200, true, 12);
	
		Ball[]sample=new Ball[3];
		sample[0] = ball1;
		sample[1] = ball2;
		sample[2] = ball3;
		
		for(Ball game:sample)
		{
			System.out.println(game);
			game.printBallInfo();
		}
	}

}
