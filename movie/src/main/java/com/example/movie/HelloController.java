package com.example.movie;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.bson.Document;

import java.io.IOException;

public class HelloController {
    @FXML
    private Button button1;
    @FXML
    private Button BUTTON12;
    @FXML
    private Button button13;
    @FXML
    private Button BUTTON;
    @FXML
    private Button button4;
    @FXML
    private Button button5;
    @FXML
    private TextField Username;
    @FXML
    private TextField Email;
    @FXML
    private TextField  Pefered_genres;
    @FXML
    private PasswordField Password;
    @FXML
    private  TextField user;
    @FXML
    private  PasswordField pass;
    @FXML
    private TextField genres;

    @FXML
    public void PRESS(ActionEvent event) throws IOException {

       String user1= user.getText();
        String email1 = pass.getText();
        DatabaseConnector.init3 (user1, email1,event,this);
        FXMLLoader loginfxmlLoader = new FXMLLoader(HelloApplication.class.getResource("landing.fxml"));
        Scene firstscene = new Scene(loginfxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Task");
        stage.setScene(firstscene);
        stage.show();
    }

@FXML
   public void click(ActionEvent event) throws IOException {
        FXMLLoader loginfxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SIGNUP.fxml"));
        Scene firstscene = new Scene(loginfxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Task");
        stage.setScene(firstscene);
        stage.show();
    }
    @FXML
    public void press3(ActionEvent event) throws IOException {
        FXMLLoader loginfxmlLoader = new FXMLLoader(HelloApplication.class.getResource("landing.fxml"));
        Scene firstscene = new Scene(loginfxmlLoader.load());
        String user= Username.getText();
        String email = Email.getText();
        String genres = Pefered_genres.getText();
        String password = Password.getText();
        DatabaseConnector.init( user, email, genres,password);
        Stage stage = new Stage();
        stage.setTitle("Task");
        stage.setScene(firstscene);
        stage.show();
    }
    @FXML
    public void onclick(ActionEvent event) throws IOException {
        FXMLLoader loginfxmlLoader = new FXMLLoader(HelloApplication.class.getResource("moviedetails.fxml"));
        Scene firstscene = new Scene(loginfxmlLoader.load());
        String user2= genres.getText();
        DatabaseConnector.init1(user2);
     //   DatabaseConnector.init6(user2);
        Stage stage = new Stage();
        stage.setTitle("Task");
        stage.setScene(firstscene);
        stage.show();
    }
    public void press4(ActionEvent event) throws IOException {
        FXMLLoader loginfxmlLoader = new FXMLLoader(HelloApplication.class.getResource("userprofile.fxml"));
        Scene firstscene = new Scene(loginfxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Task");
        stage.setScene(firstscene);
        stage.show();
    }
    public void press5(ActionEvent event) throws IOException {
       DatabaseConnector.init4();
        FXMLLoader loginfxmlLoader = new FXMLLoader(HelloApplication.class.getResource("moviedetails.fxml"));
        Scene firstscene = new Scene(loginfxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Task");
        stage.setScene(firstscene);
        stage.show();
    }
    public void ticket(ActionEvent event) throws IOException {
        DatabaseConnector.init4();
        FXMLLoader loginfxmlLoader = new FXMLLoader(HelloApplication.class.getResource("POPUP.fxml"));
        Scene firstscene = new Scene(loginfxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Task");
        stage.setScene(firstscene);
        stage.show();
    }
    public void BOOK(ActionEvent event) throws IOException {
        DatabaseConnector.init5();
        FXMLLoader loginfxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ticket.fxml"));
        Scene firstscene = new Scene(loginfxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Task");
        stage.setScene(firstscene);
        stage.show();
    }


}

