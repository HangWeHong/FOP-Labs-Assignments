/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9q4;
import java.util.Random;

public class DiceGame2 extends DiceGame {
    private int TotalScore1;
    private int TotalScore2;
    public DiceGame2(){
        TotalScore1=0;
        TotalScore2=0;
    }
    public void rollDice(){
        Random rand=new Random();
        int dice1=0;
        while(TotalScore1!=100 && TotalScore2!=100){
            dice1=rand.nextInt(6)+1;
            int tempscore1=0;
            tempscore1+=dice1;
            if(dice1==6){
              dice1=rand.nextInt(6)+1;
               tempscore1+=dice1;
            }
             if(dice1!=6 && TotalScore1<100){
                TotalScore1+=tempscore1;
            }
            dice1=rand.nextInt(6)+1;
            int tempscore2=0;
            tempscore2+=dice1;
            if(dice1==6){
              dice1=rand.nextInt(6)+1;
               tempscore2+=dice1;
            }
             if(dice1!=6 && TotalScore2<100){
                TotalScore2+=tempscore2;
            }
        }
        if (TotalScore1==100){
            announce1();
        }else if (TotalScore2==100){
            announce2();
        }
        
      }
    public static void main(String[] args) {
        
    }
}
