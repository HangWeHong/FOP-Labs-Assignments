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
public class Lab4Q8 {
    public static void main(String[] args) {
        Random random=new Random();
        int max=100;
        int min=0;
        int num=random.nextInt(max+1-min)-min;
        System.out.println(num);
        System.out.print("The prime numbers :");
        int count=2;
       
        for (int n=0;n!=num;){
           if (count%2!=0 && count%3!=0){ //condition for prime numbers
               if(n==num-1){
                   System.out.print(count);
                   n+=1;
               }else{
                   System.out.print(count+",");
                   n+=1;
               }
               
           }else if (count==2 || count==3){     //prime numbers first include two
               System.out.print(count+",");
               n+=1;
           }
            count+=1;
           
            }
                    
        }
        
                 
    
}
