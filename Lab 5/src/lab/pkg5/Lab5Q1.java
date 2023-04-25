/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.pkg5;

/**
 *
 * @author natsu
 */
import java.util.Random;
import java.util.Scanner;
public class Lab5Q1 {

    
    public static void main(String[] args) {
            Random random= new Random();
            Scanner input=new Scanner(System.in);
            int max=100;
            int min=0;
            System.out.print("Enter the number of students: ");
            int n=input.nextInt();
            int[] StudScore= new int[n];
            int highest=-999;
            int lowest=999;
            int sum=0;
            for (int counter=0;counter<=n-1;counter++ ){
                int score= random.nextInt(max+1-min)+min;
                StudScore[counter]=score;
                if (StudScore[counter]>highest){
                    highest=StudScore[counter];
                }
                if (StudScore[counter]<lowest){
                    lowest=StudScore[counter];
                }
                sum+=StudScore[counter];
               if (counter<n-1){
                    System.out.print(StudScore[counter]+",");
               }
               
            }
            int average=(sum/n);
            System.out.print(StudScore[n-1]+"\n");
            System.out.println("The highest score is :"+highest);
            System.out.println("The lowest score is :"+lowest);
            System.out.println("The average score is :"+average);
          }
    
}
