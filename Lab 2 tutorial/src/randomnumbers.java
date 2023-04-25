
import java.text.DecimalFormat;
import java.util.Random;

    
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author natsu
 */

public class randomnumbers {
     private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        Random random = new Random();
        int max = 50;
        int min = 10;
        int sum;
        float average;
        int result1 = random.nextInt(max+ 1 - min) + min;
         int result2 = random.nextInt(max+ 1 - min) + min;
          int result3 = random.nextInt(max+ 1 - min) + min;
          System.out.println( "The three numbers are "+result1 +" , " + result2 +" , " + result3);
        sum=result1+result2+result3;
        System.out.println("The sum is "+sum);
        average=sum/3;
        System.out.println("The average is "+df.format(average));
        
    }
}
