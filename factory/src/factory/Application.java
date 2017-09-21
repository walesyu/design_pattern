package factory;

public class Application {
	public static void main(String[] args) {
		System.out.println("===============Office====================");
		AppFactory app = new OfficeApp();
		Document doc = null;
		if (args.length > 0 && !"".equals(args[0])) {
			doc = app.createDoc(args[0]);
		} else {
			doc = app.createDoc("2");
		}
		System.out.println(doc.getFormat());
		System.out.println("================Vscode===================");
		AppFactory app2 = new VsCodeApp();
		Document doc2 = null;
		if (args.length > 0 && !"".equals(args[0])) {
			doc2 = app2.createDoc(args[0]);
		} else {
			doc2 = app2.createDoc("2");
		}
		System.out.println(doc2.getFormat());
	}
}