/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg6;

/**
 *
 * @author natsu
 */
import java.util.Scanner;
import java.util.Random;
public class Lab6Q5 {
    
    static int check(int rand1,int rand2,int ans){
      
        if (rand1*rand2==ans){
            return 1;
        }else{
            return 0;
        }
        
    }
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    Random rand= new Random();
    int rand1=rand.nextInt(12);
    int rand2=rand.nextInt(12);
    int ans=0;
    int result=0;
        do{
        System.out.println("Enter negative number to quit.");
            System.out.print(rand1 + " x "+ rand2 +" = ");
            ans=input.nextInt();
            result+=check(rand1,rand2,ans);
             rand1=rand.nextInt(13);
        rand2=rand.nextInt(13);
        }while(ans>=0);
        
        System.out.println("Your Score is "+ result);
    }
}
