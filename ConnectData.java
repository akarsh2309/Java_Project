/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbms_app;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Akarsh
 */
public class ConnectData {
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public static Connection MyData()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbms","root","");
            JOptionPane.showMessageDialog(null, "Connected to the Database");
            return con;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
    }
}
