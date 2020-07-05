package org.arpit.java2blog.dao;

import java.util.List;

import net.fortna.book.model.Book;
import net.fortna.book.dao.BookDao;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao{

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	public List<Book> getAllBooks() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Book>  bookList = session.createQuery("from Book").list();
		return bookList;
	}

	public Book getBook(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Book book = (Book) session.get(Book.class, id);
		return book;
	}

	public Book addBook(Book book) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(book);
		return book;
	}

	public void updateBook(Book book) {
		Session session = this.sessionFactory.getCurrentSession();
		Hibernate.initialize(book);
		session.update(book);
	}

	public void deleteBook(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Book p = (Book) session.load(Book.class, new Integer(id));
		if (null != p) {
			session.delete(p);
		}
	}
}
