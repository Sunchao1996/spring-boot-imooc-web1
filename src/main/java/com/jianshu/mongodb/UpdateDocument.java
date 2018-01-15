package com.jianshu.mongodb;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Filters;
import org.bson.Document;

/**
 * Created by Sunc on 2018/1/13.
 */
public class UpdateDocument {
    public static void main(String[] args) {
        MongoConnect mongoConnect = new MongoConnect();
        MongoClient mongoClient = mongoConnect.getConnection();
        MongoCollection<Document> mongoCollection = mongoClient.getDatabase("test").getCollection("collectionTest");

        //将likes=100的换成200,先查找对应记录，然后更新对应字段。
        mongoCollection.updateMany(Filters.eq("likes", "200"), new Document("$set", new Document("likes", "100")));
        FindIterable<Document> findIterable = mongoCollection.find();
        MongoCursor<Document> mongoCursor = findIterable.iterator();
        while (mongoCursor.hasNext()) {
            System.out.println(mongoCursor.next());
        }
    }
}
