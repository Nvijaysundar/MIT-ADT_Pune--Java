package p1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class LibraryManager {
	HashSet<String> uniquebn  = null;
	LinkedList<Book> bookdetail = null;
	public LibraryManager() {
		this.uniquebn = new HashSet<String>();
		this.bookdetail = new LinkedList<Book>();
	}
	void addnewBook(Book ob)
	{
		if(uniquebn.contains(ob.isbn))
		{
			System.out.println("Book Aldready Exits");
		}
		else
		{
			uniquebn.add(ob.isbn);
			bookdetail.add(ob);
		}
	}
	void removeBook(String isbn)
	{
		if(uniquebn.contains(isbn))
		{
			for(Book temp : bookdetail)
			{
				if(temp.getIsbn().equalsIgnoreCase(isbn))
				{
					bookdetail.remove(temp);
					uniquebn.remove(isbn);
					System.out.println("Book Found!!! And Data Deleted");
					break;
				}
			}
		}
		else
			System.out.println("Invalid Book Selection");
	}
	void searchBook(String author)
	{
		for(Book temp : bookdetail)
		{
			if(temp.getAuthor().equalsIgnoreCase(author))
			{
				System.out.println(temp.toString());
				break;
			}
		}
	}
	void searchBookbyGenre(String genre)
	{
		for(Book temp : bookdetail)
		{
			if(temp.getGenre().equalsIgnoreCase(genre))
			{
				System.out.println(temp.toString());

			}
		}
	}
	
	void sortBooksbyTitle()
	{
		List<Book> sBooks = new ArrayList<Book>(bookdetail);
		
		sBooks.sort(Comparator.comparing(Book::getTitle));
		for(Book temp : sBooks) {
			System.out.println(temp.toString());
		}
	}
}
