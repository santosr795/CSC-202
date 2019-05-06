import java.util.*;	

public class ArraySortedPolynomial implements PolynomialInterface {
 
	private Node head = null ; 

	 ArrayList<Node> arrayPoly = new ArrayList<Node>(); 


	
	 public int length() {
		 int count = 0; 
		 Node position = head; 
		 while(head != null) {
			 position = position.next; 
			 count++; 
		 }
		 return count; 
	 }
	 public Node getHead() {
		 return this.head; 
	 }
	 ArraySortedPolynomial(String string){
		 set(string); 
	 }
	 /*This is how you going to connect Nodes ArraySortedPolyNomial nodeA.next = nodeB; 
	  * (non-Javadoc)
	  * @see PolynomialInterface#add(PolynomialInterface)
	  */
	@Override
	public PolynomialInterface add(PolynomialInterface other) {
		ArraySortedPolynomial numb1 = (ArraySortedPolynomial)this; 
		ArraySortedPolynomial numb2 = (ArraySortedPolynomial)other; 
		ArraySortedPolynomial numb3; 
		numb3 = numb1.add(numb2);
		// TODO Auto-generated method stub
		return (PolynomialInterface)numb3;
	}
	private ArraySortedPolynomial add(ArraySortedPolynomial other ) {
		ArrayList <Node> tempArray = new ArrayList<Node>(); 
		Node thisNode = this.arrayPoly.get(0), otherNode = other.arrayPoly.get(0);
		int length = 0;
		if(this.getSize() >= other.getSize()) {
			
			length = this.getSize(); 
		}
		else {
			length = other.getSize();
		}
		boolean fall =true; 
		int thisIndex = 0, otherIndex = 0, data = 0, exponent = 0, arrayIndex = 0; 
		while(thisNode!= null && otherNode != null) { 
			if(thisIndex == 0 && otherIndex == 0) {
				thisNode = this.arrayPoly.get(0);
				otherNode = other.arrayPoly.get(0);
				thisIndex++; 
				otherIndex++; 
			}
			else {
				if(thisIndex < this.getSize()) {
				thisNode = this.arrayPoly.get(thisIndex);
				thisIndex++;
				}
				if(otherIndex < other.getSize()) {
				otherNode = other.arrayPoly.get(otherIndex);
				otherIndex++; 

				}
			}
			if(thisNode.compareTo(otherNode)) {
				//System.out.println("IT made it this far when they are being add");
//				System.out.println("------------------\nWhat is being added\n thisNode.data equals to " 
//						+ thisNode.getData() + "\notherNode.data is equals to "
//						+ otherNode.getData());
				data =thisNode.getData() + otherNode.getData(); 
		//		System.out.println("-----------------\ndata after being added " + 
		//		data); 
					exponent = thisNode.getExponent(); 
				if(thisNode != null) {
					thisNode = thisNode.next; 
				}
				if(otherNode.next != null) {
					
					otherNode = otherNode.next; 
				}
			//	System.out.println("This is data" + data + "\nexponent " +exponent);

				
			//	thisIndex++; 
				//otherIndex++; 
			}
			else if(thisNode.greater(otherNode)) {
				//System.out.println("IT made it this far when the greater number is being add to a new Node");
					
					data = thisNode.getData(); 
					exponent = thisNode.getExponent(); 
			//		System.out.println("This is data" + data + "\nexponent " +exponent);
					
				
			//	thisIndex++; 
				
			}
			else if (otherNode.greater(thisNode)){
					data = otherNode.getData(); 
					exponent = otherNode.exponent;
					
				//	System.out.println("This is data" + data + "\nexponent " +exponent);
			//		otherIndex++; 
				//current = new Node(other.getData(), other.getExponet());
				
			}
			if(data != 0) {
				Node tempNode = new Node(data, exponent); 
				tempArray.add(arrayIndex , tempNode); 
				arrayIndex++; 
				data= 0; 
				exponent = 0;
								
			}
		
			 
			if(thisIndex < this.getSize() && otherIndex < other.getSize()) {
				thisNode = null; 
				otherNode = null; 
			}
			
		}
//		System.out.println(tempArray.size() + " add Array");
		return other; 
	}
	@Override
	public PolynomialInterface subtract(PolynomialInterface other) {
			ArraySortedPolynomial numb1 = (ArraySortedPolynomial)this; 
		ArraySortedPolynomial numb2 = (ArraySortedPolynomial)other; 
		ArraySortedPolynomial numb3; 
		numb3 = numb1.subtract(numb2);
		// TODO Auto-generated method stub
		return (PolynomialInterface)numb3; 
	}
	private ArraySortedPolynomial subtract(ArraySortedPolynomial other ) {
		ArrayList <Node> tempArray = new ArrayList<Node>(); 
		Node thisNode = this.arrayPoly.get(0), otherNode = other.arrayPoly.get(0);
		int length = 0;
		if(this.getSize() >= other.getSize()) {
			
			length = this.getSize(); 
		}
		else {
			length = other.getSize();
		}
		boolean fall =true; 
		int thisIndex = 0, otherIndex = 0, data = 0, exponent = 0, arrayIndex = 0; 
		while(thisNode!= null && otherNode != null) { 
			if(thisIndex == 0 && otherIndex == 0) {
				thisNode = this.arrayPoly.get(0);
				otherNode = other.arrayPoly.get(0);
				thisIndex++; 
				otherIndex++; 
			}
			else {
				if(thisIndex < this.getSize()) {
				thisNode = this.arrayPoly.get(thisIndex);
				thisIndex++;
				}
				if(otherIndex < other.getSize()) {
				otherNode = other.arrayPoly.get(otherIndex);
				otherIndex++; 

				}
			}
			if(thisNode.compareTo(otherNode)) {
				//System.out.println("IT made it this far when they are being add");
//				System.out.println("------------------\nWhat is being added\n thisNode.data equals to " 
//						+ thisNode.getData() + "\notherNode.data is equals to "
//						+ otherNode.getData());
				if(otherNode.getData() < 0) {
					data = thisNode.getData() + Math.abs(otherNode.getData()); 
				}
				else {
						data =thisNode.getData() - otherNode.getData(); 
				}				
			//	System.out.println("-----------------\ndata after being added " + 
		//		data); 
					exponent = thisNode.getExponent(); 
				if(thisNode != null) {
					thisNode = thisNode.next; 
				}
				if(otherNode.next != null) {
					
					otherNode = otherNode.next; 
				}
		//		System.out.println("This is data" + data + "\nexponent " +exponent);

				
			//	thisIndex++; 
				//otherIndex++; 
			}
			else if(thisNode.greater(otherNode)) {
				//System.out.println("IT made it this far when the greater number is being add to a new Node");
					
					data = thisNode.getData(); 
					exponent = thisNode.getExponent(); 
				//	System.out.println("This is data" + data + "\nexponent " +exponent);
					
				
			//	thisIndex++; 
				
			}
			else if (otherNode.greater(thisNode)){
					data = otherNode.getData(); 
					exponent = otherNode.exponent;
					
		//			System.out.println("This is data" + data + "\nexponent " +exponent);
			//		otherIndex++; 
				//current = new Node(other.getData(), other.getExponet());
				
			}
			if(data != 0) {
				Node tempNode = new Node(data, exponent); 
				tempArray.add(arrayIndex , tempNode); 
				arrayIndex++; 
				data= 0; 
				exponent = 0;
								
			}
		
			 
			if(thisIndex < this.getSize() && otherIndex < other.getSize()) {
				thisNode = null; 
				otherNode = null; 
			}
			
		}
	//	System.out.println(tempArray.size() + " add Array");
		return other; 	}
	public int getSize() {
		return this.arrayPoly.size(); 
	}
	@Override
	public void readPolynomial() {
		// TODO Auto-generated method stub
		
	}
	public String toString() {
		String answer = "";
		for(int index =0; index<this.arrayPoly.size(); index++) {
			if(this.arrayPoly.get(index).data < 0 ) {
				
				if(this.arrayPoly.get(index).exponent == 0 ) {
					answer = answer.substring(0, answer.length()-1);
					answer = answer +  this.arrayPoly.get(index).data; 
				}
				else {
					if(index ==0) {
						answer = answer + this.arrayPoly.get(index).data + "x^" +
					this.arrayPoly.get(index).exponent+"+";
					}
					else
					answer = answer.substring(0, answer.length()-1);
					answer = answer + this.arrayPoly.get(index).data + "x^"+
					this.arrayPoly.get(index).exponent+"+";
				}
			}
			else {
				if(this.arrayPoly.get(index).exponent == 0 ) {
					
					answer = answer +  this.arrayPoly.get(index).data; 
				}
				else {
				
					answer = answer + this.arrayPoly.get(index).data + "x^"+
					this.arrayPoly.get(index).exponent+"+";
				}
				
				
			}
		}
		char plus = answer.charAt(answer.length()-1); 
		if(plus ==43) {
			answer = answer.substring(0, answer.length()-1); 
		}
		//System.out.println(answer + " toString answer ");
		return answer; 
	}
	@SuppressWarnings("null")
	private  void set(String string) 	{
		
		ArrayList<Integer> tempArray = new ArrayList<Integer>(); 
//		System.out.println("Setting a new string ");
		int position = 0, value = 0; 
		char variable; 
		String part; 
		
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
		
		int t = 0;
		for(int index = tempArray.size()-1; index >= 0; index--) {
			
			if(tempArray.get(index) !=0) {
				
				if(head == null) {
					head = new Node(tempArray.get(index), index);
					
					arrayPoly.add(t, head);
					t++; 
//					 a
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
					 arrayPoly.add(t, current.next);
					 t++; 
	//				 System.out.println("else------------\nThe values inside current " + current.next.data +
	//						 "\nThe exponent of current " + current.next.exponent+"\n--------------");
					
				}
			}

		
			
			
			}
	//	System.out.println(arrayPoly.size()+" arraypoly.Size(");
		
//		Node position2 = this.head; 
//			
//			while(position2 != null) {
//		//		System.out.println("-------------\n\n\n\n\n\n\n This is the data in side the Linked LIst\n " + position2.data +
//		//				"\nThis is the Exponent of the Data\n"	+ position2.exponent);
//				position2 = position2.next; 
//		}
//		System.out.println(tempArray);
	
	}//End set(String data)
}
