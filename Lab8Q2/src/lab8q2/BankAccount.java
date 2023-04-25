/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8q2;

/**
 *
 * @author natsu
 */
public class BankAccount {
       private String name;
       private String IC;
       private String passport;
       private double balance;

      public BankAccount(String name,String IC,String passport,double balance){
          this.name=name;
          this.IC=IC;
          this.passport=passport;
          this.balance=balance;
      }
    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount){
        balance-=Math.min(balance, amount); //so that the withdraw would not be more than the balance
    }
    public void display(){
        System.out.println("Name;"+name);
        System.out.println("IC:"+IC);
        System.out.printf("RM%.2f \n",balance);
    }
    public static void main(String[] args) {
        
    }
    
}
