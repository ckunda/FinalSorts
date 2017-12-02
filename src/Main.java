import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * Final Take Home
 * Question 1 - Generic Sorts
 * Name: Chakra Kunda
 * CISP 401 – Wed, 6:00 PM to 9:05 PM
 * Fall 2017
 *
 */
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		// Redirect all console output to file (with time stamp)
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		System.setOut(new PrintStream(
				new FileOutputStream("FinalTakeHomeSort_console_" + timeStamp + ".txt")));
		System.out.println("Time Stamp of output: " + timeStamp + "\n");

	    /*
	     * Pseudocode:
	     * 
	     * Quick Sort Example
	     * Test Integer Data Items
	     * 		Create a new collection for Integer Data Items
	     * 		Add a few integers to the collection
	     * 		Sort the integer collection
	     * 	    Print the contents of the collection after sort

	     * Test String Data Items
	     * 		Create a new collection for String Data Items
	     * 		Add a few Strings to the collection
	     * 		Sort the String collection
	     * 	    Print the contents of the collection after sort
	     	     
	     * Test Students
	     * 		Create a new collection for Students Data Items
	     * 		Add a few Students to the collection
	     * 		Sort the Students collection
	     * 	    Print the contents of the collection after sort
	     * 
	     * Insertion Sort Example
	     * 		Repeat all the above steps
	     */
	
	    System.out.printf("Generic Quick Sort Example:\n\n");
	    testGenericSortInt(new QuickSortContainer());
	    testGenericSortString(new QuickSortContainer());
	    testGenericSortStudents(new QuickSortContainer());
	   
	    System.out.printf("Generic Insertion Sort Example:\n\n");
	    testGenericSortInt(new InsertionSortContainer());
	    testGenericSortString(new InsertionSortContainer());
	    testGenericSortStudents(new InsertionSortContainer());

		System.out.println("End of Tests.");
		System.out.close();
	}
	
	public static void testGenericSortInt(GenericContainer gC) {

	    gC.add(new IntegerDataItem(13));
	    gC.add(new IntegerDataItem(-30)); 
	    gC.add(new IntegerDataItem(100));
	    gC.add(new IntegerDataItem(70));
	    gC.add(new IntegerDataItem(45));
	    gC.sort();
	    printGenericContainer(gC);
	}
	
	public static void testGenericSortString(GenericContainer gC) {

		gC.add(new StringDataItem("johnson"));
	    gC.add(new StringDataItem("dixon")); 
	    gC.add(new StringDataItem("adams"));
	    gC.add(new StringDataItem("Baker"));
	    gC.add(new StringDataItem("Lee"));
	    gC.add(new StringDataItem("Camille"));
	    gC.sort();
	    printGenericContainer(gC);
	}

	public static void testGenericSortStudents(GenericContainer gC) {

		gC.add(new Student(1, "Chakra", 3.1f));
		gC.add(new Student(2, "Jeb", 3.2f));
		gC.add(new Student(3, "Chan", 3.3f));
		gC.add(new Student(5, "May", 3.4f));
		gC.add(new Student(6, "augustus", 3.5f));
		gC.sort();
	    printGenericContainer(gC);
	}

	public static void printGenericContainer(GenericContainer gC) {
		System.out.printf("Sorted Generic Collection:\n");
		gC.Iterator_Start();
		while (gC.Iterator_hasNext())  {
			GenericItemType nextOne = gC.Iterator_getNext();   
			System.out.printf("  %s\n", nextOne.getValue());
			if (!(gC.Iterator_hasNext())) System.out.printf("\n");
		}
	}
}
