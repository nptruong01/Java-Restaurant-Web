/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package context;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Pisano
 */
public class DBContext {
    
    public Connection getConnection()throws Exception{
        String url ="jdbc:sqlserver://"+serverName +":"+portNumber + "\\" + instance +" ;databaseName="+dbName;
        if(instance == null || instance.trim().isEmpty())
            url = "jdbc:sqlserver://"+serverName +":"+portNumber +" ;databaseName="+dbName;
        
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, userID, password);
        
    }
     private final String serverName = "localhost";
     private final String dbName = "Wish1";
     private final String portNumber ="1433";
     private final String instance = "";
     private final String userID = "sa";
     private final String password = "123456";
     public static void main(String[] args){
         try{
             System.out.println(new DBContext().getConnection());
         } catch (Exception e){
             
         }
     }
         
    
}
