import java.util.Scanner;
public class main{
   public static void main(String[]args){
       Scanner input = new Scanner(System.in);
      System.out.println("Hello, I am the smart numeric converter");
      System.out.println("What do you want me to do? You have the following options");
      System.out.println("1. Convert decimal to Binary");
      System.out.println("2. Convert decimal to hexadecimal");
      System.out.println("3. Convert decimal to Octal");
      System.out.println("4. Convert binary to decimal");
      System.out.println("5. Convert Hexadecimal to decimal");
      System.out.println("6. Convert Octal to decimal");
      System.out.println("Please enter the number of the option you choose");
      String choice = input.next();
      if(choice.equals("1")){
        System.out.println("Enter the decimal number to be converted to binary");
        int x = input.nextInt();
        System.out.println("The value of decimal number "+x +" in binary is "+toBinary(x));
        
        }
      else if(choice.equals("2")){
        System.out.println("Enter the decimal number to be converted to Hexadecimal");
        int decimal2 = input.nextInt();
        System.out.println("The value of decimal number "+decimal2 +" in hexadecimal is "+toHex(decimal2));
        }
        else if(choice.equals("3")){
        System.out.println("Enter the decimal number to be converted to Octal");
        int decimal3 = input.nextInt();
        System.out.println("The value of decimal number "+decimal3 +" in Octal is "+toOctal(decimal3));
    }
     else if(choice.equals("4")){
         System.out.println("Enter the binary number to be converted to decimal");
         String binary1 = input.next();
         System.out.println("The value of binary number "+binary1 +" in decimal is "+todecimal(binary1) +" in decimal");
     }
     else if(choice.equals("5")){
         System.out.println("Enter the Hexadecimal numberto be converted to decimal");
         String hexa1 = input.next();
         System.out.println("The value of hexadecimal number " +hexa1 +" in decimal is "+todecimal1(hexa1) +" in decimal");
     }
     else if(choice.equals("6")){
         System.out.println("Enter the Octal number to be converted to decimal");
         String oct1 = input.next();
         System.out.println("The value of Octal number "+oct1 +" in decimal is "+todecimal2(oct1) +" in decimal");
     }
      else{
    System.out.println("Please choose from 1,2 or 3");
    }
      
    }
    public static String toBinary(int x){
      String binary = "";
         while(x > 0){
             binary = (x % 2) + binary;
             x /= 2;
             }
         return binary;
    }
    public static String toHex(int decimal){    
     int rem;  
     String hex="";   
     char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
    while(decimal>0)  
     {  
       rem=decimal%16;   
       hex=hexchars[rem]+hex;   
       decimal=decimal/16;  
     }  
    return hex;  
}
public static String toOctal(int decimal){    
    int rem; //declaring variable to store remainder  
    String octal=""; //declareing variable to store octal  
    //declaring array of octal numbers  
    char octalchars[]={'0','1','2','3','4','5','6','7'};  
    //writing logic of decimal to octal conversion   
    while(decimal>0)  
    {  
       rem=decimal%8;   
       octal=octalchars[rem]+octal;   
       decimal=decimal/8;  
    }  
    return octal;
}
public static int todecimal(String binary2) {
    if(){

    }
    int decimal4=Integer.parseInt(binary2,2);  
    return decimal4;
    } 

public static int todecimal1(String hexan){
    int decimal5 = Integer.parseInt(hexan, 16);
    return decimal5;
} 
public static int todecimal2(String octal){
    int decimal6 = Integer.parseInt(octal, 8);
    return decimal6;
}
}
