package com.bq;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author °×Ç¿
 *
 */
public class DelBook extends ActionSupport {
	private int id;
	private Book book;
	private BookService service;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
		if(service.getBook(getId())!=null){
			service.delBook(service.getBook(getId()));
			return SUCCESS;
		}
		else{
		return INPUT;
		}
	}
	
}
