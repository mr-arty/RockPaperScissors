import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
	private static String name, choice1, choice2;
	private static int pl1 = -1, pl2;
	private static char again = 'y';

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				
		System.out.print("Enter your name: ");
		name = input.nextLine();
		
		playGame(); 
		}
			
		
		public static void playGame() {
			Scanner input = new Scanner(System.in);
			Random rand = new Random();
			
			while (again == 'y') {
				while (pl1 < 0) startGame();

				pl2 = rand.nextInt(3);

				switch (pl2) {
				case 0:
					choice2 = "rock";
					break;
				case 1:
					choice2 = "paper";
					break;
				case 2:
					choice2 = "scissors";
					break;
				}	

				System.out.println("\n" + name + " chooses " + choice1 + ", computer chooses " + choice2);
				
				if (pl1 > pl2 && (pl1 - pl2 == 1)) System.out.println(choice1 + " beats " + choice2 + ", " + name + " wins!");
				else if (pl2 > pl1 && (pl2 - pl1 == 1)) System.out.println(choice2 + " beats " + choice1 + ", the computer wins!");
				else if (pl1 > pl2) System.out.println(choice2 + " beats " + choice1 + ", the computer wins!");
				else if (pl2 > pl1) System.out.println(choice1 + " beats " + choice2 + ", " + name + " wins!");
				else System.out.println("It's a tie!");

				System.out.println("Would you like to play again?");
				again = input.next().charAt(0);
				if (again == 'y') pl1 = -1;
				else System.out.println("\nThanks for playing!");

			}
		}
		
		public static void startGame() {
			Scanner input = new Scanner(System.in);
			System.out.println("\nStarting new game...");
			System.out.print("What will you throw?");
			choice1 = input.nextLine();

			switch (choice1) {
			case "rock":
				pl1 = 0;
				break;
			case "paper":
				pl1 = 1;
				break;
			case "scissors":
				pl1 = 2;
				break;
			default:
				System.out.println("Invalid input, try again...");
			}	
		
	}
}

