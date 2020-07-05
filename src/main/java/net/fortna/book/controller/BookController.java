package net.fortna.book.controller;

import java.util.List;

import net.fortna.book.model.Book;
import net.fortna.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookController {
  @Autowired
	BookService bookService;

	@RequestMapping(value = "/getAllBooks", method = RequestMethod.GET, headers = "Accept=application/json")
	public String getAllBooks(Model model) {

		List<Book> listOfBooks = bookService.getAllBooks();
		model.addAttribute("book", new Book());
		model.addAttribute("listOfBooks", listOfBooks);
		return "bookDetails";
	}

}
