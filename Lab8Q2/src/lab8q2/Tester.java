/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8q2;

/**
 *
 * @author natsu
 */
public class Tester {
    public static void main(String[] args) {
        BankAccount customer=new BankAccount("Hang We Hong","213214-01-3123","3217638127",300.50);
        customer.deposit(200);
        customer.withdraw(900);
        customer.display();
        
    }
}
