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
public class Lab4Q4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year =input.nextInt();
        System.out.print("Enter the first day of the year [0-6] :");
        int numofdays=input.nextInt();
        
            if (numofdays<0 && numofdays>6){
                System.out.println("Please input the correct day!");
            }
        int January=31-1;
        for (int i=1;i<=January;i++){
            if (numofdays<6){
                numofdays+=1;
            }else{
                numofdays=0;
            }
        }
        int February=0;
        if (year%400==0 || year%4==0 && year %100 !=0){ //check leap year 
            February=29;
        }else {
           February=28;
        }
        for (int i=1;i<=February;i++){
            if (numofdays<6){
                numofdays+=1;
            }else{
                numofdays=0;
            }
        }
        int March=31;
        for (int i=1;i<=March;i++){
            if (numofdays<6){
                numofdays+=1;
            }else{
                numofdays=0;
            }
        }
        int April=30;
        for (int i=1;i<=April;i++){
            if (numofdays<6){
                numofdays+=1;
            }else{
                numofdays=0;
            }
        }
        int May=31;
        for (int i=1;i<=May;i++){
            if (numofdays<6){
                numofdays+=1;
            }else{
                numofdays=0;
            }
            String day="";
        switch (numofdays){
            case 0:
                day="Sunday";
                break;
            case 1:
                day="Monday";
                break;
            case 2:
                day="Tuesday";
                break;
            case 3:
                day="Wednesday";
                break;
            case 4:
                day="Thursday";
                break;
            case 5:
                day="Friday";
                break;
            case 6:
                day="Saturday";
                break;
               
            
        }
         System.out.println(i+"th May "+ day);
    }
        int June=30;
        for (int i=1;i<=June;i++){
            if (numofdays<6){
                numofdays+=1;
            }else{
                numofdays=0;
            }
        }
        int July=31;
        for (int i=1;i<=July;i++){
            if (numofdays<6){
                numofdays+=1;
            }else{
                numofdays=0;
            }
        }
        int August=31;
        for (int i=1;i<=August;i++){
            if (numofdays<6){
                numofdays+=1;
            }else{
                numofdays=0;
            }
             String day="";
        switch (numofdays){
            case 0:
                day="Sunday";
                break;
            case 1:
                day="Monday";
                break;
            case 2:
                day="Tuesday";
                break;
            case 3:
                day="Wednesday";
                break;
            case 4:
                day="Thursday";
                break;
            case 5:
                day="Friday";
                break;
            case 6:
                day="Saturday";
                break;
               
            
        }
         System.out.println(i+"th August "+ day);
        }
   }
}
