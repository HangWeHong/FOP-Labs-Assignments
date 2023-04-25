/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9q1;

/**
 *
 * @author natsu
 */
public class Circle extends Shape {
    private double diameter;
    public Circle(double diameter){
    this.diameter=diameter;
      compute();
    }

    public void compute(){
        setPerimeter(Math.PI*diameter);
        setArea(Math.PI*(diameter/2)*(diameter/2));
    }
    public static void main(String[] args) {
        
    }
}
