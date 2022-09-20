module com.example.javaplayground {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javaplayground to javafx.fxml;
    exports com.example.javaplayground;
}