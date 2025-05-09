import java.io.*;
import java.sql.*;
import java.util.*;

public class Example {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username:");
        String username = sc.nextLine();
        System.out.println("Enter your one liner password:");
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

        // POTENTIAL BUG: Division by zero not handled
        int x = 10;
        int y = sc.nextInt();
        System.out.println("Result: " + (x / y));

        // STYLE VIOLATION: Poor indentation and naming
        for(int i=0;i<5;i++){System.out.println("Count:"+i);}

        // RESOURCE LEAK: Scanner and DB connection not closed
    }
}
