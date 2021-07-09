/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mashsoft.bcdproject;

/**
 *
 * @author tmashakada email:tmashakada10@gmail.com
 */
public class Main {
     public static void main(String[] args) {
        System.out.println("Testing decimalToBcd:");
        System.out.println(String.format("         %10s %20s        %20s     %18s", "Value", "Expected","Produced", "Result"));

        testDecimalNumberToBcd("54321",  "000001010100001100100001");
        testDecimalNumberToBcd("101",  "0000000100000001");
        testDecimalNumberToBcd("93568",  "000010010011010101101000");
        testDecimalNumberToBcd("6542",  "0110010101000010");
        testDecimalNumberToBcd("5321",  "0101001100100001");
        testDecimalNumberToBcd("4321",  "0100001100100001");
     }
     private static void testDecimalNumberToBcd(String  decimalNumber, String expected) {
          BinaryCodedDecimal binaryCodedDecimal=new BinaryCodedDecimal();
        String binaryString = binaryCodedDecimal.decode(binaryCodedDecimal.encode(decimalNumber));
        System.out.print(String.format("Testing: %10d -> %30s %30s %4s\n", Integer.valueOf(decimalNumber),expected, binaryString
                , binaryString.equals(expected) ? "[PASSED]" : "[FAIL]"));
    }
     
}
