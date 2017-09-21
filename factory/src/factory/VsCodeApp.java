package factory;

public class VsCodeApp extends AppFactory {

	@Override
	protected Document initDoc(String fieType) {
		Document doc = null;
		switch (fieType) {
		case "1":
			doc = new Js();
			break;
		case "2":
			doc = new Html();
			break;
		default:
			doc = new Js();
			break;
		}

		return doc;
	}
}