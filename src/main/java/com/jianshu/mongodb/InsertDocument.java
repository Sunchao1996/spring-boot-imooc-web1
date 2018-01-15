package com.jianshu.mongodb;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sunc on 2018/1/13.
 */
public class InsertDocument {
    public static void main(String[] args) {
        MongoConnect mongoConnect = new MongoConnect();
        MongoClient mongoClient = mongoConnect.getConnection();
        //获取数据库连接
        MongoDatabase mongoDatabase = mongoClient.getDatabase("test");
        //获取文档集合
        MongoCollection<Document> mongoCollection = mongoDatabase.getCollection("collectionTest");
        //值的数据类型应该与使用的时候保持一致
        Document document = new Document("title", "MongoDB").append("description", "databse").append("likes", 100).append("by", "Fly");
        Document document2 = new Document("title", "MongoDB").append("description", "databse").append("likes", 300).append("by", "Fly");
        Document document3 = new Document("title", "MongoDB").append("description", "databse").append("likes", 200).append("by", "Fly");
        List<Document> documentList = new ArrayList<>();
        documentList.add(document);
        documentList.add(document2);
        documentList.add(document3);
        mongoCollection.insertMany(documentList);
        System.out.println("文档插入成功");
    }
}
