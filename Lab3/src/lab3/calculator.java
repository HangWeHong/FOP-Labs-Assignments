/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3;

/**
 *
 * @author natsu
 */
import java.util.Scanner;
public class calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in );
        String[] numbers; //to make the input in the same line,build a String array
        int num1;
        int num2;
        System.out.print("Enter two integer number : ");
        /*numbers =input.nextLine().split(" ");//input the array and giving the index only after the spacebar " "
        num1=Integer.parseInt(numbers[0]);//convert the input into the String array into integer
        num2=Integer.parseInt(numbers[1]);
        */
        num1=input.nextInt();   //no need so mafan split just type 2 input and space between java will automatically assign the right variables
        num2=input.nextInt();
        System.out.print("Enter the operand : ");
        String operand=input.next();// read char   or char operand=input.next().charAt(0);
        char oper= operand.charAt(0);
        System.out.println("");
        int ans ;
        ans=0;
        switch (oper){
            case '+':
                ans=num1+num2;
                break;
            case '-':
                ans=Math.abs(num1-num2); //changing the negative to positive number
                break;
            case '*':
                ans=num1*num2;
                break;
            case'/':
                ans=num1/num2;
                break;
            case '%':
                ans=num1 % num2;
                break;
            default:
                System.out.println("Invalid operand typed!");
        }
        System.out.println(num1 +" " +oper+ " " + num2+ " "+ '=' + " " + ans);
                
        
       
             
    }
    
}
