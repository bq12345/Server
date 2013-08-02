package com.bq;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author °×Ç¿
 * 12345
 */
public class AddBook extends ActionSupport{
	private Book book;
	private BookService service;
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public BookService getService() {
		return service;
	}
	public void setService(BookService service) {
		this.service = service;
	}
	@Override
	public String execute() throws Exception {
		System.out.println(book.toString());		
			service.addBook(book);
			return SUCCESS;
	}
}
