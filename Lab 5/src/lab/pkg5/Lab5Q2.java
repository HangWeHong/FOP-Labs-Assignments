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
public class Lab5Q2 {
    public static void main(String[] args) {
      Random random = new Random();
      int max =20;
      int min=0;
      int number=0;
      int[] realnum= new int[10];
      int n=0;
      while(n < 10){
          number=random.nextInt(max+1-min)+min;
          boolean flag=true;
          if (n==0){
              realnum[n]=number;
              n+=1;
          }else{
          for (int counter=0;counter<=n-1;counter++){
              if (realnum[counter]==number){
                  flag=false;
              } 
         
          }
          if (flag==true){
              realnum[n]=number;
              n+=1;
          }
          }
          
          
          
      }
      for(int i=0;i<10;i++){
          System.out.println(realnum[i]);
      }
    }
}
