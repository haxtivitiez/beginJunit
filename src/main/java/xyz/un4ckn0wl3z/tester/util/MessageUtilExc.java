package xyz.un4ckn0wl3z.tester.util;

/*
* This class prints the given message on console.
*/

public class MessageUtilExc {

   private String message;

   //Constructor
   //@param message to be printed
   public MessageUtilExc(String message){
      this.message = message; 
   }

   // prints the message
   public void printMessage(){
      System.out.println(message);
      int a = 0;
      int b = 1/a;
   }   

   // add "Hi!" to the message
   public String salutationMessage(){
      message = "Hi!" + message;
      System.out.println(message);
      return message;
   }   
}  	