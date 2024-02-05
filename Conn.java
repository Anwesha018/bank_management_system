package bank.management.system;

import java.sql.*;

public class Conn {

    Connection C;
    Statement S;

    public Conn(){

        try {
    
            C= DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "withloveanwesha@1234");
            S= C.createStatement();
            

            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
