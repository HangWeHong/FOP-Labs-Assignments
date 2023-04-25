/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg5;

/**
 *
 * @author natsu
 */
import java.util.Random;
import java.util.Scanner;
public class Lab5Q5 {
    public static void main(String[] args) {
        Random rand=new Random();
        Scanner input=new Scanner(System.in);
        int[] integers=new int[20];
        for(int i =0;i<20;i++){
            integers[i]=rand.nextInt(101);
           
        }
        System.out.println("A list of 20 random integer within 0 to 100");
        for(int i =0;i<20;i++){
            if (i==19){
                System.out.print(integers[i]+"\n");
            }else{
                 System.out.print(integers[i]+",");
            }
        }
        for(int pass=0;pass<integers.length;pass++){
            for(int i=0;i<integers.length-1;i++){
               if (integers[i]<integers[i+1]){
                   int temp=integers[i+1];
                   integers[i+1]=integers[i];
                   integers[i]=temp;
               }
            }
        }
        System.out.println("Array in descending order");
        for(int i =0;i<20;i++){
            if (i==19){
                System.out.print(integers[i]);
            }else{
                 System.out.print(integers[i]+",");
            }
        }
        System.out.print("\nEnter a number to search :");
        int search=input.nextInt();
        int position=0;
        boolean flag=false;
        int count=0;
        
        for(int i =0;i<20;i++){
            if (integers[i]==search){
                position=i;
                flag=true;
                
            }
            count+=1;
            if (flag==true){
                break;
            }
        }
        if (flag==true){
            System.out.println(integers[position]+ " found");
            System.out.println("Linear Search - "+count+" loop(s)");
        }
        int low=0;
        int high=integers.length-1;
        int middle=0;
        int counter=0;
       while(low<=high){
           middle=(low+high)/2;
           if (integers[middle]==search){
               position=middle;
               break;
           }else if(integers[middle]>search){
               low=middle+1;
               counter+=1;
           }else {
               high=middle-1;
               counter+=1;
           }
       }
        System.out.println(integers[position]+ " found");
        System.out.println("Binary Search - "+counter +" loop(s)");
               
        
    }
}
