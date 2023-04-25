/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9q2;

/**
 *
 * @author natsu
 */
public class PersonProfile{
    private String name;
    private String gender;
    private String dateofbirth;
    public PersonProfile(String name,String gender,String dateofbirth){
        this.name=name;
        this.gender=gender;
        this.dateofbirth=dateofbirth;
    }

    public String toString(){
        return "Name:"+name+
               "\nGender:"+gender+
               "\nDate of Birth :"+dateofbirth;
    }
    public static void main(String[] args) {
        
    }
    
}
