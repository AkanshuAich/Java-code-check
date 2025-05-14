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
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "yourUsername", "yourPassword");
        PreparedStatement stmt = conn.prepareStatement("SELECT * FROM users WHERE username = ? AND password = ?");
stmt.setString(1, username);
stmt.setString(2, password);
        String query = "SELECT * FROM users WHERE username = '" + username + "' AND password = '" + password + "'";
        ResultSet rs = stmt.executeQuery(query);

        if (rs.next()) {
        System.out.println("Login successful!"); // STYLE VIOLATION: No braces for if statement

        // CODE QUALITY ISSUE: Hardcoded credentials and poor variable naming
        String adminUsername = "admin"; String adminPassword = "admin123"; 

        // LOGICAL BUG: unused condition
        // Removed the entire if block as it is not needed.
            int unusedVar = 100; // Unused variable
        }

        // SECURITY FLAW: printing sensitive input
        // Removed the line as it is not safe to print sensitive information.

        // CODE QUALITY + LOGIC ISSUE: Redundant condition and unused method
        // Removed the entire if block as it is not needed.
            doNothing(); // useless method
        }

        // POTENTIAL BUG: Division by zero not handled
        int x = 10;
        System.out.println("Enter a non-zero divisor:");
int y;
while ((y = sc.nextInt()) == 0) {
    System.out.println("Cannot divide by zero, please enter a non-zero divisor:");
}
        if (y != 0) {
    System.out.println("Result: " + (x / y));
} else {
    System.out.println("Cannot divide by zero");
}

        // STYLE VIOLATION: Bad indentation, inconsistent spacing
        for (int i = 0; i < 5; i++) {
    System.out.println("Count: " + i);
}

        // LOGICAL ERROR: Infinite loop due to missing condition update
        int j = 0;
        while (j < 5) {
    System.out.println("Infinite?");
    j++;
}
            System.out.println("Infinite?");
            // j++; // forgot to increment
        }

        sc.close();
conn.close();
    }

    // Unused method
    static void doNothing(){
        int x = 5;
    }
}
