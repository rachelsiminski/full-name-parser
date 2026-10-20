package com.pluralsight;

import java.util.Arrays;
import java.util.Scanner;

public class FullNameParser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! Please enter your full name: ");
        String fullName = scanner.nextLine();

        String[] partsOfName = fullName.trim().split(" ");

        System.out.println(Arrays.toString(partsOfName));

        System.out.println("First name: " + partsOfName[0]);

        if (!Boolean.parseBoolean(partsOfName[2])) {
            System.out.println("Last name: " + partsOfName[1]);
        }
        else {
            System.out.println("Middle name: " + partsOfName[1]);
            System.out.println("Last name: " + partsOfName[1]);
        }
    }
}
