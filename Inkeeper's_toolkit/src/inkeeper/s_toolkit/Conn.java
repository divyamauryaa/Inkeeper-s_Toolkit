package inkeeper.s_toolkit;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    Conn() {
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");  
        c = DriverManager.getConnection("jdbc:mysql://localhost:3306/inkeepers_toolkit","root" , "Divya@maurya123");
        s = c.createStatement();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
