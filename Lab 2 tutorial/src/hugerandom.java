
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author natsu
 */
public class hugerandom {
    public static void main(String[] args) {
        Random random = new Random();
        int max = 10000;
        int min = 0;
        int digit;
        int sum;
        
        int num = random.nextInt(max+ 1 - min) + min;
         
          System.out.println( "The number is "+num );
          sum=0;
          
        while(num>0){
            digit=num %10;
            sum=sum + digit;
            num=num/10  ;   
            
        }
        System.out.println("The sum of all the digits in the number is : "+ sum);
        
    }
}
