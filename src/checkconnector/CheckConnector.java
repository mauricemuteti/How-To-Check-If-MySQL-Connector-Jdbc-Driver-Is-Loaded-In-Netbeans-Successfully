/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkconnector;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Authentic
 */
public class CheckConnector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded successfully");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver not Loaded successfully");
            System.out.println(ex.getMessage());
        }
    }
    
}
