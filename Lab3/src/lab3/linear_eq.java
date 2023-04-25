/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author natsu
 */
import java.util.Scanner;
public class linear_eq {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a :");
        double a =input.nextDouble();
        System.out.print("Enter b :");
        double b =input.nextDouble();
        System.out.print("Enter c :");
        double c =input.nextDouble();
        System.out.print("Enter d :");
        double d =input.nextDouble();
        System.out.print("Enter e :");
        double e =input.nextDouble();
        System.out.print("Enter f :");
        double f =input.nextDouble();
        double x=(e*b-b*f)/(a*d-b*c);
        double y =(a*f-e*c)/(a*d-b*c);
        if((a*d-b*c)==0){
            System.out.println("The equation has no solution");
        }else{
            System.out.println(x);
            System.out.println(y);
        }
    }
}
