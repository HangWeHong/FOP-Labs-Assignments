/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg4;

/**
 *
 * @author natsu
 */
import java.util.Scanner;
import java.lang.Math;

public class Lab4Q3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float max=-999;
        float min=999;
        float num=0;
        float sum=0;
        int count=0;
        float sumsqr=0;
        
        do{
        System.out.print("Enter a score [negative score to quit] :");
        num=input.nextFloat();
        if (num>max && num >=0){
            max=num;
        } 
        if (num<min && num>=0){
            min=num;
        }
        if (num>=0){
            sum+=num;
            count+=1;
            sumsqr+=Math.pow(num,2);
        }
        
              
        }
        while(num>=0);    
        float sd=(float) (Math.sqrt(((sumsqr)-(Math.pow(sum,2))/count)/(count-1)));
        float ave=sum/count;
        System.out.println(sumsqr);
        System.out.printf("Minimum Score: %.0f\n",min);
        System.out.printf("Maximum Score: %.0f\n", max);
        System.out.printf("Average Score: %.2f \n", ave);
        System.out.printf("Standard Deviation: %.2f", sd);
       
        }
    
    }
