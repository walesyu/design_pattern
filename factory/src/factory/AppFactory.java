package factory;

public abstract class AppFactory {
	public Document createDoc(String docType) {
		Document doc = initDoc(docType);
		doc.create();
		doc.open();
		return doc;
	}

	protected abstract Document initDoc(String docType);
}