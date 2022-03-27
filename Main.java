public class Main {
	public static void main(String[] args){
		Books [] BookArr= {new eBooks("eBookTitle1","eBookAuthor1"),
						   new eBooks("eBookTitle2","eBookAuthor2"),
						   new eBooks("eBookTitle3","eBookAuthor3"),
						   new eBooks("eBookTitle4","eBookAuthor4"),
						   new eBooks("eBookTitle5","eBookAuthor5"),
						   new Audiobooks("AudioBookTitle1","AudioBookAuthor1"),
						   new Audiobooks("AudioBookTitle2","AudioBookAuthor2"),
						   new Audiobooks("AudioBookTitle3","AudioBookAuthor3"),
						   new Audiobooks("AudioBookTitle4","AudioBookAuthor4"),
						   new Audiobooks("AudioBookTitle5","AudioBookAuthor5"),
						   new PrintedBook("PrintedBookTitle1","printedBookAuthor1"),
						   new PrintedBook("PrintedBookTitle2","printedBookAuthor2"),
						   new PrintedBook("PrintedBookTitle3","printedBookAuthor3"),
						   new PrintedBook("PrintedBookTitle4","printedBookAuthor4"),
						   new PrintedBook("PrintedBookTitle5","printedBookAuthor5")};


		for (Books biter : BookArr){
			if (biter instanceof eBooks) {
				((eBooks)biter).displayBookInfo();
			}
		}
	}

}