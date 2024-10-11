package com.practice.day4_Exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class TryWithResourceStatement {
    public static void main(String[] args) throws IOException {
        try (FileOutputStream out = new FileOutputStream("text.txt")) {

                    out.write("Hi There".getBytes(StandardCharsets.UTF_8));
                    out.flush();
                } catch (IOException e){
                    e.printStackTrace();
                }
    }
}
