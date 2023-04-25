/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9q1;

/**
 *
 * @author natsu
 */
public class Tester {
    public static void main(String[] args) {
       Shape shape = new Shape();
       shape.setName("Shape");
        shape.setPerimeter(50);
        shape.setArea(100);
        shape.display();
        System.out.println();

        Rectangle rectangle=new Rectangle(8,12);
        rectangle.setName("Rectangle");
        rectangle.display();
        System.out.println();

        Square square = new Square(10);
        square.setName("Square");
        square.display();
        System.out.println();

        Circle circle = new Circle(14);
        circle.setName("Circle");
        circle.display();
        System.out.println();
    
    }
    
}
