/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mashsoft;

import com.mashsoft.bcdproject.BinaryCodedDecimal;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author tmashakada email:tmashakada10@gmail.com
 */
public class TestBinaryCodeDecimal {
    
    BinaryCodedDecimal binaryCodedDecimal=new BinaryCodedDecimal();
   @Test 
   public void testBcd(){
       
      
       Assert.assertEquals( "000001010100001100100001",binaryCodedDecimal.decode(binaryCodedDecimal.encode("54321")));
       
   }
   @Test 
   public void testBcd2(){
       
       Assert.assertEquals( "0000000100000001",binaryCodedDecimal.decode(binaryCodedDecimal.encode("101")));
      
   }
   
   @Test 
   public void testBcd3(){
       
      
       Assert.assertEquals( "000010010011010101101000",binaryCodedDecimal.decode(binaryCodedDecimal.encode("93568")));
       
   }
   @Test 
   public void testBcd4(){
       
      
       Assert.assertEquals( "000010010011010101101000",binaryCodedDecimal.decode(binaryCodedDecimal.encode("93568")));
       
   }
   @Test 
   public void testBcd5(){
       
      
       Assert.assertEquals( "0110010101000010",binaryCodedDecimal.decode(binaryCodedDecimal.encode("6542")));
       
   }
    @Test 
   public void testBcd6(){
       
      
       Assert.assertEquals( "0101001100100001",binaryCodedDecimal.decode(binaryCodedDecimal.encode("5321")));
       
   }
    @Test 
   public void testBcd7(){
       
      
       Assert.assertEquals( "0100001100100001",binaryCodedDecimal.decode(binaryCodedDecimal.encode("4321")));
       
   }
   
}
