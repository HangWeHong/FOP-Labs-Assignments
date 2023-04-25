/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemsolving1;

/**
 *
 * @author natsu
 */
import java.util.Scanner;
public class CoordinateMove {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String coordinate[]; 
        System.out.print("Enter the coordinate X and Y :");
        coordinate = input.nextLine().split(" ");
        int x = Integer.parseInt(coordinate[0]); //int x=input.nextInt(); will automatically have a space in between
        int y = Integer.parseInt(coordinate[1]); //int y=input.nextInt();
        System.out.print("Enter the move:");
        String move =input.nextLine();
        System.out.println("Initial Coordinate ("+x+","+y+")");
        for (int n=0;n<move.length();n++){  //n<move.length because move.length started counting from 1 while computer start form 
        switch(move.charAt(n)){ //.charAt reads the character inside the string one by one and uses bracket
            case 'R':
                x=x+1;
                break;
            case 'U':
                y=y+1;
                break;
            case 'L':
                x=x-1;
                break;
            case 'D':
                y=y-1;
                break;
            }
        }
        System.out.println("Final Coordinate ("+x+","+y+")");
        
    }
    
}
