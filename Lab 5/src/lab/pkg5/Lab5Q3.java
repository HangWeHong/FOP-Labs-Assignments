/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg5;

/**
 *
 * @author natsu
 */
import java.util.Random;
import java.util.Scanner;
public class Lab5Q3 {
    public static void main(String[] args) {
        Random random= new Random();
        Scanner input= new Scanner(System.in);
        System.out.print("What is the total number of employee : ");
        int n= input.nextInt();
        int[][] hours=new int[n][7];
        int[] sum=new int[n];
        int total=0;
        for (int i=0;i<n;i++){
           total=0;
           for (int j=0;j<7;j++){
               hours[i][j]=random.nextInt(7)+1;
               total+=hours[i][j];
           }
           sum[i]+=total;
        }
        for (int k=0;k<n;k++){
            System.out.print("The work hours in seven days :");
            for (int l=0;l<7;l++){
                
                if (l==6){
                    System.out.print(hours[k][l]+"\n");
                    System.out.println("The total work hours in seven days:"+sum[k]);
                    System.out.println("\n");
                    
                }else{
                    System.out.print(hours[k][l]+",");
                }
            }
        }
    }
}
