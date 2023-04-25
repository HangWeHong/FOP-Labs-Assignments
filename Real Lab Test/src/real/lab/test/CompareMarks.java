/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package real.lab.test;

import java.util.Scanner;

/**
 *
 * @author natsu
 */
public class CompareMarks {
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
        String[][] Student =new String[5][3];
       
        
        for(int i=0;i<Student.length;i++){
            for (int j=0;j<Student[i].length;j++){  
                Student[i][j]=input.nextLine();
            }
        }
        
         boolean flag=true;
         while(flag){
         flag=false;
         for(int i=0;i<Student.length-1;i++){
                 if(Student[i][2].compareTo(Student[i+1][2]) > 0){
                    for(int j=0;j<Student[i].length;j++){
                        String[] temp=new String[Student[i].length];
                         temp[j]=Student[i+1][j];
                         Student[i+1][j]=Student[i][j];
                     Student[i][j]=temp[j];
                    }
                    
                     flag=true;
                 }
         }
         }
         for(int i=0;i<Student.length;i++){
            for (int j=0;j<Student[i].length;j++){  
                System.out.printf("%-8s",Student[i][j]);
            }
             System.out.println();
        }
    }
}
