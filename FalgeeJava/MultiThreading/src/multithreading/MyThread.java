/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sahil
 */
public class MyThread implements Runnable {

    @Override
    public void run() {
       // super.run(); //To change body of generated methods, choose Tools | Templates.
        for(int i=0;i<10;i++){
            System.out.println("child "+ i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
    }
}
