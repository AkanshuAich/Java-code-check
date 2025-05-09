package com.example.security;

import java.io.*;
import java.sql.*;
import java.util.*;

public class Example {
    public static void main(String args[]) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
    // ... rest of the code that uses sc
}
        // // System.out.println("Enter your username:");
        String username = sc.nextLine();
        // // System.out.println("Enter your password:");
        String password = sc.nextLine();

        // SECURITY ISSUE: SQL Injection vulnerability
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root")) {
    // ... rest of the code that uses conn
}
        // Statement is no longer used since we are using PreparedStatement now.
        String query = "SELECT * FROM users WHERE username = '" + username + "' AND password = '" + password + "'";
        // ResultSet is now managed within the try-with-resources block with PreparedStatement.

        if(rs.next())
        // // System.out.println("Login successful!"); // STYLE VIOLATION: No braces for if statement

        // CODE QUALITY ISSUE: Hardcoded credentials and poor variable naming
        String adminUsername = "admin"; String adminPassword = "admin123"; 

        // POTENTIAL BUG: Division by zero not handled
        int dividend = 10;
        int divisor = sc.nextInt();
        // // System.out.println("Result: " + (x / y));

        // STYLE VIOLATION: Poor indentation and naming
        for(int i=0;i<5;i++){// // System.out.println("Count:"+i);}

        // RESOURCE LEAK: Scanner and DB connection not closed
    }
}
