/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.pkg6;

/**
 *
 * @author natsu
 */

public class Lab6Q1 {
    

   static void triangular(int x){
       int num=0;
       System.out.println("The first 20 triangular number: ");
       for(int count=0;count<x;count++){
           num+=count+1;
           if(count==x-1){
                  System.out.print(num);
           }else{
                  System.out.print(num+",");
           }
     
       }
   }
    public static void main(String[] args) {
       triangular(20);
      
        
    }
    
}
