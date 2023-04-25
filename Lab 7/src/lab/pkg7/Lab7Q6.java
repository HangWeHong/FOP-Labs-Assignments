/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg7;

import java.util.Scanner;
import java.io.*;

public class Lab7Q6 {
    public static void main(String[] args) {
        try{
       
        Scanner readerO =new Scanner(new FileInputStream("order.txt"));
        System.out.printf("%-10s %16s %10s %15s %10s \n","ProductID","ProductName","Quantity","PricePerUnit","Total");
        while(readerO.hasNextLine()){   //read order info first because all order have to be processed but not all product has order.
            String[] orderInfo=readerO.nextLine().split(",");   //splitmethod stores as element of array
            String OP_ID=orderInfo[1];
            int O_Quantity=Integer.parseInt(orderInfo[2]);
             Scanner readerP =new Scanner(new FileInputStream("product.txt")); //have to open the file to read while inside because eeach time u open it will start reading from the start again,if u start reading outside it will not read from the top to the btm but continue reading where it found the comparison and end in 3 more rows
            while(readerP.hasNextLine()){
                String[] productInfo=readerP.nextLine().split(",");
                String P_ID=productInfo[0];
                String P_Name=productInfo[1];
                double P_Price=Double.parseDouble(productInfo[2]);
                if (OP_ID.equals(P_ID)){
                    System.out.printf("%-10s %-20s %-13d %7.2f %11.2f \n",P_ID,P_Name,O_Quantity,P_Price,O_Quantity*P_Price);
                    readerP.close();
                    break;
                }
                
                
            }
            
        }
        
         readerO.close();
            
        }catch(FileNotFoundException e){
            System.out.println("File Not Found");
        }
    }
}
