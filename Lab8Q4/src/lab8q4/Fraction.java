/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8q4;

/**
 *
 * @author natsu
 */
public class Fraction {

   private int numerator;
   private int denominator;
   
   public Fraction(){
       
   }
   public Fraction(int numerator,int denominator) {
    this.numerator=numerator;
    this.denominator=denominator;
}
   public void setNumerator(int numerator){
    this.numerator=numerator;
}
    public void setDenominator(int denominator){
    this.denominator=denominator;
}
    public int getNumerator(){
        return numerator;
    }
     public int getDenominator(){
        return denominator;
    }
     public void displayLowestTerm(){
         int GCD=0;
         for (int i=1;i<=denominator/2;i++){
             if (numerator%i==0 && denominator%i==0){
                 GCD=i;
             }
         }
         numerator=numerator/GCD;
         denominator=denominator/GCD;
         System.out.println("The lowest terms for the fraction is :"+numerator+"/"+denominator);
     }

    public static void main(String[] args) {
        
    }
    
}
