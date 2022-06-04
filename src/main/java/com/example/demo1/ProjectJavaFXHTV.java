package com.example.demo1;
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
import org.w3c.dom.Text;
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
        GridHelper gridHelper = new GridHelper();
        primaryStage.setTitle("Final Project JavaFX-HTV");
        VBox root = new VBox();
        Button btnADD = new Button("ADD");

//        Chia GridPane----------------------------------
        GridPane rootGridPane = new GridPane();
        rootGridPane.setPadding(new Insets(20));
        rootGridPane.setHgap(25);
        rootGridPane.setVgap(15);

        gridHelper.displayGrid(rootGridPane, btnADD); // gọi hàm gridHelper
        root.getChildren().addAll(rootGridPane);
        root.setPadding(new Insets(0, 0, 0, 50));
        primaryStage.setScene(new Scene(root, 1500, 900));
        primaryStage.show();

        for (Employee employee : con.getData(employees)) {
            HBox hBoxLineEmployee = new HBox();
            GridPane btnGridPane = new GridPane();

            btnGridPane.setHgap(5);
            btnGridPane.setVgap(5);

//            GridPane showDataGridPane =new GridPane();
//            showDataGridPane.setPadding(new Insets(20));
//            showDataGridPane.setHgap(55);
//            showDataGridPane.setVgap(65);
            HBox hbButtons = new HBox();
//            hbButtons.setSpacing(20.0);

            Button btnEdit = new Button("EDIT");
            Button btnDelete = new Button("DELETE");
//
            hbButtons.getChildren().addAll(btnEdit, btnDelete);

            Label lbEmployeeMaNV = new Label(employee.getMaNV());

            Label lbEmployeeHoTen = new Label(employee.getHoTen());
//            lbEmployeeHoTen.setText(employee.getHoTen());// get lấy giá trị được truyền vào cho hoten
            Label lbEmployeeNgaySinh = new Label(employee.getNgaySinh());

            Label lbEmployeeNoiSinh = new Label(employee.getNoiSinh());

            Label lbEmployeeNguyenQuan = new Label(employee.getNguyenQuan());
//            lbEmployeeNguyenQuan.setText(" "+employee.getNguyenQuan());// get lấy giá trị được truyền vào cho dantoc
            Label lbEmployeeQuocTich = new Label(employee.getQuocTich());

            Label lbEmployeeDanToc = new Label(employee.getDanToc());

//            showDataGridPane.add(lbEmployeeMaNV, 0, 0);
//            showDataGridPane.add(lbEmployeeHoTen, 1, 0);
//            showDataGridPane.add(lbEmployeeNgaySinh, 2, 0);
//            showDataGridPane.add(lbEmployeeNoiSinh, 3, 0);
//            showDataGridPane.add(lbEmployeeNguyenQuan, 4, 0);
//            showDataGridPane.add(lbEmployeeQuocTich, 5, 0);
//            showDataGridPane.add(lbEmployeeDanToc, 6, 0);

//------------
            lbEmployeeMaNV.setMinWidth(50);
            lbEmployeeHoTen.setMinWidth(130);
            lbEmployeeNgaySinh.setMinWidth(150);
            lbEmployeeNoiSinh.setMinWidth(100);
            lbEmployeeNguyenQuan.setMinWidth(100);
            lbEmployeeQuocTich.setMinWidth(100);
            lbEmployeeDanToc.setMinWidth(50);
            btnGridPane.add(hbButtons, 0, 1, 1, 1);
            hBoxLineEmployee.getChildren().addAll(lbEmployeeMaNV,lbEmployeeHoTen,lbEmployeeNgaySinh,lbEmployeeNoiSinh,lbEmployeeNguyenQuan,lbEmployeeQuocTich,lbEmployeeDanToc, btnEdit, btnDelete);

//            lbEmployeeMaNV.setMaxWidth(300);
            hBoxLineEmployee.setSpacing(10);
            root.getChildren().addAll(hBoxLineEmployee, btnGridPane);
        }
    }


}
