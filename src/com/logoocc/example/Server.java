package com.logoocc.example;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

/**
 * Created by samchen on 2/16/16.
 */
public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(12000);

        while (true) {
            Socket socket = server.accept();
            invoke(socket);
        }
    }

    public static byte[] readStream(InputStream inStream) throws Exception {
        int count = 0;
        while (count == 0) {
            count = inStream.available();
        }
        byte[] b = new byte[count];
        inStream.read(b);
        return b;
    }


    private static void invoke(final Socket client) throws IOException {
        new Thread(new Runnable() {
            public void run() {
                InputStream in =null;
                ByteArrayOutputStream out =null;
                try {
                    in =client.getInputStream();
//                   out = new ByteArrayOutputStream();
//                    byte[] buffer = new byte[1024];
//                    int len = -1;
//                    while ((len = in.read(buffer)) != -1) {
//                        out.write(buffer, 0, len);
//                    }
//                    byte[] byteArray =   out.toByteArray();

                    ByteArrayInputStream input = new ByteArrayInputStream(readStream(client.getInputStream()));

                    // 反序列化
                    PersonMsg.Person xxg2 = PersonMsg.Person.parseFrom(input);
                    System.out.println("ID:" + xxg2.getId());
                    System.out.println("name:" + xxg2.getName());
                    System.out.println("email:" + xxg2.getEmail());
                    System.out.println("friend:");
                    List<String> friends = xxg2.getFriendsList();
                    for(String friend : friends) {
                        System.out.println(friend);
                    }


                } catch(Exception ex) {
                    ex.printStackTrace();
                } finally {
                    try {
                        in.close();
                    } catch (Exception e) {}
                    try {
                        out.close();
                    } catch (Exception e) {}
                    try {
                        client.close();
                    } catch (Exception e) {}
                }
            }
        }).start();
    }

}
