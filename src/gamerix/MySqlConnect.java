/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamerix;

import java.sql.*;
import javax.swing.JOptionPane;

public class MySqlConnect {
     Connection con=null;
  public static Connection ConnectDB(){
  try{
      Class.forName("com.mysql.jdbc.Driver");
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gamerix?autoReconnect=true&useSSL=false","root","admin");
      JOptionPane.showMessageDialog(null,"Connected to database");
      return con;
  }catch(Exception e) {
    JOptionPane.showMessageDialog(null,e);
    return null;
  }
  }
}

