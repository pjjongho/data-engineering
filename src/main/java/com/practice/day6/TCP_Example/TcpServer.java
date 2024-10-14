package com.practice.day6.TCP_Example;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalTime;

public class TcpServer {

    public static void main(String[] args) {
        ServerSocket serverSocket = null;


        try {
            serverSocket = new ServerSocket(8888);
            System.out.println("[" + LocalTime.now() + "] Ready for Server");
        } catch (IOException e){
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
        }

        while (true){

            try {
                System.out.println("[" + LocalTime.now() +"] Waiting for Request Connecting ");
                Socket socket = serverSocket.accept();
                System.out.println("[" + LocalTime.now() +" ]" + "Connecting! ");

                InputStream inputStream = socket.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

                String inputString = bufferedReader.readLine();
                System.out.println("message from client: " + inputString);

                OutputStream outputStream = socket.getOutputStream();

                DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
                dataOutputStream.writeUTF("World");

                System.out.println("[" + LocalTime.now() + "]" + "Data Downloaded.");
                dataOutputStream.close();
                socket.close();

            } catch (IOException e){
                System.out.println(e.getLocalizedMessage());
                e.printStackTrace();
            }

        }

    }
}
