package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Book {
    private String ISBN;
    private String bookname;
    private String writer;
    private String translator;
    private String press;
    private String  pressdate;
    private double price;
    private Date InLibrary_Data;
    private long Total_Amount;
    private long Now_Amount;


    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getTranslator() {
        return translator;
    }

    public void setTranslator(String translator) {
        this.translator = translator;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String getPressdate() {
        return pressdate;
    }

    public void setPressdate(String pressdate) {
        this.pressdate = pressdate;
    }

    public Date getInLibrary_Data() {
        return InLibrary_Data;
    }

    public void setInLibrary_Data(Date inLibrary_Data) {
        InLibrary_Data = inLibrary_Data;
    }

    public long getTotal_Amount() {
        return Total_Amount;
    }

    public void setTotal_Amount(long total_Amount) {
        Total_Amount = total_Amount;
    }

    public long getNow_Amount() {
        return Now_Amount;
    }

    public void setNow_Amount(long now_Amount) {
        Now_Amount = now_Amount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", bookname='" + bookname + '\'' +
                ", writer='" + writer + '\'' +
                ", translator='" + translator + '\'' +
                ", press='" + press + '\'' +
                ", pressdate=" + pressdate +
                ", price=" + price +
                ", InLibrary_Data=" + InLibrary_Data +
                ", Total_Amount=" + Total_Amount +
                ", Now_Amount=" + Now_Amount +
                '}';
    }

    public Book(String ISBN, String bookname, String writer, String translator, String press, String pressdate, double price, Date inLibrary_Data, long total_Amount, long now_Amount) {
        this.ISBN = ISBN;
        this.bookname = bookname;
        this.writer = writer;
        this.translator = translator;
        this.press = press;
        this.pressdate = pressdate;
        this.price = price;
        InLibrary_Data = inLibrary_Data;
        Total_Amount = total_Amount;
        Now_Amount = now_Amount;
    }


    public Book(String ISBN, String bookname, String writer, String translator, String press, String  pressdate, double price) {
        this.ISBN = ISBN;
        this.bookname = bookname;
        this.writer = writer;
        this.translator = translator;
        this.press = press;
        this.pressdate = pressdate;
        this.price = price;
    }

    public Book() {
    }
}
