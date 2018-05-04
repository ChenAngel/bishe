package dao;

import model.Book;

import java.util.List;

public interface BookMapper {
    public int addBook(Book book);
    public List<Book> findBook(Book book);
    public int delBookById(String id);
    public int delBookByName(String bookname);
    public int updateBook(Book book);
}
