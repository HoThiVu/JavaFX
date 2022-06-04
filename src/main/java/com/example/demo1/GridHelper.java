package com.example.demo1;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class GridHelper {
    public void displayGrid(GridPane rootGridPane, Button btnADD) {
        //FROM NHẬP -------------------------------
        Label lblMaEmployee = new Label("Nhập Mã Nhân Viên :");
        TextField tfMaEmployee = new TextField();

        Label labelHoTen = new Label(" Nhập Họ Tên :");
        TextField tfHoTen = new TextField();

        Label labelNgaySinh = new Label("Nhập Ngày Sinh :");
        TextField tfNgaySinh = new TextField();
//
        Label labelNoiSinh = new Label("Nhập Nơi Sinh :");
        TextField tfNoiSinh = new TextField();
        //
        Label labelNguyenQuan = new Label("Nhập Nguyên Quán :");
        TextField tfNguyenQuan = new TextField();
//
        Label labelQuocTich = new Label("Nhập Quốc Tịch :");
        TextField tfQuocTich = new TextField();
        //
        Label labelDanToc = new Label("Nhập Tên Dân Tộc :");
        TextField tfDanToc = new TextField();

        //        ------------------------------------------------------------------------------text title name
        Label lblTitleMaNV = new Label("Mã Nhân Viên");
        Label lblTitleHoTen = new Label("Họ Tên");
        Label lblTitleNgaySinh = new Label("Ngày Sinh");
        Label lblTitleNoiSinh = new Label("Nơi Sinh");
        Label lblTitleNguyenQuan = new Label("Nguyên Quán");
        Label lblTitleQuocTich = new Label("Quốc Tịch");
        Label lblTitleDanToc = new Label("Dân Tộc");

//------------Grid pane text title name

        rootGridPane.add(lblTitleMaNV, 0, 5);
        rootGridPane.add(lblTitleHoTen, 1, 5);
        rootGridPane.add(lblTitleNgaySinh, 2, 5);
        rootGridPane.add(lblTitleNoiSinh, 3, 5);
        rootGridPane.add(lblTitleNguyenQuan, 4, 5);
        rootGridPane.add(lblTitleQuocTich, 5, 5);
        rootGridPane.add(lblTitleDanToc, 6, 5);

        //--------------------------------Grid pane from
        rootGridPane.add(lblMaEmployee, 0, 0);
        rootGridPane.add(tfMaEmployee, 1, 0);
//
        rootGridPane.add(labelHoTen, 0, 1);
        rootGridPane.add(tfHoTen, 1, 1);
//
        rootGridPane.add(labelNgaySinh, 0, 2);
        rootGridPane.add(tfNgaySinh, 1, 2);
//
        rootGridPane.add(labelNoiSinh, 0, 3);
        rootGridPane.add(tfNoiSinh, 1, 3);
        //// hàng thứ ba
        rootGridPane.add(labelNguyenQuan, 2, 0);
        rootGridPane.add(tfNguyenQuan, 3, 0);
//
        rootGridPane.add(labelQuocTich, 2, 1);
        rootGridPane.add(tfQuocTich, 3, 1);
        //
        rootGridPane.add(labelDanToc, 2, 2);
        rootGridPane.add(tfDanToc, 3, 2);

//        lblTitleMaNV.setMinWidth(50);
//        lblTitleHoTen.setMinWidth(50);
//        lblTitleNgaySinh.setMinWidth(50);
//        lblTitleNoiSinh.setMinWidth(50);
//        lblTitleNguyenQuan.setMinWidth(50);
//        lblTitleQuocTich.setMinWidth(50);
//        lblTitleDanToc.setMinWidth(50);
//        lblTitleMaNV.setPadding(new Insets(0,0,0,30));
//        tfMaEmployee.setMaxWidth(200);
        btnADD.setMaxWidth(200);
        rootGridPane.add(btnADD, 2, 4);

    }
}
