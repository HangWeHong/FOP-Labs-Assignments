/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9q1;

/**
 *
 * @author natsu
 */
public class Rectangle extends Shape {
    private double sideLength1;
    private double sideLength2;
    
    public Rectangle(double sideLength1,double sideLength2){
        this.sideLength1=sideLength1;
        this.sideLength2=sideLength2;
        compute();
    }   

    public void compute(){
        setPerimeter(2*sideLength1+2*sideLength2);
        setArea(sideLength1*sideLength2);
    }
    
    public static void main(String[] args) {
        
    }
}
