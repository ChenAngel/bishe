package controller;

import dao.BookMapper;
import model.Book;
import model.Reader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("/admin/control")
public class AdminControl implements ManagerController {
    @Autowired
    private BookMapper mapper;

    public void addBook(Book book) {
        mapper.addBook(book);
    }

    public void delBook(int id) {

    }

    public Book findBook(Book book) {
        return null;
    }

    public int updateBook(Book book) {
        return 0;
    }

    public void addReader(Reader reader) {

    }

    public void delReader(int id) {

    }

    public Reader findReader(Reader reader) {
        return null;
    }

    public int updateReader(Reader reader) {
        return 0;
    }

    public int Reset(Reader reader) {//用于重置用户密码
        AdminControl adminControl = new AdminControl();
        int i = adminControl.updateReader(reader);
        return i;
    }
}
