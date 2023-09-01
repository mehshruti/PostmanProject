package BookProject.Details;

public class Book {
	private long Id;
	private String Bookname;
	private String Author;
	
	public Book() {
	}
	
public Book(long id, String bookname, String author) 
{
		Id = id;
		Bookname = bookname;
		Author = author;
	}



	
public long getId() {
		return Id;
	}
	public void setId(long id) {
		this.Id = id;
	}
	public String getBookname() {
		return Bookname;
	}
	public void setBookname(String bookname) {
		this.Bookname = bookname;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		this.Author = author;
	}

}
