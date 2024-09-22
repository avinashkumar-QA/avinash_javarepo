package keywords;

import java.util.Scanner;

public class Switch_Case_LaunchBrowser {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please eneter 1 for Chrome");
		System.out.println("Please eneter 2 for firefox");
		System.out.println("Please eneter 3 for edge");
		System.out.println("Please eneter 4 for Safari");
		int input = s1.nextInt();
		switch (input) {
		case 1:
			System.out.println("Launching Chrome Browser");
			break;
		case 2:
			System.out.println("Launching firefox Browser");
			break;
		case 3:
			System.out.println("Launching edge Browser");
			break;

		case 4:
			System.out.println("Launching Safari Browser");
			break;
		default:
			System.out.println("Your Selection is wrong, Can you try again please?");
		}
	}
}
