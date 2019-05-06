

public class KnightTour {
	private static int[][] board;
	private static int moves = 0;

	public static void main(String[] args) {
		KnightTour tour = new KnightTour();
		tour.start();
	}
	public KnightTour() {
		board = fillTheBoard(); 
	}
	private static int[][] fillTheBoard() {
		int rows = 8, columns =8; 
		 int array [][] = new int [columns][rows]; 
		 for(int index = 0; index < columns; index++) {
			 for(int innerIndex = 0; innerIndex < rows; innerIndex++) {
				// System.out.println(index + " " + innerIndex);
				 array[index][innerIndex] = 0; 
			 }
		 }
		
		 return array; 
	 }
	private boolean tour(int row, int column, int index) {
		if (board[row][column] != 0) {
			return false;
		}
		board[row][column] = moves++;
		if (insideBoard(row + 2, column + 1)&& tour(row + 2, column + 1, index + 1)) {
			return true;
		}
		if (insideBoard(row + 1, column + 2)&& tour(row + 1, column + 2, index + 1)) {
			return true;
		}
		if (insideBoard(row - 1, column + 2)&& tour(row - 1, column + 2, index + 1)) {
			return true;
		}
		if (insideBoard(row - 2, column + 1)&& tour(row - 2, column + 1, index + 1)) {
			return true;
		}
		if (insideBoard(row - 2, column - 1)&& tour(row - 2, column - 1, index + 1)) {
			return true;
		}
		if (insideBoard(row - 1, column - 2)&& tour(row - 1, column - 2, index + 1)) {
			return true;
		}
		if (insideBoard(row + 1, column - 2)&& tour(row + 1, column - 2, index + 1)) {
			return true;
		}
		if (insideBoard(row + 2, column - 1)&& tour(row + 2, column - 1, index + 1)) {
			return true;
		}
		if (index == 64) {
			return true;
		}	
		else {
		board[row][column] = 0;
		moves--;
		return false;
		}
	}
	private static boolean insideBoard(int x, int y) {
		if((x>= 0)&& (x <=7) &&(y>= 0) && (y<=7)) {
			return true; 
		}	
		return  false; 
	}
	private static void print( int [][] board) {
		/*
		 *When this method is summon it will print itself and inside there will 
		 *be the moves that mouse did and the location of the cat. 
		 */
			int value;
			 int numberOfRows =8, numberOfColumns=8; 
			for(int rowsValue = 0; rowsValue < numberOfRows; rowsValue++) {
				for(int columnValue = 0;  columnValue < numberOfColumns; columnValue++) {
						value = board[rowsValue][columnValue]; 
					if(value> 8) {
						value = value +1; 
						System.out.print(" " + value);
					}
					else {
						value = value +1; 

						System.out.print(" " + 0+value );
					}
					
					//System.out.print(mouseArray[rowsValue][columnValue] + "  ");
				}
				System.out.println("");
			}
			System.out.println("");		
		}
	public void start() {
		if (tour(0, 0, 1)) {
			print(board);
		}
	}
}
