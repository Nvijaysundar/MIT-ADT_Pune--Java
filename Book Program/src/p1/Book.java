package p1;

public class Book {
	String isbn, title, author, genre;

	public Book(String isbn, String title, String author, String genre) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.genre = genre;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getGenre() {
		return genre;
	}
	
	public String toString()
	{
		return this.isbn +"\t"+this.title +"\t"+this.author+"\t"+this.genre;
	}
	
	
}
