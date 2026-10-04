package com.mohammed.loganalyzer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        // Get application.log from resources as a stream of bytes
        InputStream inputStream = Main.class.getClassLoader().getResourceAsStream("application.log");

        // Convert bytes into characters
        InputStreamReader reader = new InputStreamReader(inputStream);
        // Allow reading the file line by line
        BufferedReader bufferedReader = new BufferedReader(reader);
        // Read the first line from the file
        String line = bufferedReader.readLine();

        System.out.println(line);
        }

}
