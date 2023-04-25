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
public class Lab4Q7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double Principal=input.nextDouble();
        System.out.print("Enter interest in %: ");
        double interest=input.nextDouble();
        System.out.print("Enter the total number of month(s): ");
        int month =input.nextInt();
      
        System.out.printf("%-12s %-20s %-14s %-14s %-20s %-20s\n","Month","Monthly Payment","Principal","Interest","Unpaid Balance","Total Interest");
        double monthpay=0;
        double totalint=0;
        for (int i=1;i<=month;i++){
           monthpay=((Principal*(interest/(12*100)))/(1-Math.pow((1+(interest)/(12*100)),-month)));
            double p_month=(monthpay*Math.pow((1+interest/(12*100)),-(1+month-i)));
            double i_month=monthpay-p_month;
            double remaining=(i_month/(interest/(12*100)))-p_month;
            totalint+=i_month;
            System.out.printf("%-2d %25.2f %14.2f %13.2f %20.2f %20.2f\n",i,monthpay,p_month,i_month,remaining,totalint);
            
        }
    }
}
