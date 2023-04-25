/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8q4;

/**
 *
 * @author natsu
 */
public class Tester {
    public static void main(String[] args) {
        Fraction fraction1=new Fraction();
        fraction1.setNumerator(4);
        System.out.println("The numerator is :"+fraction1.getNumerator());
         fraction1.setDenominator(8);
         System.out.println("The denominator is :"+fraction1.getDenominator());
        fraction1.displayLowestTerm();
    }
}
