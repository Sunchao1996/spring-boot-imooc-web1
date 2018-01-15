package com.jianshu.mongodb;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 * Created by Sunc on 2018/1/13.
 */
public class CreateCollection {
    public static void main(String[] args) {
        MongoConnect mongoConnect = new MongoConnect();
        //获取客户端连接
        MongoClient mongoClient = mongoConnect.getConnection();
        //获取数据库连接
        MongoDatabase mongoDatabase = mongoClient.getDatabase("test");
        System.out.println("连接数据库成功");
        //创建集合，相当于关系数据库中的表
        mongoDatabase.createCollection("collectionTest");
        System.out.println("创建集合成功");
        //获取数据库集合，如果集合不存在的话会创建，集合中数据以mongodb中的特定文档格式存储
        MongoCollection<Document> mongoCollection = mongoDatabase.getCollection("collectionTest");
        System.out.println("成功获取集合");
    }
}
