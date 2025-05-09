import java.io.*;
import java.sql.*;
import java.util.*;

public class Example {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username:");
        String username = sc.nextLine();
        System.out.println("Enter your password:");
        String password = sc.nextLine();

        // SECURITY ISSUE: SQL Injection vulnerability
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
        Statement stmt = conn.createStatement();
        String query = "SELECT * FROM users WHERE username = '" + username + "' AND password = '" + password + "'";
        ResultSet rs = stmt.executeQuery(query);

        if(rs.next())
        System.out.println("Login successful!"); // STYLE VIOLATION: No braces for if statement

        // CODE QUALITY ISSUE: Hardcoded credentials and poor variable naming
        String a = "admin"; String b = "admin123"; 

        // LOGICAL BUG: unused condition
        if(a == "admin") {
            int unusedVar = 100; // Unused variable
        }

        // SECURITY FLAW: printing sensitive input
        System.out.println("You entered password: " + password);

        // CODE QUALITY + LOGIC ISSUE: Redundant condition and unused method
        if(true || false || false) {
            doNothing(); // useless method
        }

        // POTENTIAL BUG: Division by zero not handled
        int x = 10;
        int y = sc.nextInt(); // no prompt
        System.out.println("Result: " + (x / y)); // no check for y == 0

        // STYLE VIOLATION: Bad indentation, inconsistent spacing
        for(int i=0;i<5;i++){System.out.println("Count:"+i);}

        // LOGICAL ERROR: Infinite loop due to missing condition update
        int j = 0;
        while(j < 5) {
            System.out.println("Infinite?");
            // j++; // forgot to increment
        }

        // RESOURCE LEAK: Scanner and DB connection not closed
    }

    // Unused method
    static void doNothing(){
        int x = 5;
    }
}
