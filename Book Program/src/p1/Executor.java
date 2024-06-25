package p1;

public class Executor {
	public static void main(String[] args) {
		LibraryManager library1 = new LibraryManager();
		
		library1.addnewBook(new Book("121","C programming","Denis Ritche","Programming"));
		
		library1.addnewBook(new Book("123","Java SE-1","Gosling","Programming"));
		library1.addnewBook(new Book("124","Wings of Fire","APJ Abdul Kalam","Biography"));
		
		library1.sortBooksbyTitle();
		System.out.println();
		library1.searchBookbyGenre("Programming");
		System.out.println();
		library1.searchBook("APJ Abdul Kalam");
		System.out.println();
		library1.removeBook("121");
		library1.sortBooksbyTitle();
		
	}
}
