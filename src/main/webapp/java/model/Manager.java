package model;

public class Manager {
    private double woek_ID;
    private String manager_Name;
    private double password;
    private double tel;
    private byte admin;

    public double getWoek_ID() {
        return woek_ID;
    }

    public void setWoek_ID(double woek_ID) {
        this.woek_ID = woek_ID;
    }

    public String getManager_Name() {
        return manager_Name;
    }

    public void setManager_Name(String manager_Name) {
        this.manager_Name = manager_Name;
    }

    public double getPassword() {
        return password;
    }

    public void setPassword(double password) {
        this.password = password;
    }

    public double getTel() {
        return tel;
    }

    public void setTel(double tel) {
        this.tel = tel;
    }

    public byte getAdmin() {
        return admin;
    }

    public void setAdmin(byte admin) {
        this.admin = admin;
    }
}
