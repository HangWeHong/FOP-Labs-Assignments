/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author natsu
 */
import java.util.Scanner;
public class Converter {
    
    public static void main(String[] args) {
         Scanner keyboard=new Scanner(System.in );
        int hours; 
        int mins;
        int remaining;
        System.out.println("Enter the number of seconds: ");
        int seconds= keyboard.nextInt();
        hours=seconds/60/60;
        mins=(seconds-(hours*60*60))/60;
        remaining =(seconds-(hours*60*60)-(mins*60));
        
       
          System.out.println(seconds+ " seconds is " + hours +" hours," + mins +" minutes and "+ remaining +" seconds");
    }
}
