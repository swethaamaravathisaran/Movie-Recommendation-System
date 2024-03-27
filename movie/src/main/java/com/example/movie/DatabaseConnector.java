package com.example.movie;
import com.mongodb.client.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.bson.Document;


import java.io.IOException;




public class DatabaseConnector {

    private static TextField user;
    private static TextField pass;


    public static void  init(String user, String email, String genres, String password)
    {
        MongoClient mongoClient = MongoClients.create( "mongodb://localhost:27017" );
        MongoDatabase database = mongoClient.getDatabase("MOVIE_RECOMMENDATION_SYSTEM");
        MongoCollection<Document> collection = database.getCollection("USERS");
        Document mongodocument = new Document ("Username",user).append("Email",email).append("Pefered_genres",genres).append("Password",password);
        collection.insertOne(mongodocument);
        mongoClient.close();
    }

        public static void  init1(String user2){
            MongoClient mongoClient = MongoClients.create( "mongodb://localhost:27017" );
            MongoDatabase database = mongoClient.getDatabase("MOVIE_RECOMMENDATION_SYSTEM");
            MongoCollection<Document> collection = database.getCollection("MOVIES2");
            Document query = new Document("genres", user2);
            MongoCursor<Document> cursor = collection.find(query).iterator();
            while (cursor.hasNext()) {
                Document document = cursor.next();
                System.out.println(document.toJson());
            }
            cursor.close();
            mongoClient.close();
        }
    public static void  init3(String user1,String email1,ActionEvent event,HelloController controller) throws IOException {
        MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
        MongoDatabase database = mongoClient.getDatabase("MOVIE_RECOMMENDATION_SYSTEM");
        MongoCollection<Document> collection = database.getCollection("validation");
        Document query = new Document("Username", user1).append("Password", email1);
        long count = collection.countDocuments(query);
        if (count == 1) {
          //HelloController helloController = new HelloController();
           // helloController.PRESS(event);


            System.out.println("Login success");
            //controller.PRESS(event);
        } else {
            System.out.println("Login fail");
            mongoClient.close();
        }
    }
    public static void  init4(){
        MongoClient mongoClient = MongoClients.create( "mongodb://localhost:27017" );
        MongoDatabase database = mongoClient.getDatabase("MOVIE_RECOMMENDATION_SYSTEM");
        MongoCollection<Document> collection = database.getCollection("USERS");
        Document query = new Document("Username", "shano");
        collection.deleteOne(query);
        mongoClient.close();

    }
    public static void  init5(){
        MongoClient mongoClient = MongoClients.create( "mongodb://localhost:27017" );
        MongoDatabase database = mongoClient.getDatabase("MOVIE_RECOMMENDATION_SYSTEM");
        MongoCollection<Document> collection = database.getCollection("ticket");
        Document query = new Document("Moviename", "My fault").append("genres","comedy").append("ticketamount","500").append("Theatrename","Durais").append("seatno","34");
        collection.insertOne(query);
        mongoClient.close();

    }




}
