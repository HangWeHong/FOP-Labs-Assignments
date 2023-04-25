/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8q6;

/**
 *
 * @author natsu
 */
public class Tester {
    public static void main(String[] args) {
        BurgerStalls stall1=new BurgerStalls("145",0);
        BurgerStalls stall2=new BurgerStalls("146",0);
        stall1.burgerSold(100);
         stall1.burgerSold(500);
        stall2.burgerSold(200);
        stall1.display();
        stall2.display();
    }
}
