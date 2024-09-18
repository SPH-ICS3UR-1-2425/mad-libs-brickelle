import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/*
		 * MadLibs Program
		 * Author: Brickelle
		 * Class: ICS3U
		 * Date: Sept. 16, 2024
		 * Make a program that asks for 10 inputs
		 * reads them into variables, and then prints out a story
		 * Make sure to include Strings, ints, and doubles!
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.println("Give me a day of the week: ");
		String dayOfWeek = in.nextLine();
		System.out.println("Name a type of showcase: ");
		String activity = in.nextLine();
		System.out.println("What's your name?");
		String name = in.nextLine();
		System.out.println("Give me a number: ");
		int num1 = in.nextInt();
		System.out.println("Give me a two digit number: ");
		double decNumber = in.nextDouble();
		System.out.println("Give me a place: ");
		//flush
		in.nextLine();
		String place = in.nextLine();
		System.out.println("How are you feeling?");
		String emotion = in.nextLine();
		System.out.println("One day, on "+dayOfWeek+" "+name+" performed at a "+activity+" showcase for "+num1+" hours "+decNumber+" at "+place+"!");
		System.out.println("The team lost, this makes "+name+" feel very "+emotion+".");

	}

}
