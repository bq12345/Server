package com.bq;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author °×Ç¿
 *
 */
public class QueryBook extends ActionSupport {
	private Book book;
	private BookService service;
	private List<Book> list;
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
	public List<Book> getList() {
		return list;
	}

	public void setList(List<Book> list) {
		this.list = list;
	}

	@Override
	public String execute() throws Exception {
		if(service.queryBook()!=null){
			list=service.queryBook();
			return SUCCESS;
		}
		else{
		return INPUT;
		}
	}
	
}
