package com.jianshu.mongodb;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sunc on 2018/1/13.
 */
public class MongoConnect {
    /*建立mongodb连接
    * 1、如果连接mongodb的集群，需要用到List<ServerAddress>，mongoClient连接多个地址
    * 2、连接时如果mongodb没有账号和密码，则不需要设置MongoCredential直接连接即可。当然一定要确保mongodb处于内网，不被外网攻击。前一段时间出现的mongodb攻击，就是因为mongodb没有密码，同时27017端口开放了，导致数据信息泄露。
    * */
    public MongoClient getConnection() {
        MongoClient mongoClient = null;
        ServerAddress serverAddress = new ServerAddress("localhost", 27017);
//        当mongodb建立集群的时候需要使用这种方式进行数据库连接
//        List<ServerAddress> addresses = new ArrayList<>();
//        addresses.add(serverAddress);
//        mongoClient = new MongoClient(addresses);
        mongoClient = new MongoClient(serverAddress);
//        通过用户名，数据库名，密码连接mongodb数据库
//        MongoCredential credential = MongoCredential.createCredential("userName","databaseName","password".toCharArray());
//        List<MongoCredential> credentials = new ArrayList<>();
//        credentials.add(credential);
//        通过连接认证获取MongoDb连接
//        mongoClient = new MongoClient(addresses,credentials);
        return mongoClient;
    }

    /*关闭连接*/
    public void closeConnection(MongoClient mongoClient) {
        mongoClient.close();
    }

    public static void main(String[] args) {
        MongoConnect mongoConnect = new MongoConnect();
        MongoClient mongoClient = mongoConnect.getConnection();
        System.out.println(mongoClient);
        mongoConnect.closeConnection(mongoClient);
    }
}
