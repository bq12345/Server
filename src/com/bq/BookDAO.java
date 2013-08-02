package com.bq;

import java.util.List;

public interface BookDAO  {
	
	List getAll();//������м�¼
	
    List getBook(int pageSize, int startRow);//������м�¼
    
    List queryBook(String fieldname,String value);//����������ѯ
    
    Book getBook(int id);//����ID��ü�¼
    
    void addBook(Book book);//��Ӽ�¼
    
    void updateBook(Book book);//�޸ļ�¼
    
    void deleteBook(Book book);//ɾ����¼

}
