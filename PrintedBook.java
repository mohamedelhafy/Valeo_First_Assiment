
public class PrintedBook extends Books {
	public PrintedBook(String Tit, String Auth) {
		super(Tit,Auth);
	}
	public void displayBookInfo() {
		System.out.println("Title: "+ title + "  Author: " + Author + "  Pages: 200");
	}
}
