/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg4;

/**
 *
 * @author natsu
 */
import java.util.Random;

public class Lab4Q5 {
    public static void main(String[] args) {
       Random random=new Random();
       int player1=0;
       int player2=0;
       int max=6;
       int min=1;
       int dice=0;
       while(player1<=100 && player2<=100){
       dice=random.nextInt(max+1-min)+min;
       player1 +=dice;
       while (dice==6){
           dice=random.nextInt(max+1-min)+min;
           player1 +=dice;
       }
       dice=random.nextInt(max+1-min)+min;
       player2 +=dice;
       while (dice==6){
           dice=random.nextInt(max+1-min)+min;
           player2 +=dice;
       }
       
    }
     if (player1>=100){
         System.out.println("Player 1 Won!");
     }  else if(player2>=100){
         System.out.println("Player 2 Won!");
     }
       
    }
    
}
