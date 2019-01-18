
public class BigInt {
	
	private int bigInt; 
	private boolean positive = false; 
	public static void main(String args []) {
		BigInt b1; 
		b1 = new BigInt(" ss");
		b1.toString();
	}
	BigInt(){
		set("0"); 
	}
	BigInt(String integer){
		set(integer); 
	}
	private void set(String aBigInt) {
		try {
			if(aBigInt.substring(0,1).equals("-")) {
				positive = true; 
				this.bigInt = Integer.parseInt(aBigInt.substring(1,aBigInt.length())); 
				System.out.println("Testing set 1 " + this.bigInt);
			}
			else if (aBigInt.substring(0,1).equals("+")) {
				this.bigInt = Integer.parseInt(aBigInt.substring(1,aBigInt.length()));
				System.out.println("Testing set 2 " + this.bigInt);
			}
			else {
		
				this.bigInt = Integer.parseInt(aBigInt); 
				System.out.println("Testing set 3 " + this.bigInt);
			}
		}
		catch(Exception e) {
			System.out.println(aBigInt+" was written in the wrong format.");
			System.exit(0);
		}
	}
	public String toString() {
		if(positive == true) {
			return "-"+ String.valueOf(this.bigInt); 
		}
		return String.valueOf(this.bigInt); 
	}
	public BigInt add(BigInt anInteger) {
		
		return null; 
		}
	
}
