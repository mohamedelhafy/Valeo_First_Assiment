
public class eBooks extends Books {
	
	public  eBooks(String Tit, String Auth) {
		super(Tit,Auth);	
	}
	
	public void displayBookInfo() {
		System.out.println("Title: "+ title + "  Author: " + Author + "  Format: PDF/Word");
	}
}
