/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filesystem;

import java.io.File;
import java.io.FileOutputStream;

/**
 *
 * @author Sahil
 */
public class FileSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        File f = new File("c:/Users/Sahil/Desktop/hello.txt");
        if(!f.exists())
        {
            f.createNewFile();
        }
        FileOutputStream fos = new FileOutputStream(f);
        String s = "File Hello World";
        byte[] b = s.getBytes();
        fos.write(b);
        fos.flush();
        fos.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
