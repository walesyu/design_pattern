package factory;

public class Excel implements Document{

	@Override
	public String getFormat() {
		return "I am excel";
	}

	@Override
	public void create() {
		System.out.println("create excel");
	}

	@Override
	public void open() {
		System.out.println("open excel");
	}

	@Override
	public void close() {
		System.out.println("close excel");
	}

	@Override
	public void save() {
		System.out.println("save excel");
	}
}