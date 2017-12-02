/**
 * Quick Sort Algorithm referenced from
 * https://www.programcreek.com/2012/11/quicksort-array-in-java/
 * 
 */
public class QuickSortContainer extends GenericContainer {

	public QuickSortContainer() { super(); }
	public QuickSortContainer(short size) { super(size); }
	public QuickSortContainer(GenericContainer gc) { super(gc); }
	@Override
	public void sort() {
		if (entriesCount == 0) return;
		quickSort(0, entriesCount - 1);
	}
	private void quickSort(int low, int high) {
		
		if (low >= high) return;
 
		// pick the pivot
		int middle = low + (high - low) / 2;

		// make left < pivot and right > pivot
		int i = low, j = high;
		while (i <= j) {
			while (collection[i].isLess(collection[middle])) i++;
			while (collection[j].isGreater(collection[middle])) j--;
			// Swap
			if (i <= j) {
				GenericItemType temp = collection[i];
				collection[i] = collection[j];
				collection[j] = temp;
				i++;
				j--;
			}
		}

		// recursively sort two sub parts
		if (low < j) quickSort(low, j);
		if (high > i) quickSort(i, high);
	}
}
