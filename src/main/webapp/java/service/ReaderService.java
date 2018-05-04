package service;

import model.Book;

import java.util.List;

public interface ReaderService {
    public int regist(String username,String password);

    public int login(String username,String password);

    public List<Book> findBook(String ISBN, String bookname, String writer, String translator, String press, String pressdate, Double price);

    public int resetMyInfo(String Proof_ID,String name,String sex,String birthday,String address,int keepmoney,Double ID_Number,Double Tel_Number,int Now_Borrow_Amount);
}
