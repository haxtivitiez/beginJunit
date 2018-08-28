package xyz.un4ckn0wl3z.tester;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import xyz.un4ckn0wl3z.tester.util.MessageUtilExc;

public class TestJunitExc {

   String message = "Robert";	
   MessageUtilExc messageUtil = new MessageUtilExc(message);
   
   @Test(expected = ArithmeticException.class)
   public void testPrintMessage() {	
      System.out.println("Inside testPrintMessage()");     
      messageUtil.printMessage();     
   }

   @Test
   public void testSalutationMessage() {
      System.out.println("Inside testSalutationMessage()");
      message = "Hi!" + "Robert";
      assertEquals(message,messageUtil.salutationMessage());
   }
}