package xyz.un4ckn0wl3z.tester;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import xyz.un4ckn0wl3z.tester.util.MessageUtil;

public class TestJunit2 {

   String message = "Robert";	
   MessageUtil messageUtil = new MessageUtil(message);
 
   @Test
   public void testSalutationMessage() {
      System.out.println("Inside testSalutationMessage()");
      message = "Hi!" + "Robert";
      assertEquals(message,messageUtil.salutationMessage());
   }
}
