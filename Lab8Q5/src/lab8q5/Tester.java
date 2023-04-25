/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8q5;

/**
 *
 * @author natsu
 */
public class Tester {

    public static void main(String[] args) {
        Game player1 = new Game("HWH");
        Game player2 = new Game("Grace");
        int win1 = 0;
        int win2 = 0;
        while (true) {

            win1 += player1.rollDice();
            win2 += player2.rollDice();
             if (win1 >= 100) {
            System.out.println("Player 1 won");
            break;
             } else if (win2>=100){
            System.out.println("Player 2 won");
            break;
            }
        }
       
    }
}
