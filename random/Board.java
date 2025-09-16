class Board

// Student Name : 		Joseph Lalor
// Student Id Number : 	C00312883
// Group :				B
// Date :				
// Purpose : 

{
    public static void startGame(char pos[])
        {
            int index;
			int i2;
			int i3;
			int step;

			step = 0;
            
			for (index = 0; index <= 12; index++)
				{
					System.out.print("-");
				}
			System.out.println();
			for (index = 0; index <= 2; index++)
				{
					System.out.print("|");
					for (i2 = 0; i2 <= 2; i2++)
						{
							System.out.print(" ");
							System.out.print(step + i2 + 1);
							System.out.print(" |");
							pos[step + i2] = Character.forDigit(step + i2 + 1, 10);
						}
					System.out.println();
					for (i3 = 0; i3 <= 12; i3++)
							{
								System.out.print("-");
							}
					System.out.println();

					step = step + 3;
				}
        }
	
	public static void showGame(char pos[])
        {
            int index;
			int i2;
			int i3;
			int step;

			step = 0;
            
			for (index = 0; index <= 12; index++)
				{
					System.out.print("-");
				}
			System.out.println();
			for (index = 0; index <= 2; index++)
				{
					System.out.print("|");
					for (i2 = 0; i2 <= 2; i2++)
						{
							System.out.print(" ");
							System.out.print(pos[step + i2]);
							System.out.print(" |");
						}
					System.out.println();
					for (i3 = 0; i3 <= 12; i3++)
							{
								System.out.print("-");
							}
					System.out.println();

					step = step + 3;
				}
        }

	public static void xPlay(char pos[])
		{
			int xLocation;

			System.out.print("Enter X location --> ");
			xLocation = EasyIn.getInt() - 1;

			while (xLocation < 0 || xLocation > 9 || pos[xLocation] == 'X' || pos[xLocation] == 'O')
				{
					System.out.println("Invalid play.");
					System.out.print("Enter X location --> ");
					xLocation = EasyIn.getInt() - 1;
				}
			
			pos[xLocation] = 'X';
		}

	public static void oPlay(char pos[])
		{
			int oLocation;

			System.out.print("Enter O location --> ");
			oLocation = EasyIn.getInt() - 1;

			while (oLocation <= 0 || oLocation >= 9 || pos[oLocation] == 'X' || pos[oLocation] == 'O')
				{
					System.out.println("Invalid play.");
					System.out.print("Enter O location --> ");
					oLocation = EasyIn.getInt() - 1;
				}
			
			pos[oLocation] = 'O';
		}

    public static Boolean checkWin(char pos[])
    	{
    		int index;
    		int winCheck;
    		
    		winCheck = 0;
    		
    		for (index = 0; index <= 2; index++)
	    		{
	    			if (pos[index] == pos[index + 3] && pos[index] == pos[index + 6])
		    			{
		    				winCheck++;
		    			}	
	    		}
    		for (index = 0; index <= 6; index = index + 3)
    			{
    				if (pos[index] == pos[index + 1] && pos[index] == pos[index + 2])
    					{
    						winCheck++;
    					}
    			}
    		if (pos[2] == pos[4] && pos[2] == pos[6])
				{
					winCheck++;
				}
			if (pos[0] == pos[4] && pos[0] == pos[8])
				{
					winCheck++;
				}

    		if (winCheck != 0)
    			{
    				return true;
    			}
    		else 
    			{
    				return false;
    			}
    		
    	}
    public static void main(String[] args) 
        {
        	char pos[];
        	pos = new char[9];
			int step;
			Boolean xWon;

			xWon = false;
			step = 0;
        	
            startGame(pos);
            while (checkWin(pos) == false && step <= 8)
				{
					xPlay(pos);
					checkWin(pos);
					showGame(pos);
					step++;
					if (checkWin(pos) == true)
						{
							System.out.println("X wins");
							xWon = true;
							break;
						}
					if (step > 8)
						{
							break;
						}
					oPlay(pos);
					checkWin(pos);
					showGame(pos);
					step++;
				} 
			if (checkWin(pos) == true && xWon == false)
				{
					System.out.println("O wins");
				}
			else if (checkWin(pos) == false)
				{
					System.out.println("Draw");
				}
        }
}
