/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8q3;

/**
 *
 * @author natsu
 */
public class WeightCalculator{
    private int age;
    private double height;
    private double RecWeight;
    
    public WeightCalculator(int age,double height){
        this.age=age;
        this.height=height;
    }
    public void CalculateRecWeight(){
        RecWeight=(height-100+age/10)*0.9;
    }
    public void display(){
        System.out.println("Age:"+age);
        System.out.println("Height:"+height);
        System.out.println("Recommend Weight:"+RecWeight);
    }
    public static void main(String[] args) {
         
    }
    
}
