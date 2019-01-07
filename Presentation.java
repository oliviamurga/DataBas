
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

	public class Presentation {


		public void printAllData (LinkedList<String> dataBase) {

			ListIterator<String> listIterator = dataBase.listIterator();
			int i = 1;
			while (listIterator.hasNext()) {
				System.out.print(i);
				System.out.println(listIterator.next() + " " );
				i ++;
			}
			System.out.println();
		}

		public void printSingleData (List <Object> listName, int line) {

			System.out.print(listName.get(line));

		}

}