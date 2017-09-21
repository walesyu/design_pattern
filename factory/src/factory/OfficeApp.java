package factory;

public class OfficeApp extends AppFactory {

	@Override
	protected Document initDoc(String fieType) {
		Document doc = null;
		switch (fieType) {
		case "1":
			doc = new Word();
			break;
		case "2":
			doc = new Excel();
			break;
		default:
			doc = new Word();
			break;
		}

		return doc;
	}
}