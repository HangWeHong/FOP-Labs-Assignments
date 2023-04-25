/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg5;

/**
 *
 * @author natsu
 */
import java.util.Scanner;
public class Lab5Q6 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        int n = input.nextInt();

        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            matrix[i][0] = 1;//pascal triangle all first column will be 1
            for (int j = 1; j <= i; j++)    // pascal triangle will plus previour row (previous and current position) and for the second for loop is j<i so that the array will not be out of bound. 
                matrix[i][j] = matrix[i - 1][j - 1] + matrix[i - 1][j];
        }

        System.out.printf("The Pascal Triangle with %d row(s)\n", n);
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++){
                System.out.print(matrix[i][j] + " ");
            
            }
            System.out.println();
        }

    }
    
}
