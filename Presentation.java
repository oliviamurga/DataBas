import java.util.List;
import java.util.ListIterator;

public class Presentation {
	
	
	public void printAllData (List <Object> listName) {
		
		ListIterator <Object> listIterator = listName.listIterator();
		
		while (listIterator.hasNext()) {
			System.out.print(listIterator.next() + " " );
		}
		System.out.println();
	}
	
	public void printSingleData (List <Object> listName, int line) {
		
		System.out.print(listName.get(line));
		
	}

}
