/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8q6;

/**
 *
 * @author natsu
 */
public class BurgerStalls {
    private String ID;
    private int sold;
    private static int totalSold; //static means that only one instance of a static member exists, It will be shared by all objects.
    public BurgerStalls(String ID,int sold){
        this.ID=ID;
        this.sold=sold;
    }
    public void burgerSold(int sold){
        this.sold+=sold;
        totalSold+=sold;
    }
    public int getTotalSold(){
    return totalSold;
    }
    public void display(){
        System.out.println("The ID of the burger stalls:"+ID);
        System.out.println("The number of burger sold:"+sold);
        System.out.println("The total number of the burger sold in all stalls:"+totalSold);
    }
   
    
    public static void main(String[] args) {
        
    }
    
}
