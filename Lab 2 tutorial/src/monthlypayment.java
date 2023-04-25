
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author natsu
 */
public class monthlypayment {
    
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in );
        float M;
        System.out.println("What is the price of the car : ");
        float P= keyboard.nextFloat();
        System.out.println("What is the down payment: ");
        float D= keyboard.nextFloat();
        System.out.println("What is the interest rate in % : ");
        float R= keyboard.nextFloat();
        System.out.println("What is the loan duration in year : ");
        float Y= keyboard.nextFloat();
        M =(P-D)*(1+R*Y/100)/(Y*12);
        System.out.println("The monthly payment is RM " + df.format(M));
    }
}

