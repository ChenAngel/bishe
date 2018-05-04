package service;

import dao.BookMapper;
import model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;


    public int addBook(String ISBN, String bookname, String writer, String translator, String press, String pressdate, Double price) {
        Book book = new Book(ISBN,bookname,writer,translator,press,pressdate,price);
        return bookMapper.addBook(book);
    }

    public int delBookById(String ISBN) {
        return bookMapper.delBookById(ISBN);
    }

    public int delBookByName(String bookname) {
        return bookMapper.delBookByName(bookname);
    }

    public int updateBook(String ISBN, String bookname, String writer, String translator, String press, String pressdate, Double price) {
        return bookMapper.updateBook(new Book(ISBN,bookname,writer,translator,press,pressdate,price));
    }

    public List<Book> findBook(String ISBN, String bookname, String writer, String translator, String press, String pressdate, Double price) {
        return bookMapper.findBook(new Book(ISBN,bookname,writer,translator,press,pressdate,price));
    }
}
