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
public class Lab5Q4 {
    public static void main(String[] args) {
        int[][] matrix=new int[3][3];
        Random rand=new Random();
        System.out.println("3 by 3 Matrix");
        for (int i =0;i<3;i++){
            for (int j=0;j<matrix[0].length;j++){
                matrix[i][j]=rand.nextInt(9)+1;
            }
        }
       
        for (int i =0;i<3;i++){
            for (int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("After rotates 90 degrees clockwise");
        int[][] newmatrix=new int[3][3];
        for (int i =0;i<3;i++){
            for (int j=0;j<matrix[0].length;j++){
                newmatrix[i][j]=matrix[2-j][i];
            }
        }
        for (int i =0;i<3;i++){
            for (int j=0;j<matrix[0].length;j++){
                System.out.print(newmatrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
