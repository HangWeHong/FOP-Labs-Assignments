/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg7;

import java.io.*;
import java.util.Scanner;

public class Lab7Q4 {
    public static void main(String[] args) {
       
        try{
            Scanner reader=new Scanner(new FileInputStream("Q3.txt"));
            int noWords=0;
            int noLine=0;
            int noChar=0;
            char blank=' ';
            while(reader.hasNextLine()){
                String words=reader.nextLine();
                noWords+=words.split(" ").length;    //whole string before " " count as one
                noChar+=words.length();
                noLine++;
            }
            System.out.println("Number of words :"+noWords);
            System.out.println("Number of characters :"+noChar);
            System.out.println("Number of Line :"+noLine);
            reader.close();
        }catch(FileNotFoundException e){
            System.out.println("File Not Found");
        }
           
    }
}
