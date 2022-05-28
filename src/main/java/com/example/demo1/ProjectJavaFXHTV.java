package com.example.demo1;

//import com.example.demo1.Model.Employee;
//import com.example.demo1.Model.Employee;
import com.example.demo1.Model.Employee;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class ProjectJavaFXHTV extends Application {
    List<Employee> employees = new ArrayList<>();
//
    public static void main(String[] args) {
        launch(args);
    }
//
    @Override
    public void start(Stage primaryStage) {
        DBConnect con = new DBConnect();
        primaryStage.setTitle("Final Project JavaFX-HTV");
        VBox root = new VBox();
        Button btnADD = new Button("ADD");
//        Chia GridPane----------------------------------
        GridPane rootGridPane = new GridPane();
        rootGridPane.setPadding(new Insets(20));
        rootGridPane.setHgap(25);
        rootGridPane.setVgap(15);

//FROM NHẬP -------------------------------
        Label lblMaEmployee= new Label("Nhập Mã Nhân Viên :");
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

        rootGridPane.add(lblMaEmployee, 0, 0);
        rootGridPane.add(tfMaEmployee, 1, 0);
//
        rootGridPane.add(labelHoTen, 0, 1);
        rootGridPane.add(tfHoTen,1,1);

//
        rootGridPane.add(labelNgaySinh, 0, 2);
        rootGridPane.add(tfNgaySinh,1,2);
//
        rootGridPane.add(labelNoiSinh, 0, 3);
        rootGridPane.add(tfNoiSinh,1,3);
        //// hàng thứ ba
        rootGridPane.add(labelNguyenQuan, 2, 0);
        rootGridPane.add(tfNguyenQuan,3,0);
//
        rootGridPane.add(labelQuocTich, 2, 1);
        rootGridPane.add(tfQuocTich,3,1);
        //
        rootGridPane.add(labelDanToc, 2, 2);
        rootGridPane.add(tfDanToc,3,2);

        tfMaEmployee.setMaxWidth(200);
//       Button btnInsertEmployee = new Button("Lưu");
        btnADD.setMaxWidth(200);
        rootGridPane.add(btnADD,2,4);

        root.getChildren().addAll(rootGridPane);
        root.setPadding(new Insets(0,0,0,50));
        primaryStage.setScene(new Scene(root, 1500, 900));
        primaryStage.show();
//
//    }
//

        for (Employee employee : con.getData(employees)){
            HBox hBoxLineEmployee = new HBox();

// GridPane btnGridPane BUTTON DELETE AND EDIT
            GridPane btnGridPane = new GridPane();
            btnGridPane.setHgap(5);
            btnGridPane.setVgap(5);

            HBox hbButtons = new HBox();
//            hbButtons.setSpacing(20.0);

            Button btnEdit = new Button("EDIT");
            Button btnDelete = new Button("DELETE");
//            Button btnExit = new Button("Exit");
            hbButtons.getChildren().addAll(btnEdit, btnDelete);

            Label lbEmployeeMaNV = new Label(employee.getMaNV());
//            lbEmployeeMaNV.setText(" "+employee.getMaNV());
            Label lbEmployeeHoTen = new Label(employee.getHoTen());
//            lbEmployeeHoTen.setText(employee.getHoTen());// get lấy giá trị được truyền vào cho hoten
            Label lbEmployeeNgaySinh = new Label(employee.getNgaySinh());
//            lbEmployeeNgaySinh.setText(" "+employee.getNgaySinh());
            Label lbEmployeeNoiSinh = new Label(employee.getNoiSinh());
//            lbEmployeeNoiSinh.setText(" "+employee.getNoiSinh());

            Label lbEmployeeNguyenQuan = new Label(employee.getNguyenQuan());
//            lbEmployeeNguyenQuan.setText(" "+employee.getNguyenQuan());// get lấy giá trị được truyền vào cho dantoc
            Label lbEmployeeQuocTich = new Label(employee.getQuocTich());
//            lbEmployeeQuocTich.setText(" "+employee.getQuocTich());// get lấy giá trị được truyền vào cho dantoc
            Label lbEmployeeDanToc = new Label(employee.getDanToc());

//            Button btnEdit = new Button("Edit");
//            Button btnDelete = new Button("DELETE");

            lbEmployeeMaNV.setMinWidth(20);
            lbEmployeeHoTen.setMinWidth(130);
            lbEmployeeNgaySinh.setMinWidth(150);
            lbEmployeeNoiSinh.setMinWidth(100);
            lbEmployeeNguyenQuan.setMinWidth(100);
            lbEmployeeQuocTich.setMinWidth(100);
            lbEmployeeDanToc.setMinWidth(50);

            btnGridPane.add(hbButtons, 0, 1, 1, 1);
            hBoxLineEmployee.getChildren().addAll(lbEmployeeMaNV,lbEmployeeHoTen,lbEmployeeNgaySinh,lbEmployeeNoiSinh,lbEmployeeNguyenQuan,lbEmployeeQuocTich,lbEmployeeDanToc,btnEdit,btnDelete);

            lbEmployeeMaNV.setMaxWidth(300);
            hBoxLineEmployee.setSpacing(10);
            root.getChildren().addAll(hBoxLineEmployee,btnGridPane);

        }
}

}
