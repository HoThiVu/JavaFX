package com.example.demo1;

import com.example.demo1.Model.Employee;

import java.sql.*;
import java.util.List;

public class DBConnect {
    private static final String URL = "jdbc:mysql://localhost/projecthtvjavafx"; //jdbc:mysql is required
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    public  DBConnect() {

    }
    public List<Employee> getData(List<Employee>employees){
        Object connection;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connect successfully!!!");
            Statement st = ((Connection) connection).createStatement();
//   MYSQL QUERY
            String sql = "select * from thongtinnhanvien";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()){
//                data will be added until finish
                String maNV = String.valueOf(rs.getString("MaNV"));
                String hoTen = String.valueOf(rs.getString("HoTen"));
                String ngaySinh = String.valueOf(rs.getString("NgaySinh"));
                String noiSinh = String.valueOf(rs.getString("NoiSinh"));
                String nguyenQuan = String.valueOf(rs.getString("Nguyenquan"));
                String quocTich = String.valueOf(rs.getString("Quoctich"));
                String danToc = String.valueOf(rs.getString("Dantoc"));
                Employee employee = new Employee(maNV,hoTen,ngaySinh,noiSinh,nguyenQuan,quocTich,danToc);
                employees.add(employee);

            }
        } catch (SQLException e) {
            connection = null;
            System.out.println(e +"ket noi khong thanh cong");
        }
        return employees;
    }

}
