/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mashsoft.bcdproject;

import java.util.regex.Pattern;

/**
 *
 * @author tmashakada email:tmashakada10@gmail.com
 */
public class BinaryCodedDecimal {
     private static Pattern BCD_PATTERN = Pattern.compile("[0-9]+");

    public BinaryCodedDecimal() {
    }
   
    
     /**
      * 
      * @param decimalNumber a positive number to encode
      * @return  BCD representation of the passed number argument
      * @throws IllegalArgumentException if the passed decimalNumber argument is negative or is not numeric
      * 
      */        
     public byte[] encode(String decimalNumber){
         
       if (!BCD_PATTERN.matcher(decimalNumber).matches()) {
            throw new IllegalArgumentException("Can only encode numerical strings"+
                     " Invalid argument: " + decimalNumber);
        }
         int num=Integer.parseInt(decimalNumber);
         int digits=decimalNumber.length();
         int byteLen = digits % 2 == 0 ? digits / 2 : (digits + 1) / 2;

         byte[] bcd = new byte[byteLen];
          for (int i = 0; i < digits; i++) {
            byte tmp = (byte) (num % 10);

            if (i % 2 == 0) {
                bcd[i / 2] = tmp;
            } else {
                bcd[i / 2] |= (byte) (tmp << 4);
            }

            num /= 10;
        }

        for (int i = 0; i < byteLen / 2; i++) {
            byte tmp = bcd[i];
            bcd[i] = bcd[byteLen - i - 1];
            bcd[byteLen - i - 1] = tmp;
        }

         
        //System.out.println(bcd);
        return bcd;
        
         
     }
     /**
      * 
      * @param bcdData
      * @return binary representation of the decoded Decimal Number
      */
     public String decode(byte[] bcdData){
         
         StringBuilder sb = new StringBuilder();
        
        
        for (byte b : bcdData) {
            String byteInBinary = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
            sb.append(byteInBinary);
        }
        return sb.toString();
         
     }
    
    
}
