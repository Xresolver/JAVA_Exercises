
public class Heuristic_Approache 
{
	// size X size chessboard
	private static final int SIZE = 8;
	private static final int INITIAL_POZITION = 0;
	private static final int POSSIBLE_MOVE_NUMBER = 8;
	
	private static int currentRow = INITIAL_POZITION;
	private static int currentColumn = INITIAL_POZITION;

	private static int moveNumber = 0;
	private static int moveCounter = 0;
	private static boolean moveStatus = true;
	
	private static int[][] chessboard;
	// two-dimensional array accessibility with numbers indicating from 
	// how many squares each particular square is accessible.
	private static int[][] possibilityBoard;
	
	//	horizontal movements based on moveNumber
	private static int[] horizontal = {2,1,-1,-2,-2,-1,1,2};
	//	vertical movements based on moveNumber
	private static int[] vertical   = {-1,-2,-2,-1,1,2,2,1};
	
	protected static void apply()
	{
		//	We're applying heuristic approach for all initials points.
		for(int i = 0; i < SIZE; i++)
		{
			for(int j = 0; j < SIZE; j++)
			{	
				currentRow = i;   
				currentColumn = j;

				initialize();

				while(moveStatus == true)
				{
					moveCounter++;
					
					updateChessboard();
					decide();
					updatePossibilityBoard();
					move();
				
				}
				
				if(moveCounter == 64)
				{
					System.out.println("OK for initial point: (" + i + "," + j + ") ");
				}
				else
				{
					System.out.println("NOT OK for initial point: (" + i + "," + j + ") ");

				}
				
			}
			
		}
	}
	
	private static void initialize()
	{
		moveCounter = 0;
		
		moveStatus = true;
		
		int[][] initializerPossibilityBoard = {	{2,3,4,4,4,4,3,2},
												{3,4,6,6,6,6,4,3},
												{4,6,8,8,8,8,6,4},
												{4,6,8,8,8,8,6,4},
												{4,6,8,8,8,8,6,4},
												{4,6,8,8,8,8,6,4},
												{3,4,6,6,6,6,4,3},
												{2,3,4,4,4,4,3,2},	};
		
		possibilityBoard = initializerPossibilityBoard.clone();
		
		chessboard = new int[SIZE][SIZE];
		
	}
	
	public static void updateChessboard()
	{
		chessboard[currentRow][currentColumn] = moveCounter;
		
//		for(int[] i: chessboard)
//		{
//			for(int j:i)
//				System.out.print(j + " ");
//			System.out.println();
//		}
//		System.out.println();
				
	}
	
	public static void updatePossibilityBoard()
	{
		possibilityBoard[currentRow][currentColumn] = 0;
		
		for(int i = 0; i < POSSIBLE_MOVE_NUMBER; i++)
		{
			if(currentRow + vertical[i] >= 0 && 
					currentColumn + horizontal[i] >= 0 &&
						currentRow + vertical[i] < 8 && 
							currentColumn + horizontal[i] < 8 &&
								possibilityBoard[currentRow + vertical[i]]
												[currentColumn + horizontal[i]] > 0)

			{	
				possibilityBoard[currentRow + vertical[i]]
								[currentColumn + horizontal[i]]--;
			}

		}
		
	}
	
	private static void decide()
	{
		int minPossibility = 9;
		
		// if there are no possible move
		moveStatus = false;
		
		for(int i = 0; i < POSSIBLE_MOVE_NUMBER; i++)
		{
			if(currentRow + vertical[i] >= 0 && 
					currentColumn + horizontal[i] >= 0 &&
						currentRow + vertical[i] < 8 && 
							currentColumn + horizontal[i] < 8 &&
								possibilityBoard[currentRow + vertical[i]]
												[currentColumn + horizontal[i]] > 0)
			{	
				if(minPossibility > possibilityBoard[currentRow + vertical[i]]
														[currentColumn + horizontal[i]])
				{
					minPossibility = possibilityBoard[currentRow + vertical[i]]
													 [currentColumn + horizontal[i]]; 
					// move decision
					moveNumber = i;
					//	there are possible moves(at least one)
					moveStatus = true;
				}
			}

		}
		
	}
	
	private static void move()
	{
		if(moveStatus == true)
		{
			currentRow += vertical[moveNumber];
			currentColumn += horizontal[moveNumber];
		}
		
	}
}
