/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9q4;
import java.util.Random;
public class DiceGame1 extends DiceGame{


     private int  totalScore1;
     private int  totalScore2;
     public DiceGame1(){
         totalScore1=0;
         totalScore2=0;
     }
     public void rollDice(){
         Random rand=new Random();
         int dice1,dice2=0;
         while(totalScore1<100 && totalScore2<100){
             dice1=rand.nextInt(6)+1;
             dice2=rand.nextInt(6)+1;
             totalScore1+=dice1+dice2;
             while(dice1==dice2){
                 dice1=rand.nextInt(6)+1;
                 dice2=rand.nextInt(6)+1;
                 totalScore1+=dice1+dice2;
             }
             dice1=rand.nextInt(6)+1;
             dice2=rand.nextInt(6)+1;
             totalScore2+=dice1+dice2;
             while(dice1==dice2){
                 dice1=rand.nextInt(6)+1;
                 dice2=rand.nextInt(6)+1;
                 totalScore2+=dice1+dice2;
             }
         }
         if (totalScore1>=100){
             announce1();
         }else{
             announce2();
         }
     }
    public static void main(String[] args) {
     
    }
    
}
