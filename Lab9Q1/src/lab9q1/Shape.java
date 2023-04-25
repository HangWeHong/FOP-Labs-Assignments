/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9q1;

/**
 *
 * @author natsu
 */
public class Shape {
    private String name;
    private double perimeter;
    private double area;
    
    public Shape(){
       
    }
    public void setName(String name){
        this.name=name;
    }
    public void setPerimeter(double perimeter){
        this.perimeter=perimeter;
    }
     public double getPerimeter(){
        return perimeter;
    }
      public void setArea(double area){
        this.area=area;
    }
      public double setArea(){
        return area;
    }
      public void display(){
          System.out.printf("The name of the shape:%s\n",name);
          System.out.printf("The perimter : %.2f\n",perimeter);
          System.out.printf("The area is :%.2f\n",area);
          
      }
       
    
    public static void main(String[] args) {
        
    }
    
}
