package com.bq;

import java.util.List;

/**
 * @author 白强
 *
 */
public class BookService {
	private BookDAO bookDao;
	
	public BookDAO getBookDao() {
		return bookDao;
	}

	public void setBookDao(BookDAO bookDao) {
		this.bookDao = bookDao;
	}
	/**
	 * 函数说明：获得一条的信息 参数说明： ID 返回值：对象
	 */
	public Book getBook(int bookId) {
		return bookDao.getBook(bookId);
	}

	/**
	 * 函数说明：修改信息 参数说明： 对象 返回值：
	 */
	public void updateBook(Book book) {
		bookDao.updateBook(book);
	}

	/**
	 * 函数说明：查询信息 参数说明： 集合 返回值：
	 */
	public List queryBook(String fieldname, String value) {
		return bookDao.queryBook(fieldname, value);
	}
	
	public List queryBook() {
		return bookDao.getAll();
	}
	
	public void addBook(Book book) {
		bookDao.addBook(book);
	}
	
	public void delBook(Book book) {
		bookDao.deleteBook(book);
	}
	
}
