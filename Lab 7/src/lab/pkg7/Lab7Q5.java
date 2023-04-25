/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg7;

import java.io.*;

public class Lab7Q5 {
    public static void main(String[] args) {
        try{
        ObjectInputStream reader=new ObjectInputStream(new FileInputStream("person.dat"));
        int numRec=reader.readInt();
        String[][] person=new String[numRec][3];
        for(int i =0;i<numRec;i++){
           person[i][0]=reader.readUTF();
           person[i][1]=String.valueOf(reader.readInt()); //cannot readUTF to change it to String,still need String.valueOf method follow by the correct type reading method
           person[i][2]=String.valueOf(reader.readChar());
        }
        boolean flag=true;
        while (flag){
            flag=false;
            for (int i=0;i<numRec-1;i++){
                if ( person[i][0].compareTo(person[i+1][0])>0){
                    for(int j=0;j<person[i].length;j++){
                       String[] temp=new String[person[i].length];
                       temp[j]=person[i+1][j];
                       person[i+1][j]=person[i][j];
                       person[i][j]=temp[j];
                    }
                    flag=true;
                }
            }
        }
          for(int i =0;i<numRec;i++){
              System.out.printf("%-14s %-5s %-1s \n",person[i][0],person[i][1],person[i][2]);
        }
         reader.close();
        }catch(FileNotFoundException e){
            System.out.println("File Not Found");
           
        }catch(IOException e){
            System.out.println("Error occured while reading the file");
        }
    }
}
