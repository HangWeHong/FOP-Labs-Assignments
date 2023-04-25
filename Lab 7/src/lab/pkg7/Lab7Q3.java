/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg7;

/**
 *
 * @author natsu
 */
import java.io.*;
import java.util.Scanner;
public class Lab7Q3 {
    public static void main(String[] args) {
        try{
            PrintWriter writer= new PrintWriter(new FileOutputStream ("Reverse.txt"));
            Scanner input=new Scanner(new FileInputStream("Q3.txt"));
            while(input.hasNextLine()){
            String reverse="";
            String text=input.nextLine();
            
            for(int i=text.length()-1;i>=0;i--){    //length method can be used on string and follow by ()
               reverse+=text.charAt(i);
            }
            writer.println(reverse);
            }
            writer.close();
            input.close();
        }catch(FileNotFoundException e){
            System.out.println("File Not Found");
        }catch(IOException e){
            System.out.println("Error occured");
        }
        
    }
}
