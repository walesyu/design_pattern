package factory;

public class Word implements Document{

	@Override
	public String getFormat() {
		return "I am word";
	}

	@Override
	public void create() {
		System.out.println("create word");
	}

	@Override
	public void open() {
		System.out.println("open word");
	}

	@Override
	public void close() {
		System.out.println("close word");
	}

	@Override
	public void save() {
		System.out.println("save word");
	}
}