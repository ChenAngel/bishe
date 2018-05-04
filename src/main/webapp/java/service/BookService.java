package service;

import model.Book;

import java.util.List;

public interface BookService {
    /**
     * 添加一本书
     * @param ISBN
     * @param bookname
     * @param writer
     * @param translator
     * @param press
     * @param pressdate
     * @param price
     * @return
     */
    public int addBook(String ISBN,
                       String bookname,
                       String writer,
                       String translator,
                       String press,
                       String pressdate,
                       Double price);

    /**
     * 通过ID删除书本
     * @param ISBN
     * @return
     */
    public int delBookById(String ISBN);

    /**
     * 通过书名删除书本记录
     * @param bookname
     * @return
     */
    public int delBookByName(String bookname);

    /**
     * 用于修改书信息，逻辑：先查询库中图书信息，修改传入参数中不为空选项
     * @param ISBN
     * @param bookname
     * @param writer
     * @param translator
     * @param press
     * @param pressdate
     * @param price
     * @return
     */
    public int updateBook(String ISBN,
                          String bookname,
                          String writer,
                          String translator,
                          String press,
                          String pressdate,
                          Double price);


    /**
     * 通过传入非空参数查询某本书
     * @param ISBN
     * @param bookname
     * @param writer
     * @param translator
     * @param press
     * @param pressdate
     * @param price
     * @return
     */
    public List<Book> findBook(String ISBN,
                               String bookname,
                               String writer,
                               String translator,
                               String press,
                               String pressdate,
                               Double price);

}
