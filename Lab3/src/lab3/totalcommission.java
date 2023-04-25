/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;
import java.util.Scanner;

/**
 *
 * @author natsu
 */
public class totalcommission {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float totalcom=0;
        System.out.print("What is the Sales Volume : ");
        float salesvol=input.nextFloat();
        System.out.print("What is the Total Sales : RM");
        float totalsal=input.nextFloat();
        switch((salesvol<=100)? 0:(salesvol>100 && 
                salesvol <=500)? 1:(salesvol>500 && 
                salesvol <=1000)? 2: (salesvol>1000)? 3: 4){
            //no need to avoid using switch when it comes to range of numbers,just do the compare in the condition with the form ()? 0: ()?1: ....
            case 0->totalcom=totalsal*(5/100);
            case 1->totalcom=(float) (totalsal*(7.5/100));
            case 2->totalcom=totalsal*(10/100);
            case 3->totalcom=(float) (totalsal*(12.5/100));
            case 4->System.out.println("Invalid Data typed !");
        }
        System.out.printf("The total commision is : RM%.2f", totalcom);
    }
    
}
