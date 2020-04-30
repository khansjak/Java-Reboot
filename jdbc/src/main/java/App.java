/*
Java + Mongo Database Hello World Example
*/

import com.mongodb.*;

import java.net.UnknownHostException;

public class App {
    public static void main(String[] args) {
        try {
            //Connect to Mongo
            MongoClient mongoClient = new MongoClient("localhost", 27017);

            //Get the database
            DB db = mongoClient.getDB("WIP");

            //Get the collection
            DBCollection dbCollection = db.getCollection("User");

            //Query the database
            BasicDBObject searchQuery = new BasicDBObject();
            searchQuery.put("fname", "Support");

            DBCursor cursor = dbCollection.find(searchQuery);

            while (cursor.hasNext()) {
                System.out.println(cursor.next());
            }


        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
