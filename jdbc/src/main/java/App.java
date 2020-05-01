/*
Java + Mongo Database Hello World Example
*/

import com.mongodb.*;

import java.net.UnknownHostException;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        try {
            //Make Connection
            MongoClient mongoClient = new MongoClient("localhost", 27017);

            //Get Database
            DB db = mongoClient.getDB("WIP");

            //Get Collection
            DBCollection dbCollection = db.getCollection("Employee");

            //Insert a record
            BasicDBObject document = new BasicDBObject();
            document.put("firstName", "Doctor");
            document.put("lastName", "Strange");
            document.put("age", 30);
            document.put("createdDate", new Date());
            dbCollection.insert(document);

            //Update a record
            BasicDBObject find = new BasicDBObject();
            find.put("firstName", "Mighty");

            BasicDBObject newDoc = new BasicDBObject();
            newDoc.put("firstName", "Captain");

            BasicDBObject updateQ = new BasicDBObject();
            updateQ.put("$set", newDoc);

            dbCollection.update(find, updateQ);

            //Delete : ObjectId("5eabecd5a398d69e89a9509c")
            BasicDBObject searchQ = new BasicDBObject();
            searchQ.put("firstName", "Doctor");
            dbCollection.remove(searchQ);

            //Find and Display
            BasicDBObject searchQ2 = new BasicDBObject("firstName", "Captain");
            DBCursor cur = dbCollection.find(searchQ2);

            while (cur.hasNext()) {
                System.out.println(cur.next());
            }


        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }
}
