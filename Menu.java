import java.util.LinkedList;
import java.util.Scanner;

public class Menu {
	public static LinkedList <String> dataBase = new LinkedList<String>();
	public static Scanner s = new Scanner(System.in);

	public String createUsername() {
		System.out.println("Enter a username:");
		String username = s.nextLine();
		return username;
	}

	public String createPassword() {
		System.out.println("Enter a password: ");
		String password = s.nextLine();
		return password;
	}

	public static void dataInsert() {

		System.out.println("PLEASE ENTER ELEMENTS TO YOUR DATABASE. PRESS 0 TO FINISH"); // WE ASSUME THE USER IS MATURE ENOUGH TO NOT MESS WITH THE PROGRAM
		String element = s.nextLine();

		while (!element.equals("0")) {

			dataBase.add(element);
			element = s.nextLine();
		}

	}

	public void printMenu() {

		System.out.println("    ----- MENU -----   ");
		System.out.println("PRESS 1 : INSERT DATA TO DATABASE");
		System.out.println("PRESS 2 : PRINT DATABASE");
		System.out.println("PRESS 3 : DELETE DATA");
		System.out.println("PRESS 4 : CHANGE DATA");
		System.out.println("PRESS 5 : TECHNICAL REPORT");
		System.out.println("PRESS ANYTHING ELSE TO EXIT DATABAS");
		int choice = s.nextInt();
		s.nextLine();

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
			int index = s.nextInt();
			Menu.deleteData(index);
			break;

		case 4:

			System.out.println("WHICH ITEM WOULD YOU LIKE TO CHANGE? TYPE THE ITEM'S INDEX BELOW.");
			int index2 = s.nextInt();
			s.nextLine();
			System.out.println("CHANGE YOUR DATA BELOW.");
			String str = s.nextLine();
			Menu.changeData(index2, str);
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
		dataBase.set(ind-1, s);
	}

	public static void technicalSupport() {
		System.out.println("Sorry for the inconvenience.\n Our technical support is under maintenance\n");
	}
}
