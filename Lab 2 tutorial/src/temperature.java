/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author natsu
 */

import java.text.DecimalFormat;//import to control the decimal*****
import java.util.Scanner;
public class temperature {

    private static final DecimalFormat df = new DecimalFormat("0.00");//create the variable name "df" to control the decimal
    public static void main(String[] args) {
       Scanner keyboard=new Scanner(System.in );
       float celcius;
        System.out.println("What is the temperature in Fahrenheit : ");
        float temp= keyboard.nextFloat();
        celcius = (float) ((temp - 32)/1.8);
        System.out.println("The temperature in celcius is "+ df.format(celcius));
        
       
    }
    
    
}

