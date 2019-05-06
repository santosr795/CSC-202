
public class Node {
	Node next; 
	int data; 
	int exponent;
	
	public Node(int data, int exponent ){
		this.data = data; 
		this.exponent = exponent; 
	}
	Node(){
		
	}
	public int length() {
		int i =0;
		while(this.next == null) {
			next = next.next; 
			i++; 
		}
		return i; 
	}
	
	public void add(int data, int exponent ) {
		if(next==null) {
			this.next = new Node(data, exponent); 
		}
		else {
			Node current = this.next; 
			while(current.next != null) {
				current = current.next; 
			}
			current.next = new Node(data, exponent);
		}
	}
	public boolean greater(Node other) {
		if(this.exponent > other.exponent) {
			return true;
		}
		return false; 
	}
	public boolean compareTo(Node other) {
		return this.exponent == other.exponent; 
	}
	public int getData() {
		return this.data; 
	}
	public int getExponent() {
		return this.exponent;
	}
	public void setData(int data) {
		this.data = data;
	}
	public void setExponent(int exponent) {
		this.exponent = exponent; 
	}
	public Node getNext() {
		return this.next; 
	}
	public void setNext(Node next) {
		this.next = next; 
	}
	
}
