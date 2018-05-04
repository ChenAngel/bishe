package dao;

import model.Reader;

import java.util.List;

public interface ManagerMapper {
    public int login(String managername,String password);
    public int resetPassword(String adminname,String password);
}
