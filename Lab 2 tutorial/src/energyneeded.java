
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author natsu
 */
public class energyneeded {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in );
        float Q;
        float M;
        float FTC;
        float ITC;
        System.out.print("Enter the amount of water in gram: ");
        int M_in_gram= keyboard.nextInt();
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        float IT= keyboard.nextFloat();
        System.out.print("Enter the final temperature in Fahrenheit: ");
        float FT= keyboard.nextFloat();
        M=M_in_gram/1000;
        FTC =  (float) ((FT - 32)/1.8);
        ITC =  (float) ((IT - 32)/1.8);
        Q= M *(FTC-ITC)*4184;
        System.out.printf("The engery needed is: %1.6e", Q);

        
    }
}
