package net.fortna.book.service;

import java.util.List;

import javax.transaction.Transactional;

import net.fortna.book.model.Book;
import net.fortna.book.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("bookService")
public class BookService {

	@Autowired
	BookDao bookDao;

	@Transactional
	public List<Book> getAllBooks() {
		return bookDao.getAllBooks();
	}

	@Transactional
	public Book getBook(int id) {
		return bookDao.getBook(id);
	}

	@Transactional
	public void addBook(Book book) {
		bookDao.addBook(book);
	}

	@Transactional
	public void updateBook(Book book) {
		bookDao.updateBook(book);

	}

	@Transactional
	public void deleteBook(int id) {
		bookDao.deleteBook(id);
	}
}
