package controller;

import model.Book;
import model.Reader;

public interface ManagerController {
    //图书管理
    public void addBook(Book book);
    public void delBook(int id);
    public Book findBook(Book book);
    public int updateBook(Book book);

    //用户管理
    public void addReader(Reader reader);
    public void delReader(int id);
    public Reader findReader(Reader reader);
    public int updateReader(Reader reader);

    //图书借阅情况数据库实现
    //系统管理-重置用户密码
    public int Reset(Reader reader);


}
