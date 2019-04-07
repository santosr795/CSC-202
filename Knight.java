public class Knight{
	 	private static int moves[];
	    private static int size;
	    private static int index = 0;
	    private static int [][] board;
	    public static void main (String args[]) {
			 Knight knightTour = new Knight(64); 
			 knightTour.Start(); 
	}
	    public Knight(int size) {	
	        this.size = size;
	        moves = new int[size];
	    
	    }
	    public void Start() {
	        board = new int [8][8]; 
	    			 board = fillTheBoard(8, 8); 
	    			 print(board, 8,8); 
	    			board= tour(board,0,0);
	    			//print(board,8,8); 
	    }
	public static int[][] tour(int [][] board, int column, int row) {
		Knight stack = null; 
		int previousRow, previousColumn, move, i =1;
		while(!isFull()){
			
			move = nextMove(); 
			
			 switch(move){
			 case 1: //right,up
				 previousColumn = column; 
				 previousRow = row; 
				 column = column+1; 
				 row = row + 2;
				 break; 
			 case 2://right, down
				 previousColumn = column; 
				 previousRow = row;
				 column = column-1; 
				 row = row + 2;
				 break; 
			 case 3: //up,right
				 previousColumn = column; 
				 previousRow = row;
				 column = column+2; 
				 row = row+1;
				 break; 
			 case 4: //up,left 
				 previousColumn = column; 
				 previousRow = row;
				 column = column+2; 
				 row = row -1;
				 break;
			 case 5: //left,up
				 previousColumn = column; 
				 previousRow = row;
				 column = column+1; 
				 row = row - 2;
				 break; 
			 case 6: //left, down
				 previousColumn = column; 
				 previousRow = row;
				 column = column-1; 
				 row = row - 2;
				 break; 
			 case 7: //down,right
				 previousColumn = column; 
				 previousRow = row;
				 column = column-2; 
				 row = row + 1;
				 break; 
			 case 8://down,left
				 previousColumn = column; 
				 previousRow = row;
				 column = column-2; 
				 row = row -1;
			 break; 
			 
			 }
			 if((column > 0)&& (column <7) &&(row > 0) && (row <7)) {
				 stack.push(i);
				 i++; 
				 
				 System.out.println("It works\n" + row +"\n" + column ); 
				 index++;
			 }
			
		}
		return null; 
	}
	private static int[][] fillTheBoard(int columns, int rows) {
		 int array [][] = new int [columns][rows]; 
		 for(int index = 0; index < columns; index++) {
			 for(int innerIndex = 0; innerIndex < rows; innerIndex++) {
				// System.out.println(index + " " + innerIndex);
				 
				 array[index][innerIndex] = 0; 
			 }
		 }
		 return array; 
	 }
	private static int nextMove() {
		double move = Math.random()*8; 
		int nextMove = (int) move + 1 ; 
		return nextMove ; 
	}
	public static void print( int [][] board, int numberOfRows, int numberOfColumns) {
	/*
	 *When this method is summon it will print itself and inside there will 
	 *be the moves that mouse did and the location of the cat. 
	 */
		int value;
		for(int rowsValue = 0; rowsValue < numberOfRows; rowsValue++) {
			for(int columnValue = 0;  columnValue < numberOfColumns; columnValue++) {
				
					value = board[rowsValue][columnValue]; 
				if(value> 9) {
					System.out.print(" " + value);
					
				}
				else {
					System.out.print("  " + value);
				}
				
				//System.out.print(mouseArray[rowsValue][columnValue] + "  ");
			}
			System.out.println("");
		}
		
	}
	 public void push(int element) {

	        if (isFull()) {
	            throw new StackOverflowError("Stack is full");
	        }

	        moves[index] = element;
	        index++;
	    }

	    public int pop() {

	        if (isEmpty()) {
	            throw new StackOverflowError("Stack is Empty");
	        }
	        return moves[--index];
	    }

	    public boolean isEmpty() {
	        if (index == 0) {
	            return true;
	        }
	        return false;
	    }

	    public static boolean isFull() {
	        if (index == size) {
	            return true;
	        }
	        return false;
	    }

	    public int size() {
	        return index;
	    }
	    
}
