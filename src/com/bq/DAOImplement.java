package com.bq;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * @author °×Ç¿
 *
 */
public class DAOImplement extends  HibernateDaoSupport implements BookDAO{
	
	public DAOImplement() {
		
	}

	@Override
	public List getAll() {
		
		String sql="from Book";
		return this.getHibernateTemplate().find(sql);
	}

	@Override
	public List getBook(int pageSize, int startRow) {
		return null;
	}

	@Override
	public List queryBook(String fieldname, String value) {
		System.out.println("value: "+value);
		String sql="FROM Book where "+fieldname+" like '%"+value+"%'";
		return this.getHibernateTemplate().find(sql);
	}

	@Override
	public Book getBook(int id) {
		
		return (Book)this.getHibernateTemplate().get(Book.class,id);
	}

	@Override
	public void addBook(Book book) {
		this.getHibernateTemplate().save(book);		
	}

	@Override
	public void updateBook(Book book) {
		this.getHibernateTemplate().update(book);
		
	}

	@Override
	public void deleteBook(Book book) {
		this.getHibernateTemplate().delete(book);
	}

}
