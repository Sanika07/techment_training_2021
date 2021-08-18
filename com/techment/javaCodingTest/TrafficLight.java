package javaCodingTest;

import java.util.Scanner;


public class TrafficLight  {

	public static void main(String[] args) {
		String color;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Traffic Light Color: ");
		color = input.next();

		switch (color)
		{
		case "red" :
		case "Red" :
			System.out.println("STOP!!!  \n");
			break;
		case "yellow" :
		case "Yellow" :
			System.out.println("READY!!! \n");
			break;
		case "green" :
		case "Green" :
			System.out.println("GO!!! ");
			break;
		default:
			System.out.println("Invalid color entered. \n");
		}

		input.close();
	}
}
