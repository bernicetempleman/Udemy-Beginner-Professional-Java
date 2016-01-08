import static java.lang.System.out;
import java.util.Scanner;
/**
 * Write a description of BuildingTreasureChests here.
 * 
 * Learning Goals
 * 1. Plan code from provided software requirements.
 * 2. Practice using variables.
 * 3. Practice using simple math formulas.
 * 4. Learn the parts of good requirements: 
 * goal, sample output, names and calculation rules,and test data.
 * 
 * Business Goal
 * In this practice, you'll help Pirate Lady Ching's crew plan the
 * number of treasure chests they must build for her. To do so,
 * you'll ask the user about current prices, and how much Lady
 * Ching has invested, and then calculate how many chests can be
 * built for that price
 * 
 * One variable at the beginning of your program will be a constant. Its value doesn't change:
 * int boardsPerChest = 9;
 * It's okay to hard-code that value. 
 * When you use it later in your program, 
 * you should refer to it by variable name. 
 * That way, if someday chests are built with 8 boards instead, 
 * you only have to change it in one place, 
 * and the rest of your math stays the same.
 * 
 * Variable Names and Meanings
 * boardsPerChest - How many boards to build one chest.(Always 9.)
 * silverPiecesPerBoard - Today's cost for one board, in
 * silver pieces. User types it in.
 * costForBoards - Total cost of boards for a single chest.
 * costPerLock - Cost of one lock.
 * totalChestCost - Cost of boards for one chest and one
 * lock to keep the booty safe.
 * investment - How much silver Lady Ching is ready to
 * spend at this time.
 * numChests - How many complete chests her
 * investment will pay for.
 * leftOverSilver - How much of her money is left over after buying those chests.
 * 
 * Math Rules
 * costForBoards = boardsPerChest multiplied by silverPiecesPerBoard
 * totalChestCost = add costForBoards plus costPerLock
 * numChests = investment divided by totalChestCost (but no fractional chests)
 * leftOverSilver = investment minus (numChests multiplied by totalChestCost)
 * 
 * Planning Your Code
 * 1. Identify what pieces of the story get printed as messages, without any numbers in them.
 * 2. Write the code with those print statements. Save, compile, run. Verify that much works.
 * 3. Identify the statements that ask questions. Write what variable name each uses.
 * 4. Write the code that declares the variables at the beginning of your program.
 * 5. Write the code that takes keyboard input and assigns it to each of those variables.
 * 6. Write the code that does the math calculations.
 * 7. Write the print statements that show the results of the math calculations.
 * 8. Make sure your program is complete and compiles.
 * 9. Run your program. Try typing in various numbers to see if it works.
 * 10.Run your program several times, using the sample numbers below.
 * 
 * Sample Calculations
 * Use these to test your code. 
 * You should be able to compile your code once, and then run it several times, 
 * typing in different numbers each time. 
 * When you type in the numbers below, 
 * the results should match the math shown here. 
 * Ensure these numbers (other than 9 boards per chest) never appear directly in your source code. 
 * Instead, you should be using variables,and doing calculations, 
 * then printing the results. 
 * That means you can re-run the program without changing the code 
 * and just answer the questions with different numbers to get different results.
 * 
 * Scenario 1:
 * User types in 3, 9, 300.
 * 3 silver pieces per board * 9 boards = 27 silver pieces for boards.
 * 9 silver pieces per lock + 27 silver pieces for boards = 36 silver pieces total chest cost.
 * 300 silver pieces invested / 36 silver pieces per chest = 8 chests
 * 300 silver pieces - (36 times 8) = 12 silver pieces left over.
 * 
 * Scenario 2:
 * User types in 1, 1, 50.
 * 1 silver pieces per board * 9 boards = 9 silver pieces for boards.
 * 1 silver pieces per lock + 9 silver pieces for boards = 10 silver pieces total chest cost.
 * 50 silver pieces invested / 10 silver pieces per chest = 5 chests
 * 50 silver pieces - (10 times 5) = 0 silver pieces left over.
 * 
 * Scenario 3:
 * User types in 1, 2, 52.
 * 1 silver pieces per board * 9 boards = 9 silver pieces for boards.
 * 2 silver pieces per lock + 9 silver pieces for boards = 11 silver pieces total chest cost.
 * 52 silver pieces invested / 11 silver pieces per chest = 4 chests
 * 52 silver pieces - (11 times 5) = 8 silver pieces left over.

 * 
 * @author Bernice Templeman
 * @version 20160108
 */
public class BuildingTreasureChests {

    public static final int BOARDS_PER_CHEST = 9; // constant

    public static void main(String[] args)
    {
        //variables
        
        Scanner keyboard = new Scanner(System.in);
        
        int boardsPerChest = 9;     // this can be changed
        int silverPiecesPerBoard;   // Today's cost for one board
        int costForBoards;          // Total cost of boards for a single chest
        int costPerLock;            // Cost of one lock
        int totalChestCost;         // Cost of boards for one chest and one lock
                                    // to keep the booty safe
        int investment;             // How much silver Lady Ching is ready to spend at this time
        int numChests;              // How many complete chests her investment will pay for
        int leftOverSilver;         // How much of her money is keft over after buying those chests
        
        // get input 
        out.println("Pirate Lady Ching wants to build some locking treasure chests.");
        out.println("The chests are a standard size to fit in the ship's cargo area.");
        out.println("Every chest requires 9 boards.");
        
        out.print("\nWhat is today's price for boards, in silver pieces? ");
        silverPiecesPerBoard = keyboard.nextInt();
        
        costForBoards = BOARDS_PER_CHEST * silverPiecesPerBoard;       
        out.println("The cost per chest is "
        + costForBoards + " silver pieces for boards.");
        
        out.println("\nEach chest also requires lock hardware.");
        out.print("What is today's price for locks, in silver pieces? ");
        costPerLock = keyboard.nextInt();
        totalChestCost =  costForBoards + costPerLock;
        
        out.print("How many silver pieces does Lady Ching wish to invest in building chests? ");
        investment =  keyboard.nextInt();
        
        numChests = investment/totalChestCost;
        leftOverSilver = investment - (numChests * totalChestCost);
        
        
        out.println("\nThat will pay for the creation of " + numChests + " chests.");
        out.println("Left over silver pieces: " + leftOverSilver);
        
        
        
        
        
        /*

         * costForBoards = boardsPerChest multiplied by silverPiecesPerBoard 
         * totalChestCost = add costForBoards plus costPerLock 
         * numChests = investment divided by totalChestCost (but no fractional chests) 
         * leftOverSilver = investment minus (numChests multiplied by totalChestCost) 
         * 
         */
        
      
        

        
    }

}
