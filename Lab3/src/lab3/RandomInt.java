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
public class RandomInt {
    public static void main(String[] args) {
        Random random = new Random();
        int max = 5;
        int min = 0;
        int result = random.nextInt(max+ 1 - min) + min;
        switch(result){
            case 0->System.out.println(result + " is zero.");
            case 1-> System.out.println(result + " is one.");
            case 2->System.out.println(result + " is two.");
            case 3->System.out.println(result + " is three.");
            case 4-> System.out.println(result + " is four.");
            case 5-> System.out.println(result + " is five.");
               
        }
    }
}
