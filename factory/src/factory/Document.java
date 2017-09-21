package factory;

public interface Document {
	public String getFormat();

	public void create();
	
	public void open();

	public void close();

	public void save();
}