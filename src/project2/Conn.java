
package project2;

import java.sql.*;
public class Conn {
Connection c;
Statement s;    
    public Conn(){
     try{
         //To Connect Database 5 Steps
         //Add Driver
     Class.forName("com.mysql.cj.jdbc.Driver");
     // Create Connection
     c=DriverManager.getConnection("jdbc:mysql://localhost:3307/stu_management_system","root","11223344");
     // Make Statement
     s=c.createStatement(0, 0);
     
         
         
     }catch(Exception e){
     e.printStackTrace();
     }
 }   
}
