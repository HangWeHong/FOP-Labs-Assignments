/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment;

import java.io.*;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Assignment {

    
    public static void main(String[] args) {
       try{
        Scanner inputStream= new Scanner(new FileInputStream("extracted_log")); //scanner to read the file
      
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS"); //formatting the Date-Time format
        LocalDateTime startTime=LocalDateTime.of(2022,6,1,1,2,0);   //assign the time start with the format(year-month-dayTHours-min-seconds)
        LocalDateTime endTime=LocalDateTime.of(2022,6,1,7,15,40);   //assign the time end with the format(year-month-dayTHours-min-seconds)
        int job_created=0;                          //initialize the accumulator that stores the number of job created
        int job_ended=0;                            //initialize the accumulator that stores the number of job ended
        while(inputStream.hasNextLine()){
        String line;
        line=inputStream.nextLine();
        if(line.contains("_slurm_rpc_submit_batch_job")){       //check if the line states the job is created
          LocalDateTime timestamp=LocalDateTime.parse(line.substring(1,line.indexOf("]")),formatter);   //if yes create a new variable that parse only from the second index of the line which is from 1 to the index before "]" and follows the format
            if(timestamp.isAfter(startTime) && timestamp.isBefore(endTime)){    //check if time is within the time given
                job_created++;
            }
        }
         if (line.contains("_job_complete")){
             LocalDateTime timestamp=LocalDateTime.parse(line.substring(1,line.indexOf("]")),formatter);
                if(timestamp.isAfter(startTime) && timestamp.isBefore(endTime)){
                job_ended++;
                }
            }
        }
           System.out.println("Within the time "+startTime+" to "+endTime+ ":");
           System.out.println("The number of job created :"+job_created);
           System.out.println("The number of job ended :"+job_ended);
       }catch (FileNotFoundException e){
           System.out.println("File Not Found");
       }
    }
    
}
