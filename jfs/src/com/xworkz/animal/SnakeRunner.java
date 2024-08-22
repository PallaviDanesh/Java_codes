package com.xworkz.animal;

public class SnakeRunner {

	public static void main(String[] args) {

		Snake snake1 = new Snake("cobra", 50, "poisonous");
		Snake snake2 = new Snake("green snake", 10, "poisonous");
		Snake snake3 = new Snake("anaconda", 70, "poisonous");

		Snake[] refe = new Snake[3];
		refe[0] = snake1;
		refe[1] = snake2;
		refe[2] = snake3;

		for (Snake value : refe) {
			System.out.println(value);
			value.display();
		}
	}

}
