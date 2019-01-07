import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Welcome to DataBas");
		System.out.println("Have you loggen in before? Yes or No");
		Scanner sc = new Scanner(System.in);
		String answer = sc.nextLine();
		while (!answer.equals("Yes") && !answer.equals("No")) {
			System.out.println("Wrong answer. Give Yes or No");
			answer = sc.nextLine();
		}
		Menu m = new Menu();
		if (answer.equals("No")) {

			String u = m.createUsername();
			String p = m.createPassword();
			User user = new User();
			user.setUsername(u);
			user.setPassword(p);
		}
		m.printMenu();

		sc.close();

	}
}
