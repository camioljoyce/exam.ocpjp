package exam.ocpjp.v1.q057;

public class Test {
	
//	OO_
//	_XO
//	_XX
	public static void main(String[] args) {
		char[][] grid = new char[3][3];
		grid[1][1] = 'X';
		grid[0][0] = 'O';
		grid[2][1] = 'X';
		grid[0][1] = 'O';
		grid[2][2] = 'X';
		grid[1][2] = 'O';
		// line n1
//		Which line of code, when inserted in place of //line n1. adds an x into the grid so that the grid
//		contains three consecutive X'S?
		grid[2][0] = 'x'; //Answer
	}

}
