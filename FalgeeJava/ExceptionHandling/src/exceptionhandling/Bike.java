/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 *
 * @author Sahil
 */
public class Bike {
    int price;
    
    public void moving() throws FileNotFoundException,ArithmeticException,ArrayIndexOutOfBoundsException{
        FileInputStream fis = new FileInputStream("e:/hello.txt");
        int a =5;
        int b =a/0;
        int ba[]= new int[4];
        ba[4] = 6;
    }
}
