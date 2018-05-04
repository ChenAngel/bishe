package service;

import model.Book;
import model.Reader;

import java.util.List;

public interface ManagerService {
    public int login(String adminname,String password);

    public int delReader(String id);

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
                                String password);

    public int resetPassword(String adminname,String password);

    public int addReader(String username,
                         String password,
                         String Proof_ID,
                         String name,
                         String sex,
                         String birthday,
                         String address,
                         int keepmoney,
                         Double ID_Number,
                         Double Tel_Number,
                         int Now_Borrow_Amount);

    public List<Reader> findAllReader();

    public List<Reader> findReader(String Proof_ID,
                             String name,
                             String sex,
                             String birthday,
                             String address,
                             int keepmoney,
                             Double ID_Number,
                             Double Tel_Number,
                             int Now_Borrow_Amount,
                             String readerName);

    public int addBook(String ISBN, String bookname, String writer, String translator, String press, String pressdate, Double price);
    public int delBookById(String ISBN);
    public int delBookByName(String bookname);
    public int updateBook(String ISBN,
                          String bookname,
                          String writer,
                          String translator,
                          String press,
                          String pressdate,
                          Double price);
    public List<Book> findBook(String ISBN,
                               String bookname,
                               String writer,
                               String translator,
                               String press,
                               String pressdate,
                               Double price);

}
