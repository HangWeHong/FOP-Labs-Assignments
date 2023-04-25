/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problem.solving.pkg2;

/**
 *
 * @author natsu
 */
import java.util.Scanner;
import java.util.Random;
public class WeekendDuty {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random random=new Random();
        System.out.print("Enter the number of staff [N] :");
        int number=input.nextInt();
        int max=99999;
        int min=10000;
        int work=0;
        int fourth=0;
        int second=0;
        for(int n=0;n<number;n++){
            int staffid=random.nextInt(max+1-min)+min;
            System.out.print("Staff ID: "+staffid);
            fourth=(staffid /1000)%10;  //get the fourth digit can use "/" 10.. by how many digits u need to reach there and use "% 10" to get the remainder
            second=(staffid /10)%10;    //same with fourth
            if (fourth%2==0 && second%2==1){
                System.out.println("\nWeekend Duty");// \n is an escaping character helps in outputing in a new line
                work=work+1;
            }else{
                    System.out.println("\nWeekend Off");
            }
            
           
        }
             
         System.out.println("The number of staffs work during weekend is "+work);        
    }
    
}
