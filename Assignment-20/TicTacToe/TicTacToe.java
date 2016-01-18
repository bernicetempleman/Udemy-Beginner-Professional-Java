import java.util.Scanner;
/**
 * Write a description of TicTacToe here.
 * 
 * Learning Goals
 * 1. Practice using multi-dimensional arrays.
 * 2. Develop critical thinking skills about arrays, grids, and axes.
 * 3. Stay organized while planning and implementing a game from start to finish.
 * 
 * Game Goal
 * Build an interactive, two-player game of tic-tac-toe. We will review the rules of the game.
 * The game is played on a grid of 9 squares, 3 x 3, like below. 
 * Two people play. One person uses an X for a marker and the other person uses an O for a marker. 
 * The board starts out empty.
 * The players take turns placing their markers,
 * and the first person to get three-in-a-row of their marker wins. 
 * The game is over when someone wins or the board fills up.
 * 
 * For the next game, switch which marker type (which player) starts. 
 * For instance, if X started for the first game, 
 * then O starts for the second game, 
 * and X starts for the third game, 
 * and O starts for the fourth game, and so on.
 * 
 * The player enters which number box they want to put their marker in. 
 * Then the computer places the player's marker there and redraws the board.
 * Each time a play is made, the computer checks to see if 1) anybody won the game, or 2) 
 * the board is full with nobody winning so it's a draw.
 * 
 * Planning
 * Goodness sake, there's a lot of code planning that goes into this game! 
 * Keep good notes, and play your game regularly to see if there's anything you missed.
 * You'll need to cover:
 * 1. Welcome text
 * 2. Data structure to hold the contents of the board
 * 3. Logic to turn that board information into a pretty text display
 * 4. Spacing to make the board look nice
 * 5. Asking the user for which box to place a marker in
 * 6. Converting the box number into a position in your board data structure
 * 7. Checking to make sure that box isn't already taken.
 * 8. Checking for a 3-in-a-row win conditions: horizontally, vertically, diagonally.
 * 9. Checking for a draw (board full) condition
 * 10. Declaring a winner or the draw result to the screen
 * 11. Keeping score with points for how many games each player won.
 * 12. Asking if they want another game.
 * 13. Reseting the board for the beginning of a new game
 * 14. Quitting when they don't want another game.
 * 15. Writing test cases for each kind of win, and score keeping, and starting a fresh board.
 *
 * That's quite a journey! Here are the tools in your knapsack already:
 *  Arrays and multi-dimensional arrays
 *  For loops
 *  While loops
 *  If statements and boolean comparisons
 *  Functions, input parameters, and return values
 *  Mathematical comparisons and calculations
 *  Variables, as many as you want!
 *  Flowcharts and pseudocode
 *  Test cases
 * 
 * Take your time. This assignment will take much longer than the practices. 
 * Remember that your code will be easier to debug if you create functions for reusable behaviors.
 * 
 * @author Bernice
 * @version 2016-01-16
 */
public class TicTacToe {

    public static void clearBoard(char[][] board2)
    {
        for(int row = 0 ; row < board2.length; row++)
        {
            for (int col = 0; col < board2[row].length; col++)
            {
                board2[row][col]= '.';
            }

        }
    }

    public static void printBoard(char[][] board2)
    {
        System.out.println();
        for (char[] row : board2){
            for (char col : row)
                System.out.printf("%s | ",col);
            System.out.println();
        }
    }

    public static boolean updateBoard(char[][] board2, int number, char[] player2)
    {
        if (number == 1)
        {
            if(board2[0][0] == '.')
            {
                board2[0][0] = player2[0];
                return true;
            }
            return false;
        }
        if (number == 2)
        {
            if(board2[0][1] == '.')
            {
                board2[0][1] = player2[0];
                return true;
            }
            return false;
        }
        if (number == 3)
        {
            if(board2[0][2] == '.')
            {
                board2[0][2] = player2[0];
                return true;
            }
            return false;
        }
        if (number == 4)
        {
            if(board2[1][0] == '.')
            {
                board2[1][0] = player2[0];
                return true;
            }
            return false;
        }
        if (number == 5)
        {
            if(board2[1][1] == '.')
            {
                board2[1][1] = player2[0];
                return true;
            }
            return false;
        }
        if (number == 6)
        {
            if(board2[1][2] == '.')
            {
                board2[1][2] = player2[0];
                return true;
            }
            return false;
        }
        if (number == 7)
        {
            if(board2[2][0] == '.')
            {
                board2[2][0] = player2[0];
                return true;
            }
            return false;
        }
        if (number == 8)
        {
            if(board2[2][1] == '.')
            {
                board2[2][1] = player2[0];
                return true;
            }
            return false;
        }
        if (number == 9)
        {
            if(board2[2][2] == '.')
            {
                board2[2][2] = player2[0];
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean checkBoardFull(char[][] board2)
    {
        for(int row = 0 ; row < board2.length; row++)
        {
            for (int col = 0; col < board2[row].length; col++)
            {
                if( board2[row][col]== '.')
                    return false;
            }
        }
        return true;
    }

    public static char checkGameOver(char[][] board2)
    { 
        if (board2[0][0] != '.')
        {
            if (board2[0][0] == board2[0][1])
                if ( board2[0][0]== board2[0][2] )
                {
                    return board2[0][0];
                }
            if (board2[0][0] == board2[1][0] )
                if (board2[0][0]== board2[2][0] )
                {
                    return board2[0][0];
                }
            if (board2[0][0] == board2[1][1] )
                if (board2[0][0] == board2[2][2] )
                {
                    return board2[0][0];
                }
        }
        if (board2[1][1]!= '.')
        {
            if (board2[1][0] == board2[1][1] )
                if (board2[1][1]== board2[1][2] )
                {
                    return board2[1][0];
                }
            if (board2[0][1] == board2[1][1] )
                if (board2[0][1]== board2[2][1] )
                {
                    return board2[0][1];
                }
            if (board2[2][0] == board2[1][1] )
                if (board2[2][0]== board2[0][2] )
                {
                    return board2[1][1];
                }
        }
        if (board2[2][2] != '.')
        {
            if (board2[2][0] == board2[2][1] )
                if (board2[2][0] == board2[2][2] )
                {
                    return board2[2][0];
                }

            if (board2[0][2] == board2[1][2] )
                if (board2[0][2]== board2[2][2] )
                {
                    return board2[2][2];
                }
        }

        return 'N';
    }

    public static void main(String[] args)
    {

        char [][] board = new char[3][3];

        Scanner keyboard = new Scanner(System.in);
        String number;
        String continueGame;
        char [] player = new char[1];
        int player1 = 1;
        int player2 = 2;
        int gameNumber = 0;
        boolean gameOver = false;
        int scoreX = 0;
        int scoreO = 0;

        System.out.println("Welcome to Tic Tac Toe!\n");
        System.out.println("To play, enter a number for which box to play in: ");
        System.out.println("1 2 3");
        System.out.println("4 5 6");
        System.out.println("7 8 9");
        System.out.println("\nYou'll need a buddy to play with. Ready to begin?");

        do{
            gameNumber++;
            char winner = 'N';
            if((gameNumber % 2)== 1)
            {
                player[0] = 'X';
            }
            else
            {
                player[0] = 'O';
            }
            System.out.printf("\n\n%s moves first.\n\n", player[0]);
            clearBoard(board);

            do{
                printBoard(board);
                System.out.print("? ");
                number = keyboard.nextLine();

                
                {
                    if(!updateBoard(board, Integer.parseInt(number), player))
                        System.out.printf("Sorry, %d is already full. Try again.\n", Integer.parseInt(number));
                    winner = checkGameOver(board);
                    if (winner == 'X')
                    {
                        printBoard(board);
                        System.out.println("\nX wins!");
                        scoreX++;
                        gameOver  = true;
                    }
                    else if (winner == 'O')
                    {
                        printBoard(board);
                        System.out.println("\nO wins!");
                        scoreO++;
                        gameOver  = true;
                    }
                    else if( winner == 'N')
                    {
                        if(checkBoardFull(board))
                        {
                            printBoard(board);
                            System.out.println("\nThe game is a draw! Nobody wins.");
                            gameOver  = true;
                        }
                        else
                        {
                            if(player[0] == 'X')
                                player[0] = 'O';
                            else 
                                player[0] = 'X';

                        }
                    }

                }
                else
                    System.out.println("\nInvalid Number, Enter 1-9 ");

            }while(winner == 'N');
            System.out.printf("Score: X = %d, O = %d \n",scoreX, scoreO);
            System.out.println("\nWould you like to play again? y n\n? ");
            do{
                continueGame = keyboard.nextLine();
                if (!(continueGame.equals("y") || continueGame.equals("n")))
                    System.out.println("Invalid answer");
            }while (!(continueGame.equals("y") || continueGame.equals("n")));
        }while (continueGame.equals("y"));

    }
}
