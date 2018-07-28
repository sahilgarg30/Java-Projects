/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sahil
 */
public class ExceptionHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a =10;
        int b = 0;
        int d = 5;
        try{
            if(d==5){
                ArithmeticException ae = new ArithmeticException();
                throw ae;
            }
            b = a/0;
        }catch(Exception e){
            e.printStackTrace();
        }
        
        System.out.println(b);
        
        try {
            FileInputStream f = new FileInputStream("f:/hello.txt");
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(ExceptionHandling.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("File not found!");
            ex.printStackTrace();
        }
        
        Bike b1 = new Bike();
        try {
            b1.moving();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ExceptionHandling.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ArithmeticException ex) {
            Logger.getLogger(ExceptionHandling.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ArrayIndexOutOfBoundsException ex) {
            Logger.getLogger(ExceptionHandling.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
