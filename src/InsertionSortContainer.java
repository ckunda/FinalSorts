/**
 * Insertion Sort Algorithm referenced from
 * http://www.java2novice.com/java-sorting-algorithms/insertion-sort/
 *
 */
public class InsertionSortContainer extends GenericContainer {

	public InsertionSortContainer() { super(); }
	public InsertionSortContainer(short size) { super(size); }
	public InsertionSortContainer(GenericContainer gc) { super(gc);}
	@Override
	public void sort() { insertionSort();}

	private void insertionSort() {
 
		GenericItemType temp;
        for (int i = 1; i < entriesCount; i++) 
            for(int j = i ; j > 0 ; j--) 
                if(collection[j].isLess(collection[j-1])) {
                    temp = collection[j];
                    collection[j] = collection[j-1];
                    collection[j-1] = temp;
                }
    }
}
