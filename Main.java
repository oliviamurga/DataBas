import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Welcome to DataBas");
		System.out.println("Have you loggen in before? Yes or No");
		Scanner sc = new Scanner(System.in);
		String answer = sc.nextLine();
		Menu m = new Menu();
		
		if (answer == "No") { 
			
			String u = m.createUsername();
			String p = m.createPassword();
			User user = new User();
			user.setUsername(u);
			user.setPassword(p);
		
		}
			
		
		
		sc.close();
		
			
	}
}



