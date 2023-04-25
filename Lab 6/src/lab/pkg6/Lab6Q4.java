/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg6;

/**
 *
 * @author natsu
 */
public class Lab6Q4 {
    static int divisor(int x,int y){
        int z=0;
        if(x>y){
        for (int i=1;i<=y;i++){
            if (x%i==0 && y%i==0){
                z=i;
            }
        }
        }else{
            for (int i=1;i<=x;i++){
            if (x%i==0 && y%i==0){
                z=i;
            }
        }
      
        }
               return z;
    }
    // or use recursion method ,faster and shorter code
    //while(j>0){
    //  int temp=i%j;
    //  i=j;
    //  j=temp;
    //}
    // return i
    public static void main(String[] args) {
        int GCD1=divisor(24,8);
        int GCD2=divisor(200,625);
        System.out.println("The greatest common divisor for (24,8) is "+ GCD1);
        System.out.println("The greatest common divisor for (200,625) is "+GCD2);
    }
}
