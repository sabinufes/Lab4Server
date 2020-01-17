package com.advancedjava;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        //tip         nume
        ServerSocket server = new ServerSocket(9999);
        Socket s = server.accept();
        InputStream inputStream = s.getInputStream();
        Scanner scanner = new Scanner(inputStream);
        String input= scanner.nextLine();
        System.out.println(input);

        while (true) {
            String line = scanner.nextLine();
            if(line.equals("END")) {
                break;
            } else {
                System.out.println(line);
            }
        }



    }
}
