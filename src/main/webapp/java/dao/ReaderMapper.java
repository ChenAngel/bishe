package dao;

import model.Book;
import model.Reader;

import java.util.List;

public interface ReaderMapper {
    public int addReader(Reader reader);
    public Reader check(String username);
    public int delReader(String id);
    public int updateReader(Reader reader);
    public List<Reader> findReader(Reader reader);
}
