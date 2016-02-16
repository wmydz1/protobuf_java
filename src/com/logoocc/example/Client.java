package com.logoocc.example;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by samchen on 2/16/16.
 */
public class Client {

    public static void main(String args[]) throws  Exception{
        Socket socket=new Socket("127.0.0.1",12000);
        PrintWriter os=new PrintWriter(socket.getOutputStream());

        // 按照定义的数据结构，创建一个Person
        PersonMsg.Person.Builder personBuilder;
        personBuilder = PersonMsg.Person.newBuilder();
        personBuilder.setId(1);
        personBuilder.setName("samchen");
        personBuilder.setEmail("google@gmail.com");
        personBuilder.addFriends("Friend A");
        personBuilder.addFriends("Friend B");
        PersonMsg.Person xxg = personBuilder.build();

        // 将数据写到输出流，如网络输出流，
        xxg.writeTo(socket.getOutputStream());


    }
}
