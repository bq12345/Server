package com.bq;

import java.util.List;

public interface BookDAO  {
	
	List getAll();//获得所有记录
	
    List getBook(int pageSize, int startRow);//获得所有记录
    
    List queryBook(String fieldname,String value);//根据条件查询
    
    Book getBook(int id);//根据ID获得记录
    
    void addBook(Book book);//添加记录
    
    void updateBook(Book book);//修改记录
    
    void deleteBook(Book book);//删除记录

}
