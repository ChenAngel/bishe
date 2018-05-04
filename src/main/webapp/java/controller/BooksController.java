package controller;

import model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.BookService;

@Controller
public class BooksController {
    @Autowired
    private BookService bookService;

    @RequestMapping("/addbook")
    public void add(Book book){
        bookService.addBook(book);
    }
}
