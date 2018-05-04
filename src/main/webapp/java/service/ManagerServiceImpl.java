package service;

import dao.BookMapper;
import dao.ManagerMapper;
import dao.ReaderMapper;
import model.Book;
import model.Reader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ManagerServiceImpl implements ManagerService {
    @Autowired
    private BookMapper bookMapper;
    @Autowired
    private ReaderMapper readerMapper;
    @Autowired
    private ManagerMapper mangerMapper;
    public int login(String adminname, String password) {
        return mangerMapper.login(adminname,password);
    }

    public int delReader(String id) {
        return readerMapper.delReader(id);
    }

    public int updateReaderInfo(String Proof_ID,
                                String name,
                                String sex,
                                String birthday,
                                String address,
                                int keepmoney,
                                Double ID_Number,
                                Double Tel_Number,
                                int Now_Borrow_Amount,
                                String readerName,
                                String password) {
        return readerMapper.updateReader(new Reader(Proof_ID,  name,  sex,  birthday,  address,  keepmoney,  ID_Number,  Tel_Number,  Now_Borrow_Amount));
    }

    public int resetPassword(String adminname, String password) {
        return mangerMapper.resetPassword(adminname,password);
    }

    public int addReader(String username, String password, String Proof_ID, String name, String sex, String birthday, String address, int keepmoney, Double ID_Number, Double Tel_Number, int Now_Borrow_Amount) {
        return readerMapper.addReader(new Reader( Proof_ID,  name,  sex,  birthday,  address,  keepmoney,  ID_Number,  Tel_Number,  Now_Borrow_Amount));
    }

    public List<Reader> findAllReader() {
        return readerMapper.findReader(null);
    }

    public List<Reader> findReader(String Proof_ID, String name, String sex, String birthday, String address, int keepmoney, Double ID_Number, Double Tel_Number, int Now_Borrow_Amount, String readerName) {
        return readerMapper.findReader(new Reader(Proof_ID,  name,  sex,  birthday,  address,  keepmoney,  ID_Number,  Tel_Number,  Now_Borrow_Amount));
    }

    public int addBook(String ISBN, String bookname, String writer, String translator, String press, String pressdate, Double price) {
        return bookMapper.addBook(new Book(ISBN,  bookname,  writer,  translator,  press,  pressdate,  price));
    }

    public int delBookById(String ISBN) {
        return bookMapper.delBookById(ISBN);
    }

    public int delBookByName(String bookname) {
        return bookMapper.delBookByName(bookname);
    }

    public int updateBook(String ISBN, String bookname, String writer, String translator, String press, String pressdate, Double price) {
        return bookMapper.updateBook(new Book( ISBN,  bookname,  writer,  translator,  press,  pressdate,  price));
    }

    public List<Book> findBook(String ISBN, String bookname, String writer, String translator, String press, String pressdate, Double price) {
        return bookMapper.findBook(new Book( ISBN,  bookname,  writer,  translator,  press,  pressdate,  price));
    }
}
