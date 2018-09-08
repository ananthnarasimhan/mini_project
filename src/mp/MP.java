/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Admin
 */
public class MP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         try {
                String Query="SELECT * FROM senior_citizen WHERE s_id=1003";
                System.out.println("ausfxv");
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("ausfxv");
               // Connection con;
                Connection con;
                con = DriverManager.getConnection("http://127.0.0.1/phpmyadmin/tbl_structure.php?db=mp&table=senior_citizen&token=16b1138357102059861ad136974aafa4", "root", "9422349317");
                System.out.println("ausfxv");
                Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(Query);
        rs.next();
        String sname=rs.getString(2);
        System.out.println("ausfxv");
        con.close();
            } 
            catch (Exception e)
            {   
                String S;
                System.out.println("ausfxv1234");
            }
            
        }
    }
    
