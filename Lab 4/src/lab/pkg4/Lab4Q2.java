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
public class Lab4Q2 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.print("Enter an integer:");
        int n =input.nextInt();
        int sum=0;
        int total=0;
        for (int count=1;count<=n;count++){
            sum+=count;
            total+=sum;
        }
        System.out.println(total);
    }
}
