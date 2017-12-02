
public class StringDataItem extends GenericItemType {
   
    private String privateString;

    public StringDataItem() { privateString = new String(""); }
    public StringDataItem(String s) { privateString = new String(s); }
    public StringDataItem(StringDataItem sdi) { set(sdi.get()); }         
    public void set(String s) { privateString = s; }
    public String get() { return privateString; }
    @Override
    public boolean isLess(GenericItemType git)
    { return ( privateString.compareTo(((StringDataItem) git).get()) < 0); }
    @Override
    public boolean isEqual(GenericItemType git)
    { return ( privateString.compareTo(((StringDataItem) git).get()) == 0); }
    @Override
    public boolean isGreater(GenericItemType git)
    { return ( privateString.compareTo(((StringDataItem) git).get()) > 0); }
    @Override
	public Object getValue() { return privateString; }

}
