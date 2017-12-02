
public abstract class GenericContainer {

    private final int MAXSIZE = 30; 
    private short sizeLIMIT, inDEX;
    protected short entriesCount;
    protected GenericItemType[] collection;
	
	public GenericContainer()
		{ sizeLIMIT=30; entriesCount=0; collection = new GenericItemType[MAXSIZE]; }
    
	public GenericContainer(short size) {
    		entriesCount = 0;
        if (size <= MAXSIZE)
        		sizeLIMIT = size;
        else
            sizeLIMIT = MAXSIZE;
    }
    public GenericContainer(GenericContainer gc) {
    		entriesCount = 0;
          /* Shallow COPY: collection =  gc; */
        gc.Iterator_Start(); // Deep COPY
        	while (gc.Iterator_hasNext()) collection[inDEX]=gc.Iterator_getNext();
    }
    public void init() {
    		Iterator_Start();
        while (Iterator_hasNext()) collection[inDEX] = null;
    }
    public void add(GenericItemType it) {
    		if (entriesCount < sizeLIMIT)
    			collection[entriesCount++] = it;
    }
 
    public void remove(GenericItemType it) { }

    public int search(GenericItemType it) {
    		return binarySearch(it, 0, entriesCount-1);
    }
    private int binarySearch(GenericItemType it, int left, int right) {
        if (left > right) return -1;
        int middle = (left + right) / 2;
        if (collection[middle].isEqual(it)) return middle;
        else if (collection[middle].isGreater(it))
              return binarySearch(it, left, middle - 1);
        else
              return binarySearch(it, middle + 1, right);           
    }
    
	public abstract void sort();
	
    public void Iterator_Start() { inDEX = 0;}
    public boolean Iterator_hasNext() { return inDEX <= entriesCount-1; }
    public GenericItemType Iterator_getNext() { return collection[inDEX++]; }
}
