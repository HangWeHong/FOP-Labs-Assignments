/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg7;

/**
 *
 * @author natsu
 */import java.util.Scanner; 
import java.net.URL;
import java.io.InputStream; 
import java.net.URLConnection;
import java.io.*;
public class Lab7Q2 {
    public static void main(String[] args) {
        try { URL u = new URL("https://fsktm.um.edu.my");
        URLConnection cnn = u.openConnection(); 
        InputStream stream = cnn.getInputStream(); 
        Scanner in = new Scanner(stream); 
        FileWriter writer=new FileWriter("index.htm");  // FileWriter for writing text files
        
        while(in.hasNextLine()){    //we dont know how long the stream is so we should use this condition.
            writer.write(in.nextLine());    //use scanner that read.nextline to write
        }
        in.close();
        writer.close();
        } catch (IOException e) 
        { System.out.println("IO Error:" + e.getMessage()); } 
    }
}
