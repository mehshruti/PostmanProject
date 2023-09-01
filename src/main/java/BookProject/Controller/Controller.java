package BookProject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import BookProject.Details.Book;
import BookProject.Impl.Implement;

@RestController
public class Controller {
	@Autowired
	private Implement implement;
	@GetMapping("/Book")
	public List<Book> getdata()
	{
		return this.implement.getdata();
	}
	
@GetMapping("/Book/{id}")
public Book getdata(@PathVariable("id") long id)
{
	return this.implement.getBookById(id);
}
}
