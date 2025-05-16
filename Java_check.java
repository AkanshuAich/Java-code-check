package com.example;

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
        try (Statement stmt = conn.createStatement()) {
    // ... rest of the code that uses stmt
}
        String query = "SELECT * FROM users WHERE username = '" + username + "' AND password = '" + password + "'";
        try (ResultSet rs = pstmt.executeQuery()) {
    // ... rest of the code that uses rs
}

        if(rs.next())
        // // System.out.println("Login successful!"); // STYLE VIOLATION: No braces for if statement

        // CODE QUALITY ISSUE: Hardcoded credentials and poor variable naming
        String adminUsername = "admin"; String adminPassword = "admin123"; 

        // LOGICAL BUG: unused condition
        if(a == "admin") {
            int unusedVar = 100; // Unused variable
        }

        // SECURITY FLAW: printing sensitive input
        // // System.out.println("You entered password: " + password);

        // CODE QUALITY + LOGIC ISSUE: Redundant condition and unused method
        if(true || false || false) {
            doNothing(); // useless method
        }

        // POTENTIAL BUG: Division by zero not handled
        int dividend = 10;
        System.out.println("Enter a divisor:");
int divisor = sc.nextInt(); // no prompt
        // // if (divisor != 0) {
    System.out.println("Result: " + (dividend / divisor));
} else {
    System.out.println("Cannot divide by zero.");
}

        // STYLE VIOLATION: Bad indentation, inconsistent spacing
        for(int i=0;i<5;i++){// // System.out.println("Count:"+i);}

        // LOGICAL ERROR: Infinite loop due to missing condition update
        int loopCounter = 0;
        while(j < 5) {
            // // System.out.println("Infinite?");
            // j++; // forgot to increment
        }

        // RESOURCE LEAK: Scanner and DB connection not closed
    }

    // Unused method
    static void doNothing(){
        int unusedVariable = 5;
    }
}
