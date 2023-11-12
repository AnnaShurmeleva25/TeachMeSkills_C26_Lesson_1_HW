package com.teachmeskills.lesson1;

import java.util.Scanner;

public class HelloUser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user = scanner.nextLine();
        System.out.println("Hello " + user);

    }
}
