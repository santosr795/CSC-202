import java.security.cert.Extension;
import java.util.ArrayList;


public class LinkListPolynomial implements PolynomialInterface {
	private Node head =null ; 
	 ArrayList<LLNode> arrayPoly = new ArrayList<LLNode>(); 
	 
	
	LinkListPolynomial(String polynomial){
		set(polynomial); 
	}
	LinkListPolynomial(int data, int exponent){
		
	}
	LinkListPolynomial(){
		head =null; 
	}
	
	LinkListPolynomial(Node head){
		this.head= head; 
	}
	 public int length() {
		 int count = 0; 
		 Node position = head; 
		 while(position!= null) {
			 position = position.next; 
			 count++; 
		 }
		 return count; 
	 }
	/*
	public void addInTheBack(int data, int exponent ) {
		if(this.head ==null) {
			this.head = new Node(data, exponent); 
		}
		else {
			Node current = this.head; 
			while(current.next != null) {
				current = current.next; 
			}
			current.next = new Node(data, exponent);
		}
	}*/ 
	public void addNode(int data, int exponent) {
		if(head == null) {
		//	System.out.println("Data was added");
			head = new Node(data, exponent);
//			 System.out.println("if------------\nThe values inside current " + head.data +
//					 "\nThe exponent of current " + head.exponent);
		}
		else {
			int i = 0 ;
			Node current = head; 
			while(current.next != null) {
				 i++; 
//					 System.out.println("In side the while loop. This is what is inside current "
//							 + current.data + "\n exponent " + current.exponent); 
				current = current.next; 
		//		System.out.println("\n\nCurrent has been move " + i);
			}
		//	System.out.println(current.data +" " + current.exponent);
			 current.next= new Node(data, exponent );
			this.head = current; 
		}
	}
	/*
	 private class Node{
		 private String data ; 
		 private String coeffecient; 
		 private Node link; 
		  Node() {
			 this.data =""; 
			 this.link = null; 
			 
		 }
		  Node(String data) {
				 this.data =data; 
				 this.link = null; 
				 
			 }
		 Node(Node link, String data){
			 this.link = link; 
			 this.data = data; 
		 }
		 Node(Node link, String data, String coefficient ){
			 this.link = link; 
			 this.data = data; 
			 this.coeffecient = coefficient; 
		 }
	 }
	 public void addNode(String data, String coefficient) {
	
			  Node newNode = new Node(head, data,coefficient	); 
			  head = newNode; 
		 }
		*/
	public void prinLL() {
		Node position = head; 
		while(position != null) {
//			System.out.println("------------------------\nLINK LISTED VALUES"
//					+ "data value " + position.data + ""
//							+ "\nexponent value " + position.exponent + "\n-------------------" );
			position = position.next; 
		}
	}
		/*
	}	 
	 public LinkListPolynomial setHead(LinkListPolynomial other) {
		 head = other.head;
		 return head; 
	 }
	 */
	
	 /*
	 public Node getHead() {
		 return this.head; 
	 }
	
	 /*This is how you going to connect Nodes ArraySortedPolyNomial nodeA.next = nodeB; 
	  * (non-Javadoc)
	  * @see PolynomialInterface#add(PolynomialInterface)
	  */
	@Override
	public PolynomialInterface add(PolynomialInterface other) {
		LinkListPolynomial numbOne = (LinkListPolynomial)this; 
		LinkListPolynomial numbTwo = (LinkListPolynomial)other; 
		LinkListPolynomial answer; 
		answer = numbOne.add(numbTwo); 
		// TODO Auto-generated method stub
		return (PolynomialInterface)answer;
	}
	public void setNext() {
		Node newNode = head; 
		head = newNode.next; 
	}
	
	@SuppressWarnings("null")
	private LinkListPolynomial add(LinkListPolynomial other) {
		Node  current = null,otherNode = other.head, thisNode = this.head; 
		ArrayList<Integer > exponentArray= new ArrayList<Integer>(); 
		ArrayList<Integer> dataArray = new ArrayList<Integer>(); 
		LinkListPolynomial answer= new LinkListPolynomial(); 
		int exponent = 0, data = 0, i =0 ;
		
		while(otherNode.next !=null && thisNode.next != null) {
			//s ++; 
		//	System.out.println("\n\n\nNewNode other Exponent" + otherNode.getExponent()  
		//	+"\nNewNode this exponent " + thisNode.getExponent() );
		//	System.out.println(newNode.toString());
			if(thisNode.compareTo(otherNode)) {
				//System.out.println("IT made it this far when they are being add");
			//	System.out.println("------------------\nWhat is being added\n thisNode.data equals to " 
			//			+ thisNode.getData() + "\notherNode.data is equals to "
				//		+ otherNode.getData());
				data =thisNode.getData() + otherNode.getData(); 
				System.out.println("-----------------\ndata after being added " + 
				data); 
					exponent = thisNode.getExponent(); 
				if(thisNode.next != null) {
					thisNode = thisNode.next; 
				}
				if(otherNode.next != null) {
					
					otherNode = otherNode.next; 
				}
				
				
			}
			else if(thisNode.greater(otherNode)) {
			//	System.out.println("IT made it this far when the greater number is being add to a new Node");
					data = thisNode.getData(); 
					exponent = thisNode.getExponent(); 
					
				if(thisNode.next != null) {
					thisNode= thisNode.next; 
				}
			}
			else if (otherNode.greater(thisNode)){
					data = otherNode.getData(); 
					exponent = otherNode.exponent;
					
					if(otherNode.next != null) {
						otherNode = otherNode.next;
					}
				//current = new Node(other.getData(), other.getExponet());
				
			}
		
			
			
//			if(current ==null) {
//				System.out.println("else---------\notherNode.getData " + otherNode.getData()
//		+ "\notherNode.getExponet" + otherNode.getExponent());
//				current =new Node(data, exponent);
//				
//				System.out.println("else \n\ncomparig with Current the value that went in\ncurrent..getDAta" +
//				current.getData() + "\ncurrent.getExponent " + current.getExponent());
//			}
//			else {
//				while(current.next !=null) {
//					current = current.next; 
//				}
//				current.next = new Node (data, exponent);
//				 
//				System.out.println("else\n\ncomparig with Current the value that went in\ncurrent..getDAta" +
//						current.getData() + "\ncurrent.getExponent " + current.getExponent());
//			}
		//	System.out.println(i+" ---------\nData " + data + "\n------------\nExponent " + exponent);
			if(data != 0) {
			//	System.out.println("-------------Made it to the array----------");
				dataArray.add(i,data);
				exponentArray.add(i, exponent);
				i++;
				}
		//	data = 0; 
			//exponent = 0; 
			//newNode = newNode.next; 
			/*
					if(tempArray.get(index) !=0) {
				
				if(head == null) {
					head = new Node(tempArray.get(index), index);
//					 System.out.println("if------------\nThe values inside current " + head.data +
//							 "\nThe exponent of current " + head.exponent);
				}
				else {
					int i = 0 ;
					Node current = head; 
					while(current.next != null) {
						 i++; 
	//					 System.out.println("In side the while loop. This is what is inside current "
	//							 + current.data + "\n exponent " + current.exponent); 
						current = current.next; 
				//		System.out.println("\n\nCurrent has been move " + i);
					}
					 current.next= new Node(tempArray.get(index), index);
	//				 System.out.println("else------------\nThe values inside current " + current.next.data +
	//						 "\nThe exponent of current " + current.next.exponent+"\n--------------");
					
				}
			 */
		}
	//	System.out.println("\n\n\n\n"+dataArray+""
		//		+ "\n" + exponentArray);
		for(int index = 0; index < dataArray.size(); index++) {
			
			if(current ==null) {
				//System.out.println("dataArray.get " +dataArray.get(index) + "\nexponentArray" +exponentArray.get(index) );
				current = new Node(dataArray.get(index),exponentArray.get(index)); 
			}
			else {
				Node net = current; 
				while(net.next != null) {
					net = net.next; 
					
				}
			//	System.out.println("dataArray.get " +dataArray.get(index) + "\nexponentArray" +exponentArray.get(index) );

				net.next= new Node(dataArray.get(index),exponentArray.get(index)); 

			}
			
		}
		 answer = new LinkListPolynomial (current); 
		//System.out.println("answer" + this.length());
		answer.head =current; 
		answer.toString();
			//this.toString(); 
		return answer;
		
	}
	public Node getHead() {
		return this.head; 
	}
	private int getExponet() {
		return this.head.exponent; 
	}
	private int getData() {
		return this.head.data; 
	}
	private boolean compareTo(LinkListPolynomial other) {
	//	System.out.println(this.getExponet() + "\n" + other.getExponet());
		if(this.getExponet() == other.getExponet()) {
			return true;
		}
		return false;
		
	}
	private boolean greater(LinkListPolynomial other) {
		if(this.getExponet() < other.getExponet()) {
			return false;
		}
		return  true;
	}
	@Override
	public PolynomialInterface subtract(PolynomialInterface other) {
		LinkListPolynomial numbOne = (LinkListPolynomial)this; 
		LinkListPolynomial numbTwo = (LinkListPolynomial)other; 
		LinkListPolynomial answer; 
		answer = numbOne.subtract(numbTwo); 
		// TODO Auto-generated method stub
		return (PolynomialInterface)answer;
	}
	private LinkListPolynomial subtract(LinkListPolynomial other ) {
		Node  current = null,otherNode = other.head, thisNode = this.head; 
		ArrayList<Integer > exponentArray= new ArrayList<Integer>(); 
		ArrayList<Integer> dataArray = new ArrayList<Integer>(); 
		LinkListPolynomial answer= new LinkListPolynomial(); 
		int exponent = 0, data = 0, i =0 ;
		
		while(otherNode !=null && thisNode != null) {
			//s ++; 
		//	System.out.println("\n\n\nNewNode other Exponent" + otherNode.getExponent()  
		//	+"\nNewNode this exponent " + thisNode.getExponent() );
		//	System.out.println(newNode.toString());
			if(thisNode.compareTo(otherNode)) {
				//System.out.println("IT made it this far when they are being add");
			//	System.out.println("------------------\nWhat is being added\n thisNode.data equals to " 
			//			+ thisNode.getData() + "\notherNode.data is equals to "
				///		+ otherNode.getData());
				if(otherNode.getData() < 0) {
					data = thisNode.getData() + Math.abs(otherNode.getData()); 
				}
				else {
						data =thisNode.getData() - otherNode.getData(); 
				}
				
			
		//		System.out.println("-----------------\ndata after being added " + 
		//		data); 
					exponent = thisNode.getExponent(); 
				if(thisNode != null) {
					thisNode = thisNode.next; 
				}
				if(otherNode.next != null) {
					
					otherNode = otherNode.next; 
				}
				
				
			}
			else if(thisNode.greater(otherNode)) {
			//	System.out.println("IT made it this far when the greater number is being add to a new Node");
					data = thisNode.getData(); 
					exponent = thisNode.getExponent(); 
					
				if(thisNode.next != null) {
					thisNode= thisNode.next; 
				}
			}
			else if (otherNode.greater(thisNode)){
					data = otherNode.getData(); 
					exponent = otherNode.exponent;
					
					if(otherNode.next != null) {
						otherNode = otherNode.next;
					}
				//current = new Node(other.getData(), other.getExponet());
				
			}
		
			
		
		//	System.out.println(i+" ---------\nData " + data + "\n------------\nExponent " + exponent);
			if(data != 0) {
			//	System.out.println("-------------Made it to the array----------");
				dataArray.add(i,data);
				exponentArray.add(i, exponent);
				i++;
				}
			data = 0; 
			exponent = 0; 
			
		}
	//	System.out.println("\n\n\n\n"+dataArray+""
	//			+ "\n" + exponentArray);
		for(int index = 0; index < dataArray.size(); index++) {
			
			if(current ==null) {
		//		System.out.println("dataArray.get " +dataArray.get(index) + "\nexponentArray" +exponentArray.get(index) );
				current = new Node(dataArray.get(index),exponentArray.get(index)); 
			}
			else {
				Node net = current; 
				while(net.next != null) {
					net = net.next; 
					
				}
		//		System.out.println("dataArray.get " +dataArray.get(index) + "\nexponentArray" +exponentArray.get(index) );

				net.next= new Node(dataArray.get(index),exponentArray.get(index)); 

			}
			
		}
		 answer = new LinkListPolynomial (current); 
	//	System.out.println("answer" + this.length());
		answer.head =current; 
		answer.toString();
			//this.toString(); 
		return answer;
				//this.toString(); 
	}
	
	@Override
	public void readPolynomial() {
		
		
	}
	public String toString() {
		Node position2 = this.head; 
		String answer = "0"; 
	//	System.out.println("------------\nThis is the length in the toString() " + this.length());
		while(position2 != null) {
			if(position2.data < 0) {
				if(position2.exponent ==0) {
					answer = answer +position2.data;
				}
				else {
					answer = answer +position2.data+"x^"+position2.exponent; 
				}
			}	
			else{
				if(position2.exponent ==0) {
					answer = answer +"+"+position2.data;
				}
				else {
					answer = answer +"+"+position2.data+"x^"+position2.exponent; 
				}
			}
			
				
				
			position2 = position2.next; 
	}
		char plus =5 ; 
		if(answer.length() !=1) {
			plus = answer.charAt(1); 
			
		}
		
		if(plus ==43) {
			answer = answer.substring(2, answer.length()-1);
		}
	//	System.out.println("This is the answer toString " + answer);
		return answer; 
	}
	@SuppressWarnings("null")
	private  void set(String string) 	{
	
		ArrayList<Integer> tempArray = new ArrayList<Integer>(); 
//		System.out.println("Setting a new string ");
		int position = 0, value = 0,slider =0; 
		char variable; 
		String part, newString, holder; 
		
		for(int index = 0; index < string.length(); index ++) {
			variable = string.charAt(index);
			
			if(variable == 94) {
				
				part = string.substring(0, index);
			//	System.out.println(part + " ^ ");
				int innerSlider = 0; 
				for(int innerIndex =0; innerIndex < part.length(); innerIndex++) {
					variable = part.charAt(innerIndex); 
					if(variable > 58) {
					//	System.out.println(part);
						part = part.substring(0, index-1); 
					//	System.out.println(part+" inner Value ");
						value = Integer.parseInt(part); 
						}
					}
					part = string.substring(index+1, string.length()); 
					int innerIndex = 0; 
					boolean fall = true; 
					//System.out.println(part + " Parts ");
					if(part.length() != 1) {
						if(1 == part.length()-1) {
							//	System.out.println(string +"lol");
								value= Integer.parseInt(string.substring(1,2)); 
								position = Integer.parseInt(part);
								if(tempArray.size() == 0 ) {
									for(int arrayIndex =0; index < position+1;index++) {
										tempArray.add(arrayIndex, 0); 
									}
								}
								else if(position   >tempArray.size()) {
									for(int arrayIndex = tempArray.size(); index < position+1; index++) {
										tempArray.add(arrayIndex, 0); 
									}
									//this.arrayPoly=this.expendArray(position+1); 
								}
//								System.out.println("adding " + value +" to position " +
//								position + "\nLocation One \n------------------" );
								tempArray.remove(position);
								tempArray.add(position, value); 
								string = "0"; 
								position = 0; 
								value = 0;
								fall = false;
								//System.exit(0);
				
								 
							}
						while(fall){
//							System.out.println(part);
							variable = part.charAt(innerIndex); 
							if(variable == 43) {
								
								part = part.substring(0,innerIndex); 
								if(innerIndex == 3) {
									string = string.substring(index+4, string.length()); 
								}
								else if(innerIndex == 2) {
									string = string.substring(index+3, string.length()); 
								}
								else if(innerIndex ==1) {
									string = string.substring(index+2, string.length()); 
								}
								index =0;
								//string = string.substring(index+2, string.length()); 
							/*	System.out.println("Finding position and the rest of the formula " + part +" " + string);
								System.out.println("This is the size of innerIndex " + innerIndex);
								System.out.println("position of index" + index);
								*/
								fall = false; 
								position = Integer.parseInt(part); 
								//System.out.println("Position "+ position + " \nvalue " + value +" before going");
								if(tempArray.size() == 0 ) {
									for(int arrayIndex =0; index < position+1;index++) {
										tempArray.add(arrayIndex, 0); 
									}
								}
								else if(position   >tempArray.size()) {
									for(int arrayIndex = tempArray.size(); index < position+1; index++) {
										tempArray.add(arrayIndex, 0); 
									}
									//this.arrayPoly=this.expendArray(position+1); 
								}
//								System.out.println("adding " + value +" to position " +
//								position + "\nLocation One \n------------------" );
								tempArray.remove(position);
								tempArray.add(position, value); 
								position = 0; 
								value = 0;
								//System.out.println(arrayPoly); 
							}
							else if(variable == 45) {
								//System.out.println("Inside the while look whats the value of part " + part);
								part = part.substring(0,innerIndex); 
								if(innerIndex == 3) {
									string = string.substring(index+4, string.length());
									//System.out.println("New String after cutting " + string);
								}
								else if(innerIndex == 2) {
									string = string.substring(index+3, string.length()); 
								}
								else if(innerIndex ==1) {
									string = string.substring(index+2, string.length()); 
								}
								index =0;

								//System.out.println("This is the size of innerIndex " + innerIndex);
								//System.out.println("position of index" + index);
								//string = string.substring(index+2, string.length()); 
								//System.out.println("Finding position and the rest of the formula " + part +" \nstring " + string);
								fall = false; 
								position = Integer.parseInt(part); 
								
							//	System.out.println(this.getSize());
								if(tempArray.size() == 0 ) {
									for(int arrayIndex =0; index < position+1;index++) {
										tempArray.add(arrayIndex, 0); 
									}
								}
								else if(position   >tempArray.size()) {
									for(int arrayIndex = tempArray.size(); index < position+1; index++) {
										tempArray.add(arrayIndex, 0); 
									}
									//this.arrayPoly=this.expendArray(position+1); 
								}
						//		System.out.println(tempArray.size());
//								System.out.println("adding " + value +" to position " +
//								position +"\nLocation Two\n------------------");

//								System.out.println("Position "+ position + " \nvalue " + value +" before going");
								tempArray.remove(position);
								tempArray.add(position, value); 
								position = 0; 
								value = 0;
								//System.out.println(arrayPoly); 

							}
							innerIndex++; 
						
						}
						//System.out.println("Position "+ position  " value " + value " before going");
//						position = Integer.parseInt(part); 
//						System.out.println("Position "+ position + " \nvalue " + value +" before going");
//
//					
					}
					else {
						position = Integer.parseInt(part); 
					//	System.out.println("Position "+ position+  " value " + value+ " before going");
						if(tempArray.size() == 0 ) {
							for(int arrayIndex =0; index < position+1;index++) {
								tempArray.add(arrayIndex, 0); 
							}
						}
						else if(position   >tempArray.size()) {
							for(int arrayIndex = tempArray.size(); index < position+1; index++) {
								tempArray.add(arrayIndex, 0); 
							}
							//this.arrayPoly=this.expendArray(position+1); 
						}
//						System.out.println("adding " + value +" to position " + 
//						position +"\nLocation three\n------------------" );

						tempArray.remove(position);
						tempArray.add(position, value); 
						position = 0; 
						value = 0;
					}
						if(index  == string.length()) {
				}
						index =0; 
				//System.out.println("new String after if " + string );
				}//End IF 
			
				else if(variable == 45 && index != 0 || variable == 43 && index !=0) {
					part = string.substring(0, index);

					for(int innerIndex =0; innerIndex < part.length(); innerIndex++) {
						variable = part.charAt(innerIndex); 
						if(variable > 58) {
					//		System.out.println(part);
							part = part.substring(0, index-1); 
					//		System.out.println(part+" else iner inner");
							value = Integer.parseInt(part); 
							
							}
						}
//					System.out.println("adding " + value +" to position " + position
//							+"\nLocation four\n------------------");
					if(tempArray.isEmpty()) {
						for(int arrayIndex =0; index < 2;index++) {
							tempArray.add(arrayIndex, 0); 
						}
					}
					tempArray.remove(1); 
					tempArray.add(1,value);
					char sign = string.charAt(0); 
					if(sign ==43) {
						value = Integer.parseInt(string.substring(index, string.length()));
					}
					else {
					value = Integer.parseInt(string.substring(index, string.length()));
					}
//					System.out.println("adding " + value +" to position " + position 
//							+"\nLocation five\n------------------");

					tempArray.remove(0); 
					tempArray.add(0, value);
				}//End if else	
				
	//		System.out.println(variable);
		//			System.out.println("Reee");	 
					try {
					
						char sign = string.charAt(0); 
						if(sign ==43) {
							value = Integer.parseInt(string);
						}
						else {
						value = Integer.parseInt(string);
						}
//						System.out.println("adding " + value +" to position " + position 
//								+"\nLocation six\n------------------");
						
						if(tempArray.isEmpty()) {
							tempArray.add(0, Integer.parseInt(string));
						}
						else {
							tempArray.remove(0); 
							tempArray.add(0, value);
						}
						}
					
					
					catch(NumberFormatException exception ) {
						
					}

			
			}//End For() loop. 
//			System.out.print("set Method final answer for the array"+tempArray +"\n");
		

		for(int index = tempArray.size()-1; index > -1; index--) {
			
			if(tempArray.get(index) !=0) {
				
				if(head == null) {
					head = new Node(tempArray.get(index), index);
//					 System.out.println("if------------\nThe values inside current " + head.data +
//							 "\nThe exponent of current " + head.exponent);
				}
				else {
					int i = 0 ;
					Node current = head; 
					while(current.next != null) {
						 i++; 
	//					 System.out.println("In side the while loop. This is what is inside current "
	//							 + current.data + "\n exponent " + current.exponent); 
						current = current.next; 
				//		System.out.println("\n\nCurrent has been move " + i);
					}
					 current.next= new Node(tempArray.get(index), index);
	//				 System.out.println("else------------\nThe values inside current " + current.next.data +
	//						 "\nThe exponent of current " + current.next.exponent+"\n--------------");
					
				}
			}

			 
			
			
			}

		
		Node position2 = this.head; 
			
			while(position2.next != null) {
//				System.out.println("-------------\n\n\n\n\n\n\n This is the data in side the Linked LIst\n " + position2.data +
//						"\nThis is the Exponent of the Data\n"	+ position2.exponent);
				position2 = position2.next; 
		}
			if(position2.data != tempArray.get(0)) {
				if(tempArray.get(0) != 0) {
				position2.next = new Node(tempArray.get(0) , 0); 
				}
			}
//		System.out.println(tempArray);
	
	}//End set(String data)
}

