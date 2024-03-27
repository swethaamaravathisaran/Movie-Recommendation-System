module com.example.movie {
    requires javafx.controls;
    requires javafx.fxml;
    requires mongo.java.driver;


    opens com.example.movie to javafx.fxml;
    exports com.example.movie;
}