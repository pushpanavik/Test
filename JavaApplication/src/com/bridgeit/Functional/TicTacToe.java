package com.bridgeit.Functional;
import java.util.Scanner;

public class TicTacToe {
	public static final int CROSS=1;
	public static final int EMPTY=0;
	public static final int MINUS=2;
	public static final int PLAYING = 0;
	public static final int DRAW = 1;
	public static final int CROSS_WON = 2;
	public static final int MINUS_WON = 3;
	public static int[][] board = new int[3][3];
	public static int currentState;
	public static int currentPlayer;
	public static int currentRow, currentCol;
	 public static Scanner scanner=new Scanner(System.in);
	public static void main(String args[]) 
	{
		do 
		{
			playerMove(currentPlayer);
			updateGame(currentPlayer,currentRow,currentCol);
			printBoard();
			//if Game over
			if(currentState==CROSS) {
				System.out.println("X wins");
			}
			else if(currentState==MINUS) {
				System.out.println("- wins");
			}
			else
				System.out.println("It's a draw");

			currentPlayer=(currentPlayer==CROSS)?MINUS:CROSS;
		}
		while(currentState == PLAYING);
	}
		public static void printBoard() {
			for (int row = 0; row < 3; ++row) {
		         for (int col = 0; col < 3; ++col) {
		            printCell(board[row][col]); 
		            if (col != 3 - 1) {
		               System.out.print("|");   
		            }
		         }
		         System.out.println();
		         if (row != 3- 1) {
		            System.out.println("-----------"); 
		         }
		      }
		      System.out.println();
			
		}

		public static void printCell(int content) {
			 switch (content)
			 {
	         case EMPTY:  System.out.print("   "); break;
	         case MINUS: System.out.print(" O "); break;
	         case CROSS:  System.out.print(" X "); break;
	      }
			
		}

		public static void updateGame(int seed,int currentCol,int currentRow)
		{
			if(hasWon(seed))
			{
				currentState=(seed==CROSS_WON)?MINUS_WON:CROSS_WON;
			}
			else if (isDraw()) {  // check for draw
		         currentState = DRAW;
		      }
		}	
		
		public static boolean isDraw()
		{
			for (int row = 0; row < 3; ++row) 
			{
		        for (int col = 0; col < 3; ++col) 
		        {
		            if (board[row][col] == EMPTY) 
		            {
		            	return false;
		            }
		         }
			}
			 return true;
		}

		public static boolean hasWon(int seed) {
			 return(board[currentRow][0] == seed        
	                && board[currentRow][1] == seed
	                && board[currentRow][2] == seed
	           || board[0][currentCol] == seed      
	                && board[1][currentCol] == seed
	                && board[2][currentCol] == seed
	           || currentRow == currentCol         //diagonal
	                && board[0][0] == seed
	                && board[1][1] == seed
	                && board[2][2] == seed
	           || currentRow + currentCol == 2 // opposite diagonal
	                && board[0][2] == seed
	                && board[1][1] == seed
	                && board[2][0] == seed);
		}

		public static void playerMove(int seed)
		{
			
			boolean valid=false;
			do {
				if(seed==CROSS)
				{
					System.out.println("Player 'X',enter your move (row[1-3] column[1-3]): ");
				}
				else {
					System.out.print("Player 'O', enter your move (row[1-3] column[1-3]): ");
				}
				int row=scanner.nextInt()-1;
				int col=scanner.nextInt()-1;
				if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == EMPTY) 
				{
					currentRow = row;
					currentCol = col;
					board[currentRow][currentCol] = seed;
					valid=true;
				}else
				{
					System.out.println("This move at (" + (row + 1) + "," + (col + 1)
							+ ") is not valid. Try again...");
				}
			} while (!valid);
		}
		
		public static void initGame() 
		{
			
			for (int row = 0; row < 3; ++row) 
			{
		         for (int col = 0; col < 3; ++col) 
		         {
		            board[row][col] = EMPTY; 
		            currentState = PLAYING; // ready to play
		            currentPlayer = CROSS;  // cross plays first
		         }
			}
		}
		   
		
	}

	
	


