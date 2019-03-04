	 import java.util.*;
	 import java.util.ArrayList;
	 import java.util.Collections; 
	public class BigInt {
		private ArrayList <Integer> bigArray = new ArrayList<Integer>(); 
		private String bigInt; 
		//private int arrayIndex = 0; 
		private boolean positive = true;
		public static void main(String args []) {
	
	  
	  
			BigInt intValue1 = new BigInt(1234567);
	    	System.out.println("integer value is " + intValue1);
	    	BigInt intValue2 = new BigInt(-1234567);
	    	System.out.println("integer value is " + intValue2);
	    	BigInt intValue3 = new BigInt(-0);
	    	System.out.println("integer value is " + intValue3);
	    	
	    			
	    	BigInt b1; 
	    	BigInt b2; 
	    	BigInt b3; 
	    	b3 = intValue1.add(intValue2);
	    	System.out.println("0) sum b3 is " + intValue1 +" + " + intValue2 + " = " + b3);
	    	b1 = new BigInt("-1");
	    	b2 = new BigInt("+0");
	    	b3 = b1.add(b2);
			System.out.println("1) sum b3 is " + b1 +" + " + b2 + " = " + b3);
			b3 = b1.subtract(b2);
			System.out.println("differance b3 is " + b1 +" - " + b2 + " = " + b3);
			b3 = b1.multiply(b2);
			System.out.println("product b3 is " + b1 +" * " + b2 + " = " + b3);
			b1 = new BigInt("1");
	    	b2 = new BigInt("1");
	    	b3 = b1.add(b2);
			System.out.println("\n2) sum b3 is " + b1 +" + " + b2 + " = " + b3);
			b3 = b1.subtract(b2);
			System.out.println("differance b3 is " + b1 +" - " + b2 + " = " + b3);
			b3 = b1.multiply(b2);
			System.out.println("product b3 is " + b1 +" * " + b2 + " = " + b3);
			b3 = b1.divideBy(b2);
			System.out.println("quotient b3 is " + b1 +" / " + b2 + " = " + b3);
			b3 = b1.modulus(b2);
			System.out.println("modulus b3 is " + b1 +" mod " + b2 + " = " + b3);
			b1 = new BigInt("-1");
	    	b2 = new BigInt("1");
	    	b3 = b1.add(b2);
			System.out.println("\n3) sum b3 is " + b1 +" + " + b2 + " = " + b3);
			b3 = b1.subtract(b2);
			System.out.println("differance b3 is " + b1 +" - " + b2 + " = " + b3);
			b3 = b1.multiply(b2);
			System.out.println("product b3 is " + b1 +" * " + b2 + " = " + b3);
			b3 = b1.divideBy(b2);
			System.out.println("quotient b3 is " + b1 +" / " + b2 + " = " + b3);
			b3 = b1.modulus(b2);
			System.out.println("modulus b3 is " + b1 +" mod " + b2 + " = " + b3);
			b1 = new BigInt("1");
	    	b2 = new BigInt("-1");
	    	b3 = b1.add(b2);
			System.out.println("\n4) sum b3 is " + b1 +" + " + b2 + " = " + b3);
			b3 = b1.subtract(b2);
			System.out.println("differance b3 is " + b1 +" - " + b2 + " = " + b3);
			b3 = b1.multiply(b2);
			System.out.println("product b3 is " + b1 +" * " + b2 + " = " + b3);
			b3 = b1.divideBy(b2);
			System.out.println("quotient b3 is " + b1 +" / " + b2 + " = " + b3);
			b3 = b1.modulus(b2);
			System.out.println("modulus b3 is " + b1 +" mod " + b2 + " = " + b3);
			b1 = new BigInt("-1");
	    	b2 = new BigInt("-1");
	    	b3 = b1.add(b2);
			System.out.println("\n5) sum b3 is " + b1 +" + " + b2 + " = " + b3);
			b3 = b1.subtract(b2);
			System.out.println("differance b3 is " + b1 +" - " + b2 + " = " + b3);
			b3 = b1.multiply(b2);
			System.out.println("product b3 is " + b1 +" * " + b2 + " = " + b3);
			b3 = b1.divideBy(b2);
			System.out.println("quotient b3 is " + b1 +" / " + b2 + " = " + b3);
			b3 = b1.modulus(b2);
			System.out.println("modulus b3 is " + b1 +" mod " + b2 + " = " + b3);
			b1 = new BigInt("+1");
	    	b2 = new BigInt("+1");
	    	b3 = b1.add(b2);
			System.out.println("\n6) sum b3 is " + b1 +" + " + b2 + " = " + b3);
			b3 = b1.subtract(b2);
			System.out.println("differance b3 is " + b1 +" - " + b2 + " = " + b3);
			b3 = b1.multiply(b2);
			System.out.println("product b3 is " + b1 +" * " + b2 + " = " + b3);
			b3 = b1.divideBy(b2);
			System.out.println("quotient b3 is " + b1 +" / " + b2 + " = " + b3);
			b3 = b1.modulus(b2);
			System.out.println("modulus b3 is " + b1 +" mod " + b2 + " = " + b3);
			b1 = new BigInt("-100");
	    	b2 = new BigInt("100");
	    	b3 = b1.add(b2);
			System.out.println("\n7) sum b3 is " + b1 +" + " + b2 + " = " + b3);
			b3 = b1.subtract(b2);
			System.out.println("differance b3 is " + b1 +" - " + b2 + " = " + b3);
			b3 = b1.multiply(b2);
			System.out.println("product b3 is " + b1 +" * " + b2 + " = " + b3);
			b3 = b1.divideBy(b2);
			System.out.println("quotient b3 is " + b1 +" / " + b2 + " = " + b3);
			b3 = b1.modulus(b2);
			System.out.println("modulus b3 is " + b1 +" mod " + b2 + " = " + b3);
			b1 = new BigInt("100");
	    	b2 = new BigInt("-100");
	    	b3 = b1.add(b2);
			System.out.println("\n8) sum b3 is " + b1 +" + " + b2 + " = " + b3);
			b3 = b1.subtract(b2);
			System.out.println("differance b3 is " + b1 +" - " + b2 + " = " + b3);
			b3 = b1.multiply(b2);
			System.out.println("product b3 is " + b1 +" * " + b2 + " = " + b3);
			b3 = b1.divideBy(b2);
			System.out.println("quotient b3 is " + b1 +" / " + b2 + " = " + b3);
			b3 = b1.modulus(b2);
			System.out.println("modulus b3 is " + b1 +" mod " + b2 + " = " + b3);
			b1 = new BigInt("-100");
	    	b2 = new BigInt("-100");
	    	b3 = b1.add(b2);
			System.out.println("\n9) sum b3 is " + b1 +" + " + b2 + " = " + b3);
			b3 = b1.subtract(b2);
			System.out.println("differance b3 is " + b1 +" - " + b2 + " = " + b3);
			b3 = b1.multiply(b2);
			System.out.println("product b3 is " + b1 +" * " + b2 + " = " + b3);
			b3 = b1.divideBy(b2);
			System.out.println("quotient b3 is " + b1 +" / " + b2 + " = " + b3);
			b3 = b1.modulus(b2);
			System.out.println("modulus b3 is " + b1 +" mod " + b2 + " = " + b3);
			b1 = new BigInt("100");
	    	b2 = new BigInt("100");
	    	b3 = b1.add(b2);
			System.out.println("\n10) sum b3 is " + b1 +" + " + b2 + " = " + b3);
			b3 = b1.subtract(b2);
			System.out.println("differance b3 is " + b1 +" - " + b2 + " = " + b3);
			b3 = b1.multiply(b2);
			System.out.println("product b3 is " + b1 +" * " + b2 + " = " + b3);
			b3 = b1.divideBy(b2);
			System.out.println("quotient b3 is " + b1 +" / " + b2 + " = " + b3);
			b3 = b1.modulus(b2);
			System.out.println("modulus b3 is " + b1 +" mod " + b2 + " = " + b3);
			b1 = new BigInt("200");
	    	b2 = new BigInt("-0");
	    	b3 = b1.add(b2);
			System.out.println("\n11) sum b3 is " + b1 +" + " + b2 + " = " + b3);
			b3 = b1.subtract(b2);
			System.out.println("differance b3 is " + b1 +" - " + b2 + " = " + b3);
			b3 = b1.multiply(b2);
			System.out.println("product b3 is " + b1 +" * " + b2 + " = " + b3);
			//b3 = b1.divideBy(b2);
			//System.out.println("quotient b3 is " + b1 +" / " + b2 + " = " + b3);
			//b3 = b1.modulus(b2);
			//System.out.println("modulus b3 is " + b1 +" mod " + b2 + " = " + b3);
			b1 = new BigInt("-200");
	    	b2 = new BigInt("-0");
	    	b3 = b1.add(b2);
			System.out.println("\n12) sum b3 is " + b1 +" + " + b2 + " = " + b3);
			b3 = b1.subtract(b2);
			System.out.println("differance b3 is " + b1 +" - " + b2 + " = " + b3);
			b3 = b1.multiply(b2);
			System.out.println("product b3 is " + b1 +" * " + b2 + " = " + b3);
			//b3 = b1.divideBy(b2);
			//System.out.println("quotient b3 is " + b1 +" / " + b2 + " = " + b3);
			//b3 = b1.modulus(b2);
			//System.out.println("modulus b3 is " + b1 +" mod " + b2 + " = " + b3);
			b1 = new BigInt("-0");
	    	b2 = new BigInt("200");
	    	b3 = b1.add(b2);
			System.out.println("\n13) sum b3 is " + b1 +" + " + b2 + " = " + b3);
			b3 = b1.subtract(b2);
			System.out.println("differance b3 is " + b1 +" - " + b2 + " = " + b3);
			b3 = b1.multiply(b2);
			System.out.println("product b3 is " + b1 +" * " + b2 + " = " + b3);
			b3 = b1.divideBy(b2);
			System.out.println("quotient b3 is " + b1 +" / " + b2 + " = " + b3);
			b3 = b1.modulus(b2);
			System.out.println("modulus b3 is " + b1 +" mod " + b2 + " = " + b3);
			b1 = new BigInt("-0");
	    	b2 = new BigInt("-200");
	    	b3 = b1.add(b2);
			System.out.println("\n14) sum b3 is " + b1 +" + " + b2 + " = " + b3);
			b3 = b1.subtract(b2);
			System.out.println("differance b3 is " + b1 +" - " + b2 + " = " + b3);
			b3 = b1.multiply(b2);
			System.out.println("product b3 is " + b1 +" * " + b2 + " = " + b3);
			b3 = b1.divideBy(b2);
			System.out.println("quotient b3 is " + b1 +" / " + b2 + " = " + b3);
			b3 = b1.modulus(b2);
			System.out.println("modulus b3 is " + b1 +" mod " + b2 + " = " + b3);
			b1 = new BigInt("37");
	    	b2 = new BigInt("26");
	    	b3 = b1.add(b2);
			System.out.println("\n15) sum b3 is " + b1 +" + " + b2 + " = " + b3);
			b3 = b1.subtract(b2);
			System.out.println("differance b3 is " + b1 +" - " + b2 + " = " + b3);
			b3 = b1.multiply(b2);
			System.out.println("product b3 is " + b1 +" * " + b2 + " = " + b3);
			b3 = b1.divideBy(b2);
			System.out.println("quotient b3 is " + b1 +" / " + b2 + " = " + b3);
			b3 = b1.modulus(b2);
			System.out.println("modulus b3 is " + b1 +" mod " + b2 + " = " + b3);
			b1 = new BigInt("-37");
	    	b2 = new BigInt("26");
	    	b3 = b1.add(b2);
			System.out.println("\n16) sum b3 is " + b1 +" + " + b2 + " = " + b3);
			b3 = b1.subtract(b2);
			System.out.println("differance b3 is " + b1 +" - " + b2 + " = " + b3);
			b3 = b1.multiply(b2);
			System.out.println("product b3 is " + b1 +" * " + b2 + " = " + b3);
			b3 = b1.divideBy(b2);
			System.out.println("quotient b3 is " + b1 +" / " + b2 + " = " + b3);
			b3 = b1.modulus(b2);
			System.out.println("modulus b3 is " + b1 +" mod " + b2 + " = " + b3);
			b1 = new BigInt("37");
	    	b2 = new BigInt("-26");
	    	b3 = b1.add(b2);
			System.out.println("\n17) sum b3 is " + b1 +" + " + b2 + " = " + b3);
			b3 = b1.subtract(b2);
			System.out.println("differance b3 is " + b1 +" - " + b2 + " = " + b3);
			b3 = b1.multiply(b2);
			System.out.println("product b3 is " + b1 +" * " + b2 + " = " + b3);
			b3 = b1.divideBy(b2);
			System.out.println("quotient b3 is " + b1 +" / " + b2 + " = " + b3);
			b3 = b1.modulus(b2);
			System.out.println("modulus b3 is " + b1 +" mod " + b2 + " = " + b3);
			b1 = new BigInt("-37");
	    	b2 = new BigInt("-26");
	    	b3 = b1.add(b2);
			System.out.println("\n18) sum b3 is " + b1 +" + " + b2 + " = " + b3);
			b3 = b1.subtract(b2);
			System.out.println("differance b3 is " + b1 +" - " + b2 + " = " + b3);
			b3 = b1.multiply(b2);
			System.out.println("product b3 is " + b1 +" * " + b2 + " = " + b3);
			b3 = b1.divideBy(b2);
			System.out.println("quotient b3 is " + b1 +" / " + b2 + " = " + b3);
			b3 = b1.modulus(b2);
			System.out.println("modulus b3 is " + b1 +" mod " + b2 + " = " + b3);
			b1 = new BigInt("-200111111111111111199999999");
			b2 = new BigInt("3333333333333388888888888888888888555555555555555555555555");
			System.out.println("\nb1 is " + b1);
			System.out.println("b2 is " + b2);
			b3 = b1.add(b2);
			System.out.println("19) sum b3 is " + b1 +" + " + b2 + " = " + b3);
			b3 = b1.subtract(b2);
			System.out.println("differance b3 is " + b1 +" - " + b2 + " = " + b3);
			b3 = b1.multiply(b2);
			System.out.println("product b3 is " + b1 +" * " + b2 + " = " + b3);
			
			b1 = b3.divideBy(b2);
			System.out.println("I should get back the same b1 I started with");
			System.out.println("quotient b1 is " + b3 +" / " + b2 + " = " + b1);
			b3 = b1.modulus(b2);
			System.out.println("modulus b3 is " + b1 +" mod " + b2 + " = " + b3);
			b1 = new BigInt("66666666666666666666677777777777777777777711111111111111111200");
	    	b2 = new BigInt("-3333333333333333333344444444444");
	    	System.out.println("\nb1 is " + b1);
			System.out.println("b2 is " + b2);
	    	b3 = b1.add(b2);
			System.out.println("20) sum b3 is " + b1 +" + " + b2 + " = " + b3);
			b3 = b1.subtract(b2);
			System.out.println("differance b3 is " + b1 +" - " + b2 + " = " + b3);
			b3 = b1.multiply(b2);
			System.out.println("product b3 is " + b1 +" * " + b2 + " = " + b3);
			
			b1 = b3.divideBy(b2);
			System.out.println("I should get back the same b1 I started with");
			System.out.println("quotient b1 is " + b3 +" / " + b2 + " = " + b1);
			b3 = b1.modulus(b2);
			System.out.println("modulus b3 is " + b1 +" mod " + b2 + " = " + b3);
			b1 = new BigInt("-66666666666666666666677777777777777777777711111111111111111200");
	    	b2 = new BigInt("-333333");
	    	System.out.println("\nb1 is " + b1);
			System.out.println("b2 is " + b2);
	    	b3 = b1.add(b2);
			System.out.println("21) sum b3 is " + b1 +" + " + b2 + " = " + b3);
			b3 = b1.subtract(b2);
			System.out.println("differance b3 is " + b1 +" - " + b2 + " = " + b3);
			b3 = b1.multiply(b2);
			System.out.println("product b3 is " + b1 +" * " + b2 + " = " + b3);
			b3 = b1.divideBy(b2);
			System.out.println("quotient b3 is " + b1 +" / " + b2 + " = " + b3);
			b3 = b1.modulus(b2);
			System.out.println("modulus b3 is " + b1 +" mod " + b2 + " = " + b3);
			b1 = new BigInt("6666666");
	    	b2 = new BigInt("3333333333333333333344444444444444444444455555555555555550");
	    	System.out.println("\nb1 is " + b1);
			System.out.println("b2 is " + b2);
	    	b3 = b1.add(b2);
			System.out.println("22) sum b3 is " + b1 +" + " + b2 + " = " + b3);
			b3 = b1.subtract(b2);
			System.out.println("differance b3 is " + b1 +" - " + b2 + " = " + b3);
			b3 = b1.multiply(b2);
			System.out.println("product b3 is " + b1 +" * " + b2 + " = " + b3);
			b3 = b1.divideBy(b2);
			System.out.println("quotient b3 is " + b1 +" / " + b2 + " = " + b3);
			b3 = b1.modulus(b2);
			System.out.println("modulus b3 is " + b1 +" mod " + b2 + " = " + b3);
			b1 = new BigInt("1111111111111111111111111111111122222222222222222222222222222222222333333333333333333333333333333334444444444444444444444444");
	    	b2 = new BigInt("99999999999999999999999999999888888888888888888888888888888881111111111111111111111111111111122222222222222222222222222222222222333333333333333333333333333333334444444444444444444444444");
	    	System.out.println("\nb1 is " + b1);
			System.out.println("b2 is " + b2);
	    	b3 = b1.add(b2);
			System.out.println("23) sum b3 is " + b1 +" + " + b2 + " = " + b3);
			b3 = b1.subtract(b2);
			System.out.println("differance b3 is " + b1 +" - " + b2 + " = " + b3);
			b3 = b1.multiply(b2);
			System.out.println("product b3 is " + b1 +" * " + b2 + " = " + b3);
			b3 = b1.divideBy(b2);
			System.out.println("quotient b3 is " + b1 +" / " + b2 + " = " + b3);
			b3 = b1.modulus(b2);
			System.out.println("modulus b3 is " + b1 +" mod " + b2 + " = " + b3);
			b1 = new BigInt("-1111111111111111111111111111111122222222222222222222222222222222222333333333333333333333333333333334444444444444444444444444");
	    	b2 = new BigInt("99999999999999999999999999999888888888888888888888888888888881111111111111111111111111111111122222222222222222222222222222222222333333333333333333333333333333334444444444444444444444444");
	    	System.out.println("\nb1 is " + b1);
			System.out.println("b2 is " + b2);
	    	b3 = b1.add(b2);
			System.out.println("24) sum b3 is " + b1 +" + " + b2 + " = " + b3);
			b3 = b1.subtract(b2);
			System.out.println("differance b3 is " + b1 +" - " + b2 + " = " + b3);
			b3 = b1.multiply(b2);
			System.out.println("product b3 is " + b1 +" * " + b2 + " = " + b3);
			b3 = b1.divideBy(b2);
			System.out.println("quotient b3 is " + b1 +" / " + b2 + " = " + b3);
			b3 = b1.modulus(b2);
			System.out.println("modulus b3 is " + b1 +" mod " + b2 + " = " + b3);
			b1 = new BigInt("1111111111111111111111111111111122222222222222222222222222222222222333333333333333333333333333333334444444444444444444444444");
	    	b2 = new BigInt("-99999999999999999999999999999888888888888888888888888888888881111111111111111111111111111111122222222222222222222222222222222222333333333333333333333333333333334444444444444444444444444");
	    	System.out.println("\nb1 is " + b1);
			System.out.println("b2 is " + b2);
	    	b3 = b1.add(b2);
			System.out.println("25) sum b3 is " + b1 +" + " + b2 + " = " + b3);
			b3 = b1.subtract(b2);
			System.out.println("differance b3 is " + b1 +" - " + b2 + " = " + b3);
			b3 = b1.multiply(b2);
			System.out.println("product b3 is " + b1 +" * " + b2 + " = " + b3);
			b3 = b1.divideBy(b2);
			System.out.println("quotient b3 is " + b1 +" / " + b2 + " = " + b3);
			b3 = b1.modulus(b2);
			System.out.println("modulus b3 is " + b1 +" mod " + b2 + " = " + b3);
			b1 = new BigInt("-1111111111111111111111111111111122222222222222222222222222222222222333333333333333333333333333333334444444444444444444444444");
	    	b2 = new BigInt("-99999999999999999999999999999888888888888888888888888888888881111111111111111111111111111111122222222222222222222222222222222222333333333333333333333333333333334444444444444444444444444");
	    	System.out.println("\nb1 is " + b1);
			System.out.println("b2 is " + b2);
	    	b3 = b1.add(b2);
			System.out.println("26) sum b3 is " + b1 +" + " + b2 + " = " + b3);
			b3 = b1.subtract(b2);
			System.out.println("differance b3 is " + b1 +" - " + b2 + " = " + b3);
			b3 = b1.multiply(b2);
			System.out.println("product b3 is " + b1 +" * " + b2 + " = " + b3);
			b3 = b1.divideBy(b2);
			System.out.println("quotient b3 is " + b1 +" / " + b2 + " = " + b3);
			b3 = b1.modulus(b2);
			System.out.println("modulus b3 is " + b1 +" mod " + b2 + " = " + b3);
		}
		BigInt(String stringInteger){
			set(stringInteger); 
				}
	
		BigInt(ArrayList<Integer> arrayString){
			String  newString= ""; 
			BigInt b1; 
			 int i = arrayString.size() -1; 
			for(int index = 0; index < arrayString.size(); index++) {
				//System.out.println("The value of the array "+ String.valueOf(arrayString.get(i)));
				 newString = newString + String.valueOf(arrayString.get(i)); 
				i --; 
			}
			set(newString); 
		}
		BigInt(BigInt integer){

			String i = integer.toString();
			System.out.println(i);
			set(i); 
			
		}
		BigInt(int Integer){
			set(String.valueOf(Integer));
		}
			
		public BigInt add(BigInt anInteger) {
			BigInt answer = null; 
			//if(this.bigArray.size() <= bigArray.size()) {
				//System.out.println("Testing add compering sizes");
				//System.out.println("Value of this.positive " + String.valueOf(this.positive) + "\nValue of other positive " + String.valueOf(anInteger.positive));
				if(this.positive == true && anInteger.positive == true ) {
					//add 
					//System.out.println("Checking Boolean Wrapper ++");
					answer = this.adding(anInteger);
				}
				else if (this.positive == true && anInteger.positive == false) {
					//Subtract
						answer =this.subtracting(anInteger); 
						//System.out.println("Checking Boolean Wrapper +-");
				}
				else if(this.positive == false && anInteger.positive == true) {
					//subtract
					//System.out.println("Checking Boolean Wrapper -+");
					answer = this.subtracting(anInteger); 
				}
				else if(this.positive == false && anInteger.positive == false) {
					//add
					answer = this.adding(anInteger);
					answer.toString(); 
					//answer = new BigInt( answer.setAndRemoveSignIfItIsThere(bigInt)); 
				}
				
		
			BigInt FinalAnswer;
			//System.out.println(answer.bigInt);
			return FinalAnswer = new BigInt(answer); 
			}
		public BigInt subtract(BigInt integer) {
			BigInt answer = null; 
			if(this.positive == true && integer.positive == true ) {
				//add
				//System.out.println("Checking Boolean Wrapper ++");
				answer = this.subtracting(integer);
			}
			else if (this.positive == true && integer.positive == false) {
				//Subtract
					answer =this.adding(integer); 
					//System.out.println("Checking Boolean Wrapper +-");
			}
			else if(this.positive == false && integer.positive == true) {
				//subtract
				//System.out.println("Checking Boolean Wrapper -+");
				answer = this.adding(integer); 
			}
			else if(this.positive == false && integer.positive == false) {
				//add
				answer = this.subtracting(integer);
				//answer.toString(); 
				//answer = new BigInt( answer.setAndRemoveSignIfItIsThere(bigInt)); 
			}
			BigInt FinalAnswer;
			
		if(this.bigArray.size()== integer.bigArray.size()  && this.positive==false && Math.abs(Integer.parseInt(this.bigInt)) > Math.abs(Integer.parseInt(integer.bigInt))) {
			 answer.positive = false; 
		 }
		 else if(integer.bigArray.size() == this.bigArray.size() && integer.positive==false && Math.abs(Integer.parseInt(integer.bigInt))> Math.abs(Integer.parseInt(this.bigInt))) {
			 answer.positive = false; 
		 }
		 if(this.positive == false && integer.positive == false) {
			 answer.positive = false; 
		 }
		 else if(integer.positive == false && integer.bigArray.size() > this.bigArray.size()) {
			 answer.positive=false;
		 }
		 else if(this.positive == false && this.bigArray.size() > integer.bigArray.size()) {
			 answer.positive=false;
		 }
			 
			//System.out.println(answer.bigInt);
			
			return FinalAnswer = new BigInt(answer);
			
		}
		public BigInt multiply(BigInt integer) {
			BigInt answer; 
			answer = this.multiplying(integer); 
			
			 if(this.bigArray.size()== integer.bigArray.size()  && this.positive==false && Math.abs(Integer.parseInt(this.bigInt)) > Math.abs(Integer.parseInt(integer.bigInt))) {
			 answer.positive = false; 
		 }
		 else if(integer.bigArray.size() == this.bigArray.size() && integer.positive==false && Math.abs(Integer.parseInt(integer.bigInt)) > Math.abs(Integer.parseInt(this.bigInt))) {
			 answer.positive = false; 
		 }
		 if(this.positive == false && integer.positive == false) {
			 answer.positive = false; 
		 }
		 else if(integer.positive == false && integer.bigArray.size() > this.bigArray.size()) {
			 answer.positive=false;
		 }
		 else if(this.positive == false && this.bigArray.size() > integer.bigArray.size()) {
			 answer.positive=false;
		 }
			 
			return answer; 
		}
		public BigInt divideBy(BigInt integer) {
			BigInt answer; 
			//Print("", this.bigArray); 
			answer = this.dividing(integer); 
			if( this.positive == false && integer.positive== true ) {
				answer.positive = false; 
			}
			else if(this.positive== false && integer.positive ==false) {
				answer.positive = true; 
			}
			else if(this.positive == true && integer.positive== false ) {
				answer.positive = false; 
			} 
			else if(this.positive == true && integer.positive==true ) {
				answer.positive = true; 
			}
			return answer; 
		}
		public BigInt modulus(BigInt integer) {
			BigInt answer ;
			answer = this.mode(integer); 
			if( this.positive == false && integer.positive== true ) {
				answer.positive = false; 
			}
			else if(this.positive== false && integer.positive ==false) {
				answer.positive = true; 
			}
			else if(this.positive == true && integer.positive== false ) {
				answer.positive = false; 
			} 
			else if(this.positive == true && integer.positive==true ) {
				answer.positive = true; 
			}
			return answer; 
		}
		private BigInt adding(BigInt integer){
			BigInt returnValue;  
			 ArrayList<Integer> answer = new ArrayList<Integer>();
			 int theLengthOfAnArray = 0; 
			 if(this.bigArray.size() > integer.bigArray.size()) {
				 theLengthOfAnArray = this.bigArray.size();
			   }
			 else {
				 theLengthOfAnArray = integer.bigArray.size();
			 }
			 int newValue = 0; 
			 int carrier = 0;
			 for(int index = 0; index < theLengthOfAnArray;index++) {
				 try {
				 if(this.bigArray.get(index) != null && integer.bigArray.get(index) != null) {
					 newValue = this.bigArray.get(index) + integer.bigArray.get(index);
					 if(carrier == 1) {
						 newValue = newValue + carrier; 
						 carrier = 0; 
					 }
					 if(newValue > 9) {
						 newValue = newValue - 10; 
						 carrier = 1; 
						 answer.add(index, newValue);
					 }
					 else {
						 answer.add(index, newValue); 
					 }
				 }
				 if ( index == theLengthOfAnArray-1 && carrier ==1){
					 newValue = newValue + 10; 
					 answer.remove(index); 
					 answer.add(index, newValue);					 
				 }
				 }
				 catch(Exception e){
					 
				 if(this.bigArray.size() > integer.bigArray.size()){
					 
					 newValue = this.bigArray.get(index); 
					 if(carrier == 1 ) {
						 newValue = newValue + 1; 
						 carrier = 0; 
					 }
					 answer.add(index, newValue);
	
				 }
				 else if (this.bigArray.size() < integer.bigArray.size()){
					 newValue = integer.bigArray.get(index); 
					 if(carrier == 1 ) {
						 newValue = newValue + 1; 
						 carrier = 0; 
					 }
					 answer.add(index, newValue);			 }
				 }
			 }
			 returnValue = new BigInt(answer); 
			 if(this.bigArray.size()== integer.bigArray.size()  && this.positive==false && Integer.parseInt(this.bigInt) > Integer.parseInt(integer.bigInt)) {
				 returnValue.positive = false; 
			 }
			 else if(integer.bigArray.size() == this.bigArray.size() && integer.positive==false && Integer.parseInt(integer.bigInt)> Integer.parseInt(this.bigInt)) {
				 returnValue.positive = false; 
			 }
			 if(this.positive == false && integer.positive == false) {
				 returnValue.positive = false; 
			 }
			 else if(integer.positive == false && integer.bigArray.size() > this.bigArray.size()) {
				 returnValue.positive=false;
			 }
			 else if(this.positive == false && this.bigArray.size() > integer.bigArray.size()) {
				 returnValue.positive=false;
			 }
				 
			 //System.out.println(answer);
			// System.out.println("returnValue its equals to "+ returnValue.toString());
			return returnValue ;
		}
	 private BigInt subtracting(BigInt integer) {
		 BigInt returnValue; 
		 ArrayList<Integer> answer = new ArrayList<Integer>();
		 int theLengthOfAnArray = 0; 
		 if(this.bigArray.size() > integer.bigArray.size()) {
			 theLengthOfAnArray = this.bigArray.size();
		 }
		 else {
			 theLengthOfAnArray = integer.bigArray.size();
		 }
		 int newValue = 0; 
		 int carrier = 0, otherIndex = 0, thisIndex= 0 ;
		 
		
		// int thisInteger = returnInteger(this.bigArray), otherInteger = returnInteger(integer.bigArray);
		 for(int index = 0; index < theLengthOfAnArray;index++) {
			 try {
			 	if(this.bigArray.get(index) !=null && integer.bigArray.get(index) != null) {
				  thisIndex = this.bigArray.get(index); 
				 	if(carrier != 0) {
				 		thisIndex = thisIndex-carrier; 
				 		carrier = 0;
				 	}
				 	otherIndex = integer.bigArray.get(index);
				 	
				 	if(thisIndex < otherIndex && index != theLengthOfAnArray - 1) {
				 		thisIndex = thisIndex + 10; 
				 		
				 		carrier = 1;
				 		newValue = thisIndex -otherIndex; 
				 		//System.out.println(thisIndex + " " + otherIndex + " " + newValue);
				 	}
				 	else {
				 		newValue = thisIndex - otherIndex;
				 	}
				 	
				 	
				 	
				 	answer.add(index,newValue); 
				 	//Print("Checking the value of subtract method", answer);
				 
			 	}
			 
			 	
			
			 	}
			 catch(IndexOutOfBoundsException Exception) {
				  if(this.bigArray.size() > integer.bigArray.size()) {
					  newValue = this.bigArray.get(index);
			 		if(carrier != 0 &&this.bigArray.get(index) == 0) {
			 			
			 			newValue = 9 ;
			 			answer.add(index, newValue); 
			 		//	System.out.println(newValue); 
	
			 		}
			 		else {
			 			if(carrier != 0) {
			 				answer.add(index, this.bigArray.get(index)-1);
			 				carrier = 0; 
			 			}
			 			else {
			 			answer.add(index, this.bigArray.get(index));
			 			}
			 		}	
			 		
				  }
				  else if(this.bigArray.size() < integer.bigArray.size()) {
					  newValue = integer.bigArray.get(index);
					  if(carrier != 0) {
				 			newValue = newValue - carrier; 
				 		}
							 
						 
				 		if(newValue < 0) {
					 		carrier = 1; 
					 		newValue = Math.abs(newValue);
					 		
					 	}
					 	answer.add(index,newValue); 
				  }
			 }
		 }
		 for(int index = 0; index < theLengthOfAnArray -1; index++) {
			 //System.out.println("Hello There");
			 if(answer.get(answer.size()-1) == 0) {
				 answer.remove(answer.size()-1); 
			 }
		 }
		 returnValue = new BigInt(answer); 
//		 if(this.bigArray.size()== integer.bigArray.size()  && this.positive==false && Integer.parseInt(this.bigInt) > Integer.parseInt(integer.bigInt)) {
//			 returnValue.positive = false; 
//		 }
//		 else if(integer.bigArray.size() == this.bigArray.size() && integer.positive==false && Integer.parseInt(integer.bigInt)> Integer.parseInt(this.bigInt)) {
//			 returnValue.positive = false; 
//		 }
//		 if(this.positive == false && integer.positive == false) {
//			 returnValue.positive = false; 
//		 }
//		 else if(integer.positive == false && integer.bigArray.size() > this.bigArray.size()) {
//			 returnValue.positive=false;
//		 }
//		 else if(this.positive == false && this.bigArray.size() > integer.bigArray.size()) {
//			 returnValue.positive=false;
//		 }
//		 
			
			 
		 return returnValue; 
	 	}
	 private BigInt multiplying(BigInt integer) {
		 //Print("This.bigArray value in multiplying method ",this.bigArray); 
		 //Print("integer.bigArray value in the multiplying method ",integer.bigArray); 
		 BigInt returnValue = new BigInt(0); 
		 ArrayList<Integer> answer = new ArrayList<Integer>(); 
		 ArrayList<Integer> denominatorAnswer = new ArrayList<Integer>(); 
		 ArrayList<Integer> passingArray = new ArrayList<Integer>(); 
		 int denominator, numerator = 0, newValue = 0,carrying; 
		
		 int i = 0, biggerArray=0, smallerArray =0;
		  if(this.bigArray.size() > integer.bigArray.size()) {
			 biggerArray = this.bigArray.size();
			 smallerArray = integer.bigArray.size();
			 
			  
		  }
		  else {
			  	 smallerArray = this.bigArray.size();
			  	 biggerArray = integer.bigArray.size(); 
		  }
		  for(int index = 0; index <biggerArray; index++) {
			  carrying = 0; 
			  denominatorAnswer.clear(); 
			//  Print("\n\n answer",answer);
		
			  passingArray = returnValue.bigArray; 
			  if(this.bigArray.size() > integer.bigArray.size()) {
				  denominator = this.bigArray.get(index);
				  
			  }
			  else {
				  denominator  = integer.bigArray.get(index); 
			  }
			  for(int innerIndex = 0; innerIndex < smallerArray; innerIndex++){
				  ; 
				  if(this.bigArray.size() > integer.bigArray.size()) {
					  numerator = integer.bigArray.get(innerIndex);
				  }
				  else {
					   numerator = this.bigArray.get(innerIndex);
				  }
				  newValue = numerator * denominator; 
				  if(carrying != 0) {
					  newValue = newValue + carrying;
					//  System.out.println("");
					  carrying = 0; 
				  }
				  if(newValue > 9) {
					  ArrayList<Integer> carryingValues = new ArrayList<Integer>(); 
					  carryingValues = carry(newValue); 
					  newValue = carryingValues.get(1); 
					  
					  carrying = carryingValues.get(0); 
					//  System.out.println("Carrying values " + carryingValues + ". newValues " +newValue);
				  }
				  
				  //answer.add(innerIndex, newValue);
				  
				  denominatorAnswer.add(innerIndex, newValue);
	//			  i++; 
				  //System.out.println("The value of newValue " + newValue);
				 
			  	}
			  if(carrying != 0) {
				  
				  denominatorAnswer.add(denominatorAnswer.size() , carrying); 
			  }
			  
//			  Print("This denominatorAnswer before it goes into arrayShift", denominatorAnswer);
//			  if(passingArray.isEmpty() == false ) {
//				  Print("answer Value before going into arrayShift", answer);
//			  }
			  passingArray= arrayShift(passingArray, denominatorAnswer,index);
			 // Print("\n\n variable answer value ",answer); 
			  returnValue  = new BigInt( passingArray); 
			  //denominatorAnswer.clear();
			
		  }
//		  if(this.positive==false && integer.positive ==false) {
//			  returnValue.positive = true; 
//		  }
//		  else if(this.positive == false || integer.positive ==false) {
//			  returnValue.positive = false; 
//		  }
//		  else {
//			  returnValue.positive =true;  
//					  }
		 // System.out.println("Multiplying returnValue " + returnValue);
		 // Print("this return Value of Multiplying method",answer);
			 return returnValue; 
	 }
	private BigInt mode(BigInt integer) {
			BigInt checker = new BigInt(0), previousChecker = new BigInt(0), 
					increase= new BigInt(0), previousIncrement = new BigInt(0), numerator = this,
					denominator = integer, answer = new BigInt(0); 
			int index = 0, i = 0; 
			if(this.bigArray.equals(integer.bigArray)) {
				System.out.println("They are Equals"); 
				return answer = new BigInt(0);
			} 
			else {
			ArrayList<BigInt> numeratorValues = new ArrayList<BigInt>(); 
				while(denominator.equalsOrGreater(numerator) == false) {
					increase = increment(index); 
					index ++; 
					checker = increase.multiply(denominator); 
					//System.out.println("This is checker Value " + checker);
					if (checker.greater(numerator) ==true) {
						System.out.println("Numerator value " + numerator + "\n previousChecker Value  " + previousChecker );
						numerator = numerator.subtracting(previousChecker); 
						index = 0; 
						numeratorValues.add(i, previousIncrement ); 
						
						i++;  
						System.out.println("dividing numerator value " + numerator);
						previousChecker = new BigInt(0);
						previousIncrement = new BigInt(0);  
						//System.exit(0);
					}
					
					previousIncrement = new BigInt(increase); 
					previousChecker = new BigInt(checker); 
	//				if(index == 8 ) {
	//					System.exit(0);
	//				}
				}
			
			}
			return numerator; 
		}
	private BigInt dividing(BigInt integer) {
		BigInt checker = new BigInt(0), previousChecker = new BigInt(0), 
				increase= new BigInt(0), previousIncrement = new BigInt(0), numerator = this,
				denominator = integer, answer = new BigInt(0); 
		int index = 0, i = 0; 
		if(this.bigArray.equals(integer.bigArray)) {
			System.out.println("They are Equals"); 
			return answer = new BigInt(1);
		}
		else {
		ArrayList<BigInt> numeratorValues = new ArrayList<BigInt>(); 
			while(denominator.equalsOrGreater(numerator) == false) {
				increase = increment(index); 
				index ++; 
				checker = increase.multiply(denominator); 
				//System.out.println("This is checker Value " + checker);
				if (checker.greater(numerator) ==true) {
					//System.out.println("Numerator value " + numerator + "\n previousChecker Value  " + previousChecker );
					numerator = numerator.subtracting(previousChecker); 
					index = 0; 
					numeratorValues.add(i, previousIncrement ); 
					
					i++;  
					System.out.println("dividing numerator value " + numerator);
					previousChecker = new BigInt(0);
					previousIncrement = new BigInt(0);  
					//System.exit(0);
				}
				
				previousIncrement = new BigInt(increase); 
				previousChecker = new BigInt(checker); 
//				if(index == 8 ) {
//					System.exit(0);
//				}
			}
		
		
		
			for(index = 0; index< numeratorValues.size(); index++ ) {
				//System.out.println("The Values inside the Array " + numeratorValues.get(index));
				 answer = answer.adding(numeratorValues.get(index));  
			}
		}
			System.out.println("The answer before return " + answer);
		return answer;
	}
	private boolean greater(BigInt integer) {
			return Math.abs(Integer.parseInt(this.toString())) > Math.abs(Integer.parseInt(integer.toString())); 
		}
	private boolean equalsOrGreater(BigInt integer) {
		return Math.abs(Integer.parseInt(this.toString())) >= Math.abs(Integer.parseInt(integer.toString())); 
	}
	private BigInt increment(int integer) {
		int answer=0;
		BigInt returnValue; 
		answer = (int) Math.pow(2, integer); 		
		return returnValue = new BigInt(answer); 
	}
	 private ArrayList<Integer> carry(int integer) {
		 ArrayList<Integer> answer = new ArrayList<Integer>();
		 String stringInt = String.valueOf(integer), tempCharValue;
		 char charValues; 
	//	System.out.println("Carrying values " + integer);
		 for(int index = 0; index< stringInt.length(); index++ ) {
			 charValues = stringInt.charAt(index); 
			 tempCharValue = String.valueOf(charValues);
			 answer.add(index, Integer.parseInt(tempCharValue));
		 }
		 
		 return answer; 
	 }
	 private ArrayList<Integer> arrayShift(ArrayList<Integer> numerator, ArrayList<Integer> denominator, int phaseShift){

		
		// for(int index = 0; index < denominator.size(); index++) {
			 
			 if(phaseShift ==0 && numerator.isEmpty()) {
				 
				 return denominator; 
			 }
			 else {
//				 System.out.println("This are the enter value into ArrayShift ");
//				 Print("This are the Entering Value of ArrayShift",numerator); 
//				 Print("",denominator); 
//				 
				denominator = reverse(denominator); 
				 for(int innerIndex = 0; innerIndex < phaseShift; innerIndex++) {
					  denominator.add(denominator.size(), 0); 
					  
				 }
				 denominator = reverse(denominator); 
				// Print("denominator after the shift has been added ",denominator); 
				 
				 BigInt b1 = new BigInt(numerator ); 
				 BigInt b2 = new BigInt(denominator); 
				 BigInt b3 ; 
				// System.out.println("b1 it equals to " + b1 + " b2 it equals to " + b2);

				 b3 = b1.add(b2); 
				// System.out.println("shift answer it is equals to " + b3);
				  
				 return b3.bigArray;
			 }
	 }
				 
	 private ArrayList<Integer> reverse(ArrayList<Integer> list) {
	     for(int i = 0, j = list.size() - 1; i < j; i++) {
	         list.add(i, list.remove(j));
	     }
	     return list;
	 }
		private void set(String stringInteger) {
			char location ; 
			
			String 	aSubstring =null ;
			for(int index = 0; index < stringInteger.length(); index++) {
				location = stringInteger.charAt(index) ;
				if (location == 43 && stringInteger.substring(0, 1).equals("+")) {
					if(stringInteger.length() ==1 ) {
						throw new StringInputErrorException(stringInteger + " its not a valid input" );
					}
					aSubstring = setAndRemoveSignIfItIsThere(stringInteger); 
					//System.out.println("Inside the + if Stateme aSubString value its equalas "+aSubstring);
					for(index = 0; index < aSubstring.length(); index++) {
						//System.out.println(location+" its a valid input");
						location = aSubstring.charAt(index);
						//System.out.println("testing inside + if Statement location is equals " + location);
						if (location < 48 || location > 57) {
							throw new StringInputErrorException(stringInteger + " its not a valid input" );
						}
						//return aSubstring; 
					}
					//bigArray.add(arrayIndex, setAndRemoveSignIfItIsThere(stringInteger)); 
					//arrayIndex++; 
				}
				else if (location == 45 && stringInteger.substring(0, 1).equals("-")) {
					positive = false; 
					if(stringInteger.length() == 1) {
						throw new StringInputErrorException(stringInteger + " its not a valid input" );
					}
					//System.out.println(location+" its a valid input");
					aSubstring = setAndRemoveSignIfItIsThere(stringInteger); 
					for(index = 0; index < aSubstring.length(); index++) {
					//	System.out.println(location+" its a valid input");
						location = aSubstring.charAt(index);
						if (location < 48 || location > 57) {
							throw new StringInputErrorException(stringInteger + " its not a valid input" );
						}
					
					}
					//bigArray.add(arrayIndex, setAndRemoveSignIfItIsThere(stringInteger)); 
					//arrayIndex++; 
				}
				else if (location < 48 || location > 57) {
					throw new StringInputErrorException(stringInteger + " its not a valid input" );
				}
				
			}
			char i;
			this.bigInt=stringInteger; 
			if(aSubstring !=null) {
				this.bigInt= aSubstring;
			}
		
			int arrayIndex = this.bigInt.length(); 
			for(int index = 0; index < this.bigInt.length(); index++) {
				arrayIndex = arrayIndex -1;
				//System.out.println(arrayIndex + this.bigInt.length());
				i = this.bigInt.charAt(arrayIndex); 
				this.bigArray.add(index,Character.getNumericValue(i));
			 
			}
	//		this.bigInt = stringInteger; 
	//		if(aSubstring !=null) {
	//			return aSubstring;
	//		}
	//		return stringInteger; 
		}
		private  String setAndRemoveSignIfItIsThere(String number) {
		
				if(number.substring(0,1).equals("+")) {
				//	System.out.println("Test one SetAndRemove method return value equals " + number.substring(1,number.length()));
					return number.substring(1,number.length()); 
					//bigArray.add( number.substring(1,number.length())); 
				}
				else if (number.substring(0,1).equals("-")) {
					//System.out.println("Test two SetAndRemove method return value equals " + number.substring(1,number.length()));
					return number.substring(1,number.length());
					//thnumber.substring(1,number.length()); 
				}
	//			try {
					if (this.positive ==false) {
					
					 number = "-" + number;
				 }
	
					return number; 
		}
		private void Print( String message , ArrayList<Integer> integer) {
			System.out.println(this.bigArray);
				String  newString= ""; 
				//BigInt b1; 
				 int i = integer.size() -1; 
				for(int index = 0; index < integer.size(); index++) {
					//System.out.println("The value of the array "+ String.valueOf(arrayString.get(i)));
					 newString = newString + String.valueOf(integer.get(i)); 
					i --; 
				}
				System.out.println(message + " " + newString );
		}
		private Integer returnInteger(ArrayList<Integer> integer){
			 int i = integer.size() -1, newValue = 0; 
			
				for(int index = 0; index < integer.size(); index++) {
					//System.out.println("The value of the array "+ String.valueOf(arrayString.get(i)));
					 newValue = newValue +  integer.get(i);
					i --; 
				}
			return newValue; 
		}
		public String toString() {
			if(this.positive == false) {
			
				this.bigInt = setAndRemoveSignIfItIsThere(this.bigInt);	
				
			}
			//System.out.println("toString what this? " + this.bigInt);
			return this.bigInt; 
		}
	 }//End Class
