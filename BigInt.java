import java.util.*;
public class BigInt {
	private ArrayList <String> bigArray = new ArrayList<String>(); 
	private String bigInt; 
	private int arrayIndex = 0; 
	private Boolean positive;
	public static void main(String args []) {
		//BigInt b1 = new BigInt("1000000");
		//BigInt b1 = new BigInt("+0");
		//BigInt b1 = new BigInt("-0");
		//BigInt b1 = new BigInt("+");// error
		//BigInt b1 = new BigInt("-");// error
		BigInt b1 = new BigInt(	"-44444444445555555555666666666677777777770000000000");
		System.out.println("b1 it " +b1);
	}
	BigInt(String stringInteger){
		char location ; 
		String 	aSubstring =null ;
		for(int index = 0; index < stringInteger.length(); index++) {
			location = stringInteger.charAt(index);
			if (location == 43 && stringInteger.substring(0, 1).equals("+")) {
				if(stringInteger.length() ==1 ) {
					throw new StringInputErrorException(stringInteger + " its not a valid input" );
				}
				positive = new Boolean(true); 
				aSubstring = setAndRemoveSignIfItIsThere(stringInteger); 
				System.out.println("Inside the + if Stateme aSubString value its equalas "+aSubstring);
				for(index = 0; index < aSubstring.length(); index++) {
					System.out.println(location+" its a valid input");
					location = aSubstring.charAt(index);
					System.out.println("testing inside + if Statement location is equals " + location);
					if (location < 48 || location > 57) {
						throw new StringInputErrorException(stringInteger + " its not a valid input" );
					}
				}
				//bigArray.add(arrayIndex, setAndRemoveSignIfItIsThere(stringInteger)); 
				//arrayIndex++; 
			}
			else if (location == 45 && stringInteger.substring(0, 1).equals("-")) {
				positive = new Boolean(false); 
				if(stringInteger.length() == 1) {
					throw new StringInputErrorException(stringInteger + " its not a valid input" );
				}
				System.out.println(location+" its a valid input");
				aSubstring = setAndRemoveSignIfItIsThere(stringInteger); 
				for(index = 0; index < aSubstring.length(); index++) {
					System.out.println(location+" its a valid input");
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
		this.bigInt = stringInteger; 
		if(aSubstring !=null) {
			this.bigInt= aSubstring;
		}
		
		bigArray.add(arrayIndex, this.bigInt); 
		arrayIndex++; 
		System.out.println("it should End here " + this.bigInt);
		//System.exit(0);
	}
//	private void set(String aBigInt) {
//		try {
//			if(aBigInt.substring(0,1).equals("-")) {
//				positive = false; 
//				aBigInt = setAndRemoveSignIfItIsThere(aBigInt);  
//				System.out.println("Testing set one " + this.bigInt);
//			}
//			else if (aBigInt.substring(0,1).equals("+")) {
//				aBigInt = setAndRemoveSignIfItIsThere(aBigInt);  
//				System.out.println("Testing set two " + this.bigInt);
//			}
//			else {
//		
//				this.bigInt = Integer.parseInt(aBigInt); 
//				System.out.println("Testing set three " + this.bigInt);
//			}
//		}
//		catch(Exception e) {
//			System.out.println(aBigInt+" was written in the wrong format.");
//			System.exit(0);
//		}
//	}
	BigInt(ArrayList<String> arrayString){
		String  newString= null; 
		BigInt b1; 
		for(int index = 0; index < arrayString.size(); index++) {
			newString  = arrayString.get(index); 
			b1 = new BigInt(newString);
		}
		
	}
	BigInt(BigInt integer){
		
		BigInt b1 = new BigInt(integer.toString()); 
	}
	BigInt(int Integer){
		new BigInt(String.valueOf(Integer));
		
		
	}
	private  String setAndRemoveSignIfItIsThere(String number) {
		int integerNum;
			if(number.substring(0,1).equals("+")) {
				System.out.println("Test one SetAndRemove method return value equals " + number.substring(1,number.length()));
				return number.substring(1,number.length()); 
				//bigArray.add( number.substring(1,number.length())); 
			}
			else if (number.substring(0,1).equals("-")) {
				System.out.println("Test two SetAndRemove method return value equals " + number.substring(1,number.length()));
				return number.substring(1,number.length());
				//thnumber.substring(1,number.length()); 
			}
			try {
				if (positive.booleanValue()==false) {
				
				 return "-" + number;
			 }
			 else if (positive.booleanValue()==true) {
					return "+" + number; 
				}
			}
			catch(Exception e) {
				try {			
					if (positive.booleanValue()==true) {
					return "+" + number; 
					}
				}	
					catch(Exception r) {
						return number; 
					}
			
			}
			System.out.println("Test final SetAndRemove method default return value equals " + number.substring(1,number.length()));
				return number; 
	}
	public String toString() {
		if(!positive.equals("null")){
			this.bigInt = setAndRemoveSignIfItIsThere(this.bigInt);
		}
		return this.bigInt; 
	}
	public BigInt add(BigInt anInteger) {
		
		return null; 
		}
	
}
