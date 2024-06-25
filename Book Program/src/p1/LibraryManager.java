package p1;

import java.util.HashSet;
import java.util.LinkedList;

public class LibraryManager {
	HashSet<String> uniquebn  = null;
	LinkedList<Book> bookdetail = null;
	public LibraryManager(HashSet<String> uniquebn, LinkedList<Book> bookdetail) {
		this.uniquebn = uniquebn;
		this.bookdetail = bookdetail;
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
	
}
