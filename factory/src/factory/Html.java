package factory;

public class Html implements Document{

	@Override
	public String getFormat() {
		return "I am html";
	}

	@Override
	public void create() {
		System.out.println("create html");
	}

	@Override
	public void open() {
		System.out.println("open html");
	}

	@Override
	public void close() {
		System.out.println("close html");
	}

	@Override
	public void save() {
		System.out.println("save html");
	}
}