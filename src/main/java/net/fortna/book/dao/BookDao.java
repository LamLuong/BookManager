package net.fortna.book.dao;

import java.util.List;

import net.fortna.book.model.Book;

public interface BookDao {
	public List<Book> getAllBooks() ;

	public Book getBook(int id) ;

	public Book addBook(Book book);

	public void updateBook(Book book) ;

	public void deleteBook(int id) ;
}
