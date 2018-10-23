import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {

		System.out.println("Welcome to Rock, Paper, Scissors App!");
		System.out.print("Please enter your name: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		HumanPlayer gamer = new HumanPlayer(name);
		Player player2 = null;
		Roshambo choice = null;
		Roshambo choice2 = null;
		System.out.print("Hello " + name + ", who would you like to play against Rachel or Brooke? (r/b): ");
		String opponent = sc.nextLine();
		if (opponent.equalsIgnoreCase("b")||opponent.equalsIgnoreCase("brooke")){
			player2 = new RockPlayer("Brooke");
		}else if (opponent.equalsIgnoreCase("r")||opponent.equalsIgnoreCase("rachel")){
			player2 = new RandomPlayer("Rachel");
		}
		choice2 = player2.generateRoshambo();
		boolean cont = true;
		while(cont){
			System.out.println("Rock, paper or scissors? (R/P/S): ");
			String answer = sc.nextLine().toLowerCase();
			switch (answer) {
			case "r":
				choice = gamer.setValue(Roshambo.ROCK);
				break;
			case "p":
				choice = gamer.setValue(Roshambo.PAPER);
				break;
			case "s":
				choice = gamer.setValue(Roshambo.SCISSORS);
				break;
			default:
				break;
			}
			
			if (choice.compareTo(choice2) == 0 ){
				System.out.println(name + ": " + gamer.getValue());
				System.out.println(player2.getName() + ": " + player2.getValue());
				System.out.println("Draw!");
			}
			else if (choice.compareTo(choice2) == 1){
				System.out.println(name + ": " + gamer.getValue());
				System.out.println(player2.getName() + ": " + player2.getValue());
				System.out.println("You won!");
			}
			else if (choice == Roshambo.SCISSORS && choice2 == Roshambo.PAPER){
				System.out.println(name + ": " + gamer.getValue());
				System.out.println(player2.getName() + ": " + player2.getValue());
				System.out.println("You lost ");
			}
			else {
				System.out.println(name + ": " + gamer.getValue());
				System.out.println(player2.getName() + ": " + player2.getValue());
				System.out.println("You lost ");
			}
		System.out.print("Would you like to play again? (y/n): ");
		String again = sc.nextLine();
		if (again.equalsIgnoreCase("n")||again.equalsIgnoreCase("no"))
			cont = false;
		}
		sc.close();
	}
	
	}

