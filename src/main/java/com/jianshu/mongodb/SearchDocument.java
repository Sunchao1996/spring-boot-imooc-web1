package com.jianshu.mongodb;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import org.bson.Document;

/**
 * Created by Sunc on 2018/1/13.
 */
public class SearchDocument {
    public static void main(String[] args){
        MongoConnect mongoConnect = new MongoConnect();
        MongoClient mongoClient = mongoConnect.getConnection();
        MongoCollection<Document> mongoCollection = mongoClient.getDatabase("test").getCollection("collectionTest");
        //检索所有文档
        /*
        *  1.获取迭代器FindIterable<Document>
        *  2.获取游标MongoCursor<Docuemnt>
        *  3.通过游标遍历检索出的文档集合
        *  原理就是，先确定mongoCollection即要检索哪个Collection，然后建立FindIterable迭代器，建立mongoCursor，就是JDBC中的ResultSet,循环输出。
        * */
        FindIterable<Document> findIterable = mongoCollection.find();
        MongoCursor<Document> mongoCursor = findIterable.iterator();
        while(mongoCursor.hasNext()){
            System.out.println(mongoCursor.next());
        }
    }
}
