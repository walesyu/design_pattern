package factory;

public class Js implements Document{

	@Override
	public String getFormat() {
		return "I am javascript";
	}

	@Override
	public void create() {
		System.out.println("create javascript");
	}

	@Override
	public void open() {
		System.out.println("open javascript");
	}

	@Override
	public void close() {
		System.out.println("close javascript");
	}

	@Override
	public void save() {
		System.out.println("save javascript");
	}
}