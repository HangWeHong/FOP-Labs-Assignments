/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9q2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author natsu
 */
public class Lecturer extends PersonProfile{
   
    private String[] coursename;
    private String[] coursecode;
    private int[] semester;
    private int[] session;
    private int[] credithours;
    private int[] numofStudents;
   
    public Lecturer(String name,String gender,String dateofbirth){
        super(name,gender,dateofbirth);
    try{
    Scanner inputStream=new Scanner(new FileInputStream("lecturer.txt"));
       int count=0;
       while(inputStream.hasNextLine()){
           inputStream.nextLine();  //to go thru each line;
           count++;
       }
       coursename=new String[count/6];
       coursecode=new String[count/6];
        semester=new int[count/6];
         session=new int[count/6];
         credithours=new int[count/6];
         numofStudents=new int[count/6];
       inputStream.close();
     }catch(FileNotFoundException e){
        System.out.println("File Not Found");
    }
    

    try{
         Scanner inputStream=new Scanner(new FileInputStream("lecturer.txt"));
         for (int i = 0; inputStream.hasNextLine(); i++) {
                coursecode[i] = inputStream.nextLine(); //go thru the first line
                coursename[i] = inputStream.nextLine(); //if again means go thru the next line
                semester[i] = inputStream.nextInt();
                session[i] = inputStream.nextInt();
                credithours[i] = inputStream.nextInt();
                numofStudents[i]=inputStream.nextInt();
                if (inputStream.hasNextLine()) 
                    inputStream.nextLine();
            }
            inputStream.close();

            compute();
    }catch(FileNotFoundException e){
        System.out.println("File Not Found");
    }
}

    
        public void compute(){
            for (int i=0;i<numofStudents.length;i++){
                if (numofStudents[i]>=150) credithours[i]*=3;
                if (numofStudents[i]>=100) credithours[i]*=2;
                if (numofStudents[i]>=50) credithours[i]*=1.5;
                credithours[i]*=1;
            }
        }
        @Override
        public String toString(){
            String temp=super.toString();
            for (int i=0;i<numofStudents.length;i++){
                temp+="\nCourse name: " + coursename[i] +    //store it all into a string varialbe
                    "\nCourse code: " + coursecode[i] +
                    "\nSemester: " + semester[i] +
                    "\nCredit Hours: " + credithours[i] +
                    "\nNumber of Students: " + numofStudents[i] + "\n" ;
            }
            return temp.substring(0,temp.length()-1);
        }
        public static void main(String[] args) {
        
    }
}




