/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9q2;
import java.io.*;
import java.util.Scanner;

public class Student extends PersonProfile{
    private String filename;
    private String[] coursename;
    private String[] coursecode;
    private int[] semester;
    private int[] session;
    private int[] mark;
    
    public Student(String name,String gender,String dateofbirth,String filename){
    super(name,gender,dateofbirth);
    this.filename=filename;
    try{
       Scanner inputStream=new Scanner(new FileInputStream(filename));
       int count=0;
       while(inputStream.hasNextLine()){
           inputStream.nextLine();  //to go thru each line;
           count++;
       }
       coursename=new String[count/5];
       coursecode=new String[count/5];
        semester=new int[count/5];
         session=new int[count/5];
         mark=new int[count/5];
       inputStream.close();
    }catch(FileNotFoundException e){
        System.out.println("File Not Found");
    }
    try{
         Scanner inputStream=new Scanner(new FileInputStream(filename));
         for (int i = 0; inputStream.hasNextLine(); i++) {
                coursecode[i] = inputStream.nextLine(); //go thru the first line
                coursename[i] = inputStream.nextLine(); //if again means go thru the next line
                semester[i] = inputStream.nextInt();
                session[i] = inputStream.nextInt();
                mark[i] = inputStream.nextInt();
                if (inputStream.hasNextLine()) 
                    inputStream.nextLine();
            }
            inputStream.close();


    }catch(FileNotFoundException e){
        System.out.println("File Not Found");
    }
    }
   public String getGrade(int mark) {   
        if (mark >= 85) return "A";     //return will stop the execution of this method
        if (mark >= 75) return "A-";
        if (mark >= 70) return "B+";
        if (mark >= 65) return "B";
        if (mark >= 60) return "B-";
        if (mark >= 55) return "C+";
        if (mark >= 50) return "C";
        if (mark >= 45) return "D";
        if (mark >= 35) return "E";
        return "F";
    }
   @Override
   public String toString(){
       String s = super.toString() + "\n";      //call 
        for (int i = 0; i < coursecode.length; i++) {
            s += "\nCourse name: " + coursename[i] +    //store it all into a string varialbe
                    "\nCourse code: " + coursecode[i] +
                    "\nSemester: " + semester[i] +
                    "\nMark: " + mark[i] +
                    "\nGrade: " + getGrade(mark[i]) + "\n";
        }
        return s.substring(0, s.length() - 1); // remove the last newline character
    }

   

    public static void main(String[] args) {
        
    }
}
