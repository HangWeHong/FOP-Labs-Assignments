/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.pkg8;
import java.util.Random;
public class Number{
    private int[] intarray; //global
    
    public Number(){
        this(10);
     }
    public Number(int n){
        this(n,100);
    }
    public Number(int n,int max){
        Random random=new Random();
        intarray=new int[n];    //cannot int[] intarray=new int[n],it will treat it as new variable instead of the attributes for the class.
        for (int i=0;i<n;i++ ){
        intarray[i]=random.nextInt(max+1);
        }
    }
    
    public void displayAll(){
       displayAllNum();
       displayEven();
       displayPrime();
       displayMax();
       displayMin();
       displayAverage();
       displaySquare();
       
}
    public void displayAllNum(){
        System.out.println("All the numbers are:");
    for(int numbers:intarray){
        System.out.print(numbers+" ");
    }
        System.out.println("");   
       
}
    public void displayEven(){
        System.out.println("All the even numbers are :");
     for(int numbers:intarray){
         if (numbers%2==0){
             System.out.print(numbers+" ");
     }
       
}
        System.out.println("");
}
    public void displayPrime(){
        System.out.println("All the prime numbers are: ");
        for(int numbers:intarray){
            if (numbers<2){
                continue;
            }else if (numbers%2!=0 && numbers%3!=0){
                System.out.print(numbers+" ");
            }
        }
        System.out.println("");
    }
    public void displayAverage(){
        System.out.println("The average of the numbers: ");
        int total=0;
        int count=0;
        for(int numbers:intarray){
            total+=numbers;
            count++;
        }
        int avg=total/count;
        System.out.print(avg);
        System.out.println("");
    }
    
    public void displayMax(){
        int max=-1;
        System.out.println("The maximum number :");
        for(int numbers:intarray){
            if (numbers>max){
             max=numbers;
        }
        }
        System.out.print(max);
        System.out.println("");
    }
       public void displayMin(){
        int min=999;
        System.out.println("The minimum number :");
        for(int numbers:intarray){
            if (numbers<min){
             min=numbers;
        }
        }
        System.out.print(min);
        System.out.println("");
    }
       public void displaySquare(){
           System.out.println("The square numbers are :");
           for(int numbers:intarray){
               System.out.print((numbers^2) +" ");
           }
           System.out.println("");
       }
    
    public static void main(String[] args) {
        
    }
    
}
