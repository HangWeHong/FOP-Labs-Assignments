/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8q5;
 
import java.util.Random;
public class Game {
private String name;
  public Game(String name){
      this.name=name;
  }
  public int rollDice(){
      Random rand=new Random();
      return rand.nextInt(6)+1;
  }
    public static void main(String[] args) {
        
    }
    
}
