package org.example;

import java.io.IOException;
import java.util.Scanner;

public class T4 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String str;
        System.out.println("Введите не пустую строку:");
        str = scan.nextLine();
        if (str.isEmpty()) {
            scan.close();
            throw new IOException(" Нельзя вводить пустые строки ");
        }
        scan.close();
    }
}