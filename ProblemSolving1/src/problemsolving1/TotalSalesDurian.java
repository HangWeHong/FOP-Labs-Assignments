/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problemsolving1;

/**
 *
 * @author natsu
 */
import java.util.Scanner;
public class TotalSalesDurian {
        public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
            String type;
            final int P_MK =25;
            final int P_HL =22;
            final int P_D24 =20;
            final int P_UM =18;
            float kg;
            float total_sal=0;
                System.out.print("Enter the type of durian [Quit] to terminate :");
                type=input.next();
                System.out.print("Enter the sales in kg:");
                kg=input.nextFloat();
            while (!"Quit".equals(type)){
                
                switch(type){
                    case "MK":
                        total_sal=total_sal +(P_MK*kg);
                        break;
                    case "HL":
                        total_sal=total_sal +(P_HL*kg);
                        break;
                    case "D24":
                        total_sal=total_sal +(P_D24*kg);
                        break;
                    case "UM":
                        total_sal=total_sal +(P_UM*kg);
                        break;
                    default:
                        System.out.println("Invalid type entered,please reenter:");
                      
                }
                
                System.out.print("Enter the type of durian [Quit] to terminate :");
                type=input.next();  //if .nextLine() will have error
                if (!"Quit".equals(type)){
                System.out.print("Enter the sales in kg:");
                kg=input.nextFloat();
                }
            }
            
            
          System.out.printf("Total Sales : %.2f",total_sal);
    }
}
