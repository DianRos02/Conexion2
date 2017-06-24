/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
public class conexion {
   Connection conectar=null;
   

   
   public conexion() throws Exception {
       try{
           Class.forName("com.mysql.jdbc.Driver");
          Connection conectar= DriverManager.getConnection("jdbc:mysql://localhost:3306/inventarios","root","5210");
           Statement st= conectar.createStatement();
           ResultSet rs= st.executeQuery("SELECT * FROM productos");
           
           while(rs.next()){
           System.out.println(rs.getString("idProductos"));
            System.out.println(rs.getString("DescripcionProducto"));
           }
       }catch(ClassNotFoundException exc){
           exc.printStackTrace();
       
           
       
       
       }
       catch(Exception e){
           System.out.println(e.getMessage());
  
   }
   
   }
}
