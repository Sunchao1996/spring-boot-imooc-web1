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
public class DeleteDocument {
    public static void main(String[] args){
        MongoConnect mongoConnect = new MongoConnect();
        MongoClient mongoClient = mongoConnect.getConnection();
        MongoCollection<Document> mongoCollection = mongoClient.getDatabase("test").getCollection("collectionTest");

        //value的类型应该和插入的时候类型保持一致
        //删除满足条件的所有文档
        mongoCollection.deleteMany(Filters.eq("likes",100));
        //删除满足条件的第一个文档
        mongoCollection.deleteOne(Filters.eq("likes",300));

        FindIterable<Document> findIterable = mongoCollection.find();
        MongoCursor<Document> mongoCursor = findIterable.iterator();
        while(mongoCursor.hasNext()){
            System.out.println(mongoCursor.next());
        }
    }
}
