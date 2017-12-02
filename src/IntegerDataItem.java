public class IntegerDataItem extends GenericItemType {

	private int privateValue;

	public IntegerDataItem() { privateValue=0; }
    public IntegerDataItem(int i) { set(i); }
    public IntegerDataItem(IntegerDataItem iD) { set(iD.get()); }
    public int get() { return privateValue; }
    public void set(int i) { privateValue = i; }
    @Override
    public boolean isLess(GenericItemType git) 
    { return ( privateValue < ((IntegerDataItem) git).get()); }
    @Override
    public boolean isEqual(GenericItemType git)
    { return ( privateValue == ((IntegerDataItem) git).get()); }
    @Override
    public boolean isGreater(GenericItemType git)
    { return ( privateValue > ((IntegerDataItem) git).get()); } 
    @Override
    public String toString() {return "" + privateValue;}
    @Override
    public Object getValue() { return privateValue; }
	
}              
