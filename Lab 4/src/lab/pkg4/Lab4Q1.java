/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.pkg4;

/**
 *
 * @author natsu
 */
import java.util.Scanner;
public class Lab4Q1 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int num=input.nextInt();
        System.out.print("The factors are :");
        for(int factors=1;factors<num;factors++){   //or factors<=num/2 cuz there is no number can be a factor after half of the number
            
            if(num%factors==0){
                System.out.print(factors+",");
            }
            
         
        }
        System.out.print(num);
        
    }
    //can also store everything in a string and use substring(1,factors.
}
