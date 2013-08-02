package com.bq;

import java.util.List;

/**
 * @author ��ǿ
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
	 * ����˵�������һ������Ϣ ����˵���� ID ����ֵ������
	 */
	public Book getBook(int bookId) {
		return bookDao.getBook(bookId);
	}

	/**
	 * ����˵�����޸���Ϣ ����˵���� ���� ����ֵ��
	 */
	public void updateBook(Book book) {
		bookDao.updateBook(book);
	}

	/**
	 * ����˵������ѯ��Ϣ ����˵���� ���� ����ֵ��
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
