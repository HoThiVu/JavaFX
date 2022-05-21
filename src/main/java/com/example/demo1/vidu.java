//package com.example.demo1;
//
//import com.example.projectjavafx.model.Employee;
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
//import javafx.scene.layout.HBox;
//import javafx.scene.layout.VBox;
//import javafx.stage.Stage;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class vidu extends Application {
//
//    List<Employee> employees = new ArrayList<>();
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//    @Override
//    public void start(Stage primaryStage) {
//        primaryStage.setTitle("Hello Vư");
//        TextField tName= new TextField("type here");
//        tName.setMaxHeight(50);
//        tName.setMaxWidth(100);
////        tName.setAlignment(Pos.CENTER);
////        Label l = new Label("NO TEXT ");
//        employees.add(new Employee("Hồ Thị Vư", 20));
//        employees.add(new Employee("Aun Vư", 15));
//
//        VBox root = new VBox();
//        Button btnAdd = new Button("ADD");
//
//        VBox vBoxEmployee = new VBox();
//
//        btnAdd.setOnAction(actionEvent -> {
//
//            vBoxEmployee.getChildren().clear();// xóa ds cũ được hiển thị và chỉ hiện thị danh sách mới.
//            employees.add(new Employee("Ho Thi abc", 15));
////            root.getChildren().add(btnAdd);
//            tName.getText();
//            displayEmployeeList(vBoxEmployee, employees);// gọi lại hàm displayList
//
//        });
//        root.getChildren().add(tName);
//        root.getChildren().add(btnAdd);// add vào VBox
//        root.getChildren().add(vBoxEmployee);
//
//        displayEmployeeList(vBoxEmployee, employees);
//
//        primaryStage.setScene(new Scene(root, 200, 200));
//
//        primaryStage.show();
//
//    }
//
//    private void displayEmployeeList(VBox root, List<Employee> employees) {
//        for (Employee employee : employees) {
//            HBox hBoxLineEmployee = new HBox();
//            Label lbEmployeeName = new Label();
//            lbEmployeeName.setText(employee.name);// get lấy giá trị được truyền vào cho name
//
//            Label lbEmployeeAge = new Label();
//            lbEmployeeAge.setText("" + employee.age);// get lấy giá trị được truyền vào cho age
//            hBoxLineEmployee.getChildren().addAll(lbEmployeeName, lbEmployeeAge);
//            hBoxLineEmployee.setSpacing(20);
//            root.getChildren().add(hBoxLineEmployee);
//
//        }
//    }
//}
