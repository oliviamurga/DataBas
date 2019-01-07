import java.util.Scanner;
import java.util.LinkedList;

public class Menu {

public static LinkedList <String> dataBase = new LinkedList<String>();

	public String createUsername() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a username:");
		String username = s.nextLine();
		s.close();
		return username;
	}

	public String createPassword() {
		Scanner l = new Scanner(System.in);
		System.out.println("Enter a password: ");
		String password = l.nextLine();
		l.close();
		return password;
	}

	public static void dataInsert() {

		System.out.println("PLEASE ENTER ELEMENTS TO YOUR DATABASE. PRESS 0 TO FINISH"); // WE ASSUME THE USER IS MATURE ENOUGH TO NOT MESS WITH THE PROGRAM//
		Scanner a = new Scanner(System.in);
		String element = a.nextLine();

		while (!element.equals("0")) {

			dataBase.add(element);
			element = a.nextLine();
		}

	}

	public void printMenu() {

		Scanner sc = new Scanner(System.in);
		System.out.println("    ----- MENU -----   ");
		System.out.println("PRESS 1 : INSERT DATA TO DATABASE");
		System.out.println("PRESS 2 : PRINT DATABASE");
		System.out.println("PRESS 3 : DELETE DATA");
		System.out.println("PRESS 4 : CHANGE DATA");
		System.out.println("PRESS 5 : TECHNICAL REPORT");
		System.out.println("PRESS ANYTHING ELSE TO EXIT DATABAS");
		int choice = sc.nextInt();


		switch (choice) {

		case 1:

			Menu.dataInsert();
			break;

		case 2:

			Presentation p = new Presentation ();
			p.printAllData(Menu.dataBase);
			break;

		case 3:

			System.out.println("WHICH ITEM WOULD YOU LIKE TO DELETE? TYPE THE ITEM'S INDEX BELOW.");
			Scanner i = new Scanner(System.in);
			int index = i.nextInt();
			Menu.deleteData(index);
			break;

		case 4:

			System.out.println("WHICH ITEM WOULD YOU LIKE TO CHANGE? TYPE THE ITEM'S INDEX BELOW.");
			Scanner in = new Scanner(System.in);
			int index2 = in.nextInt();

			System.out.println("CHANGE YOUR DATA BELOW.");
			String s = in.nextLine();
			Menu.changeData(index2, s);
			break;

		case 5:

			Menu.technicalSupport();
			break;

		default:

			System.exit(0);
			break;

		}
		printMenu();

		}

	public static void deleteData(int index) {
		dataBase.remove(index-1);
	}

	public static void changeData(int ind, String s) {
		dataBase.set(ind, s);

	}

	public static void technicalSupport() {

	}
}