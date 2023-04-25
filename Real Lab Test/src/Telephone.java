/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author natsu
 */
public class Telephone {
    private String areaCode;
    private String number;
    private static int numberOfTelephoneObject=0;
   
    public Telephone(String areaCode,String number){
        this.areaCode=areaCode;
        this.number=number;
        numberOfTelephoneObject++;
    }

    public void setAreaCode(String areaCode){
        this.areaCode=areaCode;
    }
    public String getAreaCode(){
        return areaCode;
    }
    public void setNumber(String number){
        this.number=number;
    }
    public String getNumber(){
        return number;
    }

    public String makeFullNumber(){
        return areaCode+"-"+number;
    }

    public static void main(String[] args) {
        Telephone[] telephone=new Telephone[5];
        for(int i=0;i<telephone.length;i++){
            telephone[i]=new Telephone("03","7967630"+i);
        }
        for (int i=0;i<telephone.length;i++){
            System.out.println(telephone[i].makeFullNumber());
        }
    }
}
