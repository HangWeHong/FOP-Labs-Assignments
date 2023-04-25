/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problem.solving.pkg2;

/**
 *
 * @author natsu
 */
import java.util.Scanner;
public class factorNumber {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        boolean correct;
        int totalcorrect=0;
        int totalquestion=0;
        System.out.print("Enter a number (-1 to quit) : ");
        int num =input.nextInt();
        System.out.print("Enter a factor : ");
        int factor =input.nextInt();
       while(num != -1){
        if (num % factor==0){
            correct=true;
            totalcorrect=totalcorrect+1;
            totalquestion=totalquestion+1;
        }else{
            correct=false;
            totalquestion=totalquestion+1;
        }
           System.out.println(factor + " is a factor of "+num+"?  (true/false) : "+correct);
        if (correct=true){
            System.out.println("Your answer is correct.");
        }else{
            System.out.println("Your answer is incorrect.");
        }
        System.out.print("Enter a number (-1 to quit) : ");
        num =input.nextInt();
        if (num !=-1){
            System.out.print("Enter a factor : ");
        factor =input.nextInt();
       }
        }
        
        System.out.println("The final score is "+totalcorrect+"/"+totalquestion);
    }
}
