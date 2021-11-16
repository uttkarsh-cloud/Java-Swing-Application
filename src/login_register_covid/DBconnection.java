/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login_register_covid;
import java.sql.*;

/**
 *
 * @author asus
 */
public class DBconnection {
    
    static final String DB_URL="jdbc:mysql://localhost/coviddetails";
    static final String USER="root";
    static final String PASS="";
    public static Connection connectDb(){
            Connection conn =null;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn =DriverManager.getConnection(DB_URL,USER,PASS);
            return conn;
        }
        catch(Exception e){
            System.out.println("login_register_covid.DBconnection.connectDb()errors");
            return null;
            
        }
    }
    
}
