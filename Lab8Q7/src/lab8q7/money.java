/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8q7;

/**
 *
 * @author natsu
 */
public class money {
    private int note_100,note_50,note_10,note_5,note_1;
    private int cent_50,cent_20,cent_10,cent_5;
    private double amount;
   
    public money(double amount){
        this.amount=round(amount);
      
    }
    public void add(double amount){
        this.amount+=amount;
        
    }
    public void substract(double amount){
        this.amount-=amount;
    }
    public void calculate(){
        int notes = (int) this.amount;
        int cents = (int) (this.amount * 100 % 100);//to get the last two digits

        note_100 = notes / 100;
        notes %= 100;
        note_50 = notes / 50;
        notes %= 50;
        note_10 = notes / 10;
        notes %= 10;
        note_5= notes / 5;
        notes %= 5;
        note_1 = notes;

        cent_50 = cents / 50;
        cents %= 50;
        cent_20 = cents / 20;
        cents %= 20;
        cent_10 = cents / 10;
        cents %= 10;
        cent_5= cents / 5;

    }
    public void display(){
        System.out.printf("The amount is :RM %.2f \n",amount);
        System.out.println("RM100 :"+note_100);
        System.out.println("RM50 :"+note_50);
        System.out.println("RM10 :"+note_10);
        System.out.println("RM5 :"+note_5);
        System.out.println("RM1 :"+note_1);
        System.out.println("RM0.50 :"+cent_50);
       System.out.println("RM0.20 :"+cent_20);
        System.out.println("RM0.10 :"+cent_10);
         System.out.println("RM0.05 :"+cent_5);
    }
    public double round (double amount){
        int rounding=(int)(amount*100);
        
        int secondDigit=rounding %10;
        rounding/=10;
        switch(secondDigit){
            case 0,1,2: 
                secondDigit=0;
                break;
            case 3,4,5,6,7:
                secondDigit=5;
                break;
            default:
                rounding+=1;
                secondDigit=0;
        }
        String temp_rounding=String.valueOf(rounding);
        String temp_secondDigit=String.valueOf(secondDigit);
        String temp=temp_rounding+temp_secondDigit;
        return Double.parseDouble(temp)/100;
        
    }
    public static void main(String[] args) {
     
    }
    
}
