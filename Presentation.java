import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

	public class Presentation {


		public void printAllData (LinkedList<String> dataBase, LinkedList<String> names) {

			ListIterator<String> listIterator2 = names.listIterator();
			ListIterator<String> listIterator = dataBase.listIterator();
			int i = 1;

			while (listIterator2.hasNext()) {

						System.out.print("   [" + listIterator2.next() + "]\n" );
		}
			while (listIterator.hasNext()) {
				System.out.println(i + ". " + listIterator.next());
				i ++;
			}
			System.out.println();
		}

		public void printSingleData (List <Object> listName, int line) {

			System.out.print(listName.get(line));

		}

	}