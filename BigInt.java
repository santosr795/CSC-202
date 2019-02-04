 import java.util.*;
public class BigInt {
	private ArrayList <Integer> bigArray = new ArrayList<Integer>(); 
	private String bigInt; 
	private int arrayIndex = 0; 
	private boolean positive = true;
	public static void main(String args []) {
		//BigInt b1 = new BigInt("1000000");
		//BigInt b1 = new BigInt("+0");
		//BigInt b1 = new BigInt("-0");
		//BigInt b1 = new BigInt("+");// error
		//BigInt b1 = new BigInt("-");// error
		BigInt b1 = new BigInt(	"990");
		System.out.println("b1 it " +b1);
		BigInt b2 = new BigInt("31"); 
		BigInt b3; 
		b3 = b1.subtract(b2);
		System.out.println("b3 it " +b3);
	}
	BigInt(String stringInteger){
		set(stringInteger); 
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
	BigInt(ArrayList<Integer> arrayString){
		String  newString= ""; 
		BigInt b1; 
		 int i = arrayString.size() -1; 
		for(int index = 0; index < arrayString.size(); index++) {
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
		new BigInt(String.valueOf(Integer));
		
		
	}
	private  String setAndRemoveSignIfItIsThere(String number) {
		int integerNum;
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
//			 else if (positive.booleanValue()==true) {
//					return "+" + number; 
//				}
//			}
//			catch(Exception e) {
//				try {			
//					if (positive.booleanValue()==true) {
//					return "+" + number; 
//					}
//				}	
//					catch(Exception r) {
//						return number; 
//					}
//			
//			}
			System.out.println("Test final SetAndRemove method default return value equals " + number.substring(1,number.length()));
				return number; 
	}
	public String toString() {
		if(this.positive == false) {
		
			this.bigInt = setAndRemoveSignIfItIsThere(this.bigInt);
	}
		return this.bigInt; 
	}
	public BigInt add(BigInt anInteger) {
		BigInt answer = null; 
		//if(this.bigArray.size() <= bigArray.size()) {
			System.out.println("Testing add compering sizes");
			System.out.println("Value of this.positive " + String.valueOf(this.positive) + "\nValue of other positive " + String.valueOf(anInteger.positive));
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
			
		//}
//		else if(this.bigArray.size() >= bigArray.size()) {
//			if(this.positive == true && anInteger.positive == true ) {
//				System.out.println("Checking Boolean Wrapper ++");
//			}
//			else if (this.positive == true && anInteger.positive == false) {
//				System.out.println("Checking Boolean Wrapper +-");
//			}
//			else if(this.positive == false && anInteger.positive == true) {
//				System.out.println("Checking Boolean Wrapper -+");
//			}
//			else if(this.positive == false && anInteger.positive == false) {
//				System.out.println("Checking Boolean Wrapper --");
//			}
//		}
		BigInt FinalAnswer;
		System.out.println(answer.bigInt);
		return FinalAnswer = new BigInt(answer); 
		}
	public BigInt subtract(BigInt anInteger) {
		BigInt answer = null; 
		if(this.positive == true && anInteger.positive == true ) {
			//add
			//System.out.println("Checking Boolean Wrapper ++");
			answer = this.subtracting(anInteger);
		}
		else if (this.positive == true && anInteger.positive == false) {
			//Subtract
				answer =this.adding(anInteger); 
				//System.out.println("Checking Boolean Wrapper +-");
		}
		else if(this.positive == false && anInteger.positive == true) {
			//subtract
			//System.out.println("Checking Boolean Wrapper -+");
			answer = this.adding(anInteger); 
		}
		else if(this.positive == false && anInteger.positive == false) {
			//add
			answer = this.subtracting(anInteger);
			//answer.toString(); 
			//answer = new BigInt( answer.setAndRemoveSignIfItIsThere(bigInt)); 
		}
		BigInt FinalAnswer;
		System.out.println(answer.bigInt);
		return FinalAnswer = new BigInt(answer);
		
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
				 newValue = this.bigArray.get(index); 
				 if(carrier == 1 ) {
					 newValue = newValue + 1; 
					 carrier = 0; 
				 }
				 answer.add(index, newValue);			 }
			 }
		 }
		 returnValue = new BigInt(answer); 
		 if(this.positive == false && integer.positive == false) {
			 returnValue.positive = false; 
		 }
			 
		 //System.out.println(answer);
		 System.out.println("returnValue its equals to "+ returnValue.toString());
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
	 int carrier = 0;
	 for(int index = 0; index < theLengthOfAnArray;index++) {
		 try {
		 if(this.bigArray.get(index) != null && integer.bigArray.get(index) != null) {
			 newValue = this.bigArray.get(index) - integer.bigArray.get(index);
			 if(carrier == 1) {
				 newValue = newValue - carrier; 
				 carrier = 0; 
			 }
			 if(newValue <0) {
				 newValue = newValue + 10; 
				 carrier = 1; 
				 answer.add(index, newValue);
			 }
			  
			 else {
				 answer.add(index, newValue); 
			 }
		 }
		 if ( index == theLengthOfAnArray-1 && carrier ==1){
			 newValue = newValue - 10; 
			 answer.remove(index); 
			 answer.add(index, newValue);	
			 carrier =0; 
		 }
		
		 
		 }
		 catch(Exception e){
			 
		 if(this.bigArray.size() > integer.bigArray.size()){
			 
			 newValue = this.bigArray.get(index); 
			 if(carrier == 1 ) {
				 newValue = newValue - 1; 
				 carrier = 0; 
			 }
			 answer.add(index, newValue);

		 }
		 else if (this.bigArray.size() < integer.bigArray.size()){
			 newValue = this.bigArray.get(index); 
			 if(carrier == 1 ) {
				 newValue = newValue - 1; 
				 carrier = 0; 
			 }
			 answer.add(index, newValue);			 }
		 }
	 }
	 returnValue = new BigInt(answer); 
	 if(this.bigArray.size() > integer.bigArray.size() && this.positive == false) {
		 returnValue.positive = false; 
	 }
	 else if(integer.bigArray.size() > this.bigArray.size() && this.positive == false) {
		 returnValue.positive = false; 
	 }
		 
	 return returnValue;
 	}
 }//End Class
