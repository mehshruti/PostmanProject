package BookProject.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import BookProject.Details.Book;
@Component
public class Implement {
	int i=0;
	List<Book> list = new ArrayList<>();
 public Implement() {
	
	list.add(new Book(12,"Python","Abc"));
	list.add(new Book(14,"Java","Ghi"));
	list.add(new Book(16,"Core Java","Xyz"));
	list.add(new Book(18,"Ruby","Ahd"));
 }	
	public List<Book> getdata(){
		return list;
	}
	public Book getBookById(long id)
	{
		Book Det = null;
		for(Book book:list) {
			Det = list.stream().filter(p->p.getId()==id).findFirst().get();
					}
		return Det;

	}
	public Book addBook(Book book)
	{
		list.add(book);
		return book;
	}
	
	public Book delBook(long bookId, Book Book) {
		for(Book book :list)
		{
			if(book.getId()==bookId)
				list.remove(i);
				i=i+1;
		}
		System.out.print("SucuessFully delete");
//		list= list.stream().filter(book->book.getId()==bookId).collect(Collectors.toList());
		return Book;
	}
	}
