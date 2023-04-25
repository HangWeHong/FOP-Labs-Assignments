package lab.pkg7;

import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.File;
import java.util.Scanner;
public class Lab7Q1 {
    

    
    public static void main(String[] args) {
        
    try {
      ObjectOutputStream Writer = new ObjectOutputStream(new FileOutputStream("course.dat"));
      String course[][]={
              {"WXES1116","Programming I"}, //Assign value into 2d array for one row have to pu an extra{},inside 1 row "," means next column, another "," means next row
              {"WXES1115","Data Structure"} ,
              {"WXES1110", "Operating System"},              
              {"WXES1112 "," Computing Mathematics I"}
              };
      for (String[] courses:course){        //for each column 
         for (String courseinfo:courses){
             Writer.writeUTF(courseinfo);
         }        
      }
      Writer.close();
    } catch (IOException e) {
      System.out.println("Error when writing to the file");
    }
    try{
        ObjectInputStream Reader=new ObjectInputStream(new FileInputStream("course.dat")); //or can put file path better.
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a course code: ");
        String code=input.next();
        
       while(true){
           String coursecode=Reader.readUTF();
        String coursename=Reader.readUTF();
        if (code.equals(coursecode)){
            System.out.println(coursename);
            break;
        }
       }
        Reader.close();       
    
    }catch(FileNotFoundException e){
        System.out.println("File was not found");
    }catch(IOException e){
        System.out.println("Error when reading the file");
    }
    }
}
