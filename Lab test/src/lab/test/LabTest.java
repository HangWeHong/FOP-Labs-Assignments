/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.test;

/**
 *
 * @author natsu
 */
import java.util.Scanner;

public class LabTest {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String[][] Student =new String[5][3];
        float FOP []=new float[5];
        for(int i=0;i<5;i++){
            for (int j=0;j<3;j++){  
                Student[i][j]=input.next();
            }
        }
         for(int i=0;i<5;i++){
            
                 FOP[i]=Float.parseFloat(Student[i][2]);    //pass string to float.
                 System.out.println(FOP[i]);
         }
         String fd;
         fd=String.valueOf(FOP[2]); //pass float to string
         System.out.println(fd);
         for(int i=0;i<5;i++){
            for (int j=0;j<3;j++){  
                System.out.print(Student[i][j]);
            }
             System.out.println();
        }
    }
       String first="s12345";
         String second="s12235";
        int corr;
         corr=first.compareTo(second);  // if first>second return 1
                                        //if first <second return-1
      if (first.compareTo(second)<0)
            System.out.println("hi");
      else  
            System.out.println("bye");

    
}
