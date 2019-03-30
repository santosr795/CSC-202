
public class Knight {
	 private static int columns = 8; 
	 private static int rows = 8; 
	 private static int [][] board; 
	 public static void main (String args[]) {
		 board = new int [columns][rows]; 
		 board = fillTheBoard(8, 8); 
		 print(board, columns,rows); 
		 tour(board,0,0,1); 
	 }
	// @SuppressWarnings("null")
	 private static int[][] tour(int [][] array, int column, int row, int movement) {
		 int previousColumn = 0, previousRow = 0; 
		 try {
			 
			 for(movement = 1; movement != 65; movement++) {
				 int move = 1; 
				 array[column][row] = movement; 
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
				 int values = array[column][row]; 
				 if(values ==0) {
					 tour(array,previousColumn, previousRow, movement-1);  
				 }
				 else {
					 array[column][row] = movement; 
				 }
			 move = nextMove(); 
		 	}
		 }
		 catch(IndexOutOfBoundsException exception) {
			 tour(array,previousColumn, previousRow, movement-1); 
			 
		 }
	 return array; 
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
		for(int rowsValue = 0; rowsValue < numberOfRows; rowsValue++) {
			for(int columnValue = 0;  columnValue < numberOfColumns; columnValue++) {
				
				int value = board[rowsValue][columnValue]; 
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
}
