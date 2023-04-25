/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9q1;

/**
 *
 * @author natsu
 */
public class Square extends Shape {
    private double sideLength;
    
    public Square(double sideLength){
        this.sideLength=sideLength;
          compute();
    }

   
    public void compute(){
        setPerimeter(4*sideLength);
        setArea(sideLength*sideLength);
    }
    public static void main(String[] args) {
        
    }
}
