package com.example.demo1.Model;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
public class Employee {
    private String maNV;
    private String hoTen;
    private String ngaySinh;
    private String noiSinh;
    private String nguyenQuan;
    private String quocTich;
    private String danToc;

    public Employee(String maNV, String hoTen, String ngaySinh, String noiSinh, String nguyenQuan,  String quocTich, String danToc){
                setDanToc(danToc);
                setHoTen(hoTen);
                setNgaySinh(ngaySinh);
                setNoiSinh(noiSinh);
                setNguyenQuan(nguyenQuan);
                setMaNV(maNV);
                setQuocTich(quocTich);
        }
    public String getMaNV() {
        return maNV;
    }

    public String getDanToc() {
        return danToc;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getNguyenQuan() {
        return nguyenQuan;
    }

    public String getNoiSinh() {
        return noiSinh;
    }

    public String getQuocTich() {
        return quocTich;
    }

//-----
    public void setDanToc(String danToc) {
        this.danToc = danToc;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setNguyenQuan(String nguyenQuan) {
        this.nguyenQuan = nguyenQuan;
    }

    public void setNoiSinh(String noiSinh) {
        this.noiSinh = noiSinh;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }


}

