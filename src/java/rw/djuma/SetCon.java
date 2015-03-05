/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.djuma;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author SULAIMAN
 */
public class SetCon {
    private static String db="jdbc:mysql://localhost/rebero";
    private static String user="root";
    private static String password="flyman";
    
    
    public static Connection getCon(){
    Connection p=null;
        try{
    Class.forName("com.mysql.jdbc.Driver");
    p=DriverManager.getConnection(db,user,password);
    }catch(Exception e){
    e.printStackTrace();
    }
        return p;
    }
}
