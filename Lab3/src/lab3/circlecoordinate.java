/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author natsu
 */
import java.util.Scanner;
public class circlecoordinate {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String coordinate[];
      
        System.out.print("Enter the coordinate point(x,y):");
        coordinate= input.nextLine().split(",");
        int x=Integer.parseInt(coordinate[0]);
        int y=Integer.parseInt(coordinate[1]);
        System.out.print("What is the radius of the circle:");
        double radius=input.nextDouble();
        if(x>radius || y>radius || x<-(radius) || y<-(radius)){
            System.out.println("The point is outside of the circle");
        }else{
            System.out.println("The point is inside of the circle");
        }
        
    }
}
