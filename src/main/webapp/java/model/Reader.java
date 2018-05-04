package model;

import java.util.Date;

public class Reader {
    private String Proof_ID;
    private String name;
    private String sex;
    private String birthday;
    private String address;
    private int keepmoney;
    private Double ID_Number;
    private Double Tel_Number;
    private int Now_Borrow_Amount;
    private String readerName;
    private String password;

    public String getProof_ID() {
        return Proof_ID;
    }

    public void setProof_ID(String proof_ID) {
        Proof_ID = proof_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getKeepmoney() {
        return keepmoney;
    }

    public void setKeepmoney(int keepmoney) {
        this.keepmoney = keepmoney;
    }

    public Double getID_Number() {
        return ID_Number;
    }

    public void setID_Number(Double ID_Number) {
        this.ID_Number = ID_Number;
    }

    public Double getTel_Number() {
        return Tel_Number;
    }

    public void setTel_Number(Double tel_Number) {
        Tel_Number = tel_Number;
    }

    public int getNow_Borrow_Amount() {
        return Now_Borrow_Amount;
    }

    public void setNow_Borrow_Amount(int now_Borrow_Amount) {
        Now_Borrow_Amount = now_Borrow_Amount;
    }

    public String getReaderName() {
        return readerName;
    }

    public void setReaderName(String readerName) {
        this.readerName = readerName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Reader() {
    }

    public Reader(String readerName, String password) {
        this.readerName = readerName;
        this.password = password;
    }

    public Reader(String proof_ID, String name, String sex, String birthday, String address, int keepmoney, Double ID_Number, Double tel_Number, int now_Borrow_Amount) {
        Proof_ID = proof_ID;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.address = address;
        this.keepmoney = keepmoney;
        this.ID_Number = ID_Number;
        Tel_Number = tel_Number;
        Now_Borrow_Amount = now_Borrow_Amount;
    }

    public Reader(String proof_ID, String name, String sex, String birthday, String address, int keepmoney, Double ID_Number, Double tel_Number, int now_Borrow_Amount, String readerName, String password) {
        Proof_ID = proof_ID;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.address = address;
        this.keepmoney = keepmoney;
        this.ID_Number = ID_Number;
        Tel_Number = tel_Number;
        Now_Borrow_Amount = now_Borrow_Amount;
        this.readerName = readerName;
        this.password = password;
    }
}
