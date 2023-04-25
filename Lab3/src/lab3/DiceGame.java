/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author natsu
 */
import java.util.Random;
public class DiceGame {
    public static void main(String[] args) {
        Random random=new Random();
        int[] player1={0,0};
        int[] player2={0,0};
        int sum1=0;
        int sum2=0;
        int max=6;
        int min=1;
        
        for(int n=0;n<2;n++){
            player1[n]=random.nextInt(max+1-min)+min;
            sum1=sum1+player1[n];
            player2[n]=random.nextInt(max+1-min)+min;
            sum2=sum2+player2[n];
            
        }
        if (sum1>sum2){
            System.out.println("Player 1 has won");
        }else{
            System.out.println("Player 2 has won");
        }
    }
}
