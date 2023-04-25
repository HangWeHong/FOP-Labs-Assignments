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
public class Lab4Q6 {
    public static void main(String[] args) {
        Random random=new Random();
        int number=0;
        
        number=Math.abs(random.nextInt());
               //to make the random integer always positive use Math.abs().
        int count=0;
        System.out.println(number);
        while (number >0){
            number=number/10;
            count +=1;
        }
        System.out.println("The number of digits :"+count);
    }
    
}
