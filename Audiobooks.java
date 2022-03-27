
public class Audiobooks extends Books {
	public Audiobooks(String Tit, String Auth) {
		super(Tit,Auth);	
	}
	public void displayBookInfo() {
		System.out.println("Title: "+ title + "  Author: " + Author + "  Length: 15");
	}
}
