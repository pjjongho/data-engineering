package com.practice.day6.TCP_Example;

import javax.xml.crypto.Data;
import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TcpClient {
    public static void main(String[] args) {
        try {
            String serverIp = "localhost";
            System.out.println("Connecting Server");
            System.out.println("Server IP: " + serverIp);
            Socket socket = new Socket(serverIp, 8888);

            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("Hello\n".getBytes(StandardCharsets.UTF_8));
            outputStream.flush();

            InputStream inputStream = socket.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);

            System.out.println("message from server: " + dataInputStream.readUTF());
            dataInputStream.close();
            socket.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
