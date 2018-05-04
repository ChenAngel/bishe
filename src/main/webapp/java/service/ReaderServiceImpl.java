package service;

import dao.BookMapper;
import dao.ReaderMapper;
import model.Book;
import model.Reader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReaderServiceImpl implements ReaderService {
    @Autowired
    private ReaderMapper readerMapper;
    @Autowired
    private BookMapper bookMapper;

    public int regist(String username, String password) {
        if (readerMapper.check(username)==null) {
            Reader reader = new Reader(username,password);
            readerMapper.addReader(reader);
            return 1;
        }else{
            return 0;
        }

    }

    public int login(String username, String password) {
        return readerMapper.findReader(new Reader(username,password))==null?0:1;
    }

    public List<Book> findBook(String ISBN, String bookname, String writer, String translator, String press, String pressdate, Double price) {
        Book book = new Book(ISBN,bookname,writer,translator,press,pressdate,price);
        return bookMapper.findBook(book);
    }

    public int resetMyInfo(String Proof_ID, String name, String sex, String birthday, String address, int keepmoney, Double ID_Number, Double Tel_Number, int Now_Borrow_Amount) {
        return readerMapper.updateReader(new Reader(Proof_ID,name,sex,birthday,address,keepmoney,ID_Number,Tel_Number,Now_Borrow_Amount));
    }
}
