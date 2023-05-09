import java.util.Scanner;
import java.io.FileNotFoundException;
import java.lang.Thread;
public class Game {

    
    private Board board = new Board();
    private int rowGuess1 = -1;
    private int columnGuess1 = -1;
    private int rowGuess2 = -1;
    private int columnGuess2 = -1;

    private int difficultyLevel;
    private char theme;
    private int guessTime;

    private int BASE_TIME = 1000; 

    private String guessedThemeWords[] = new String[32];

    private Scanner in = new Scanner(System.in);

    public void setTheme() {
        Boolean isThemeSelected = false;
        
        while (!isThemeSelected){
            System.out.println("Select theme: Cars, Elements, Fruit: [c,e,f] ");
            theme = in.next().charAt(0);
            System.out.println(theme);
            System.out.println();
            if (theme == 'c' || theme == 'e' || theme == 'f') {
                isThemeSelected = true;
            }
            else {
                System.out.println();
                System.out.println("Invalid theme");
            }
        }
    }

    
    public void setDifficultyLevel() {
        System.out.print("Enter difficulty level (4, 6, 8): ");
        difficultyLevel = in.nextInt();
        if (difficultyLevel != 4 && difficultyLevel != 6 && difficultyLevel != 8) {
            System.out.println();
            System.out.println("Invalid difficulty level");
        }
    }

    
    public void setTimeDelay() {
        System.out.println();
        System.out.println("Enter time in seconds between guesses (2, 4, 6): ");
        guessTime = in.nextInt();
        if (guessTime == 2 || guessTime == 4 || guessTime == 6) {
            guessTime = guessTime * BASE_TIME;
        }
        else {
            System.out.println();
            System.out.println("Invalid Time");
        }
    }

    
    public void gameLoop() throws InterruptedException {
        int guessedWordsCount = 0;
        int uniqueWordCount = difficultyLevel * difficultyLevel / 2;
        
        while (guessedWordsCount < uniqueWordCount) {
            System.out.println("Guess 1:");
            System.out.print("Enter column (0, 1, 2, 3...) ");
            columnGuess1 = in.nextInt();
            System.out.println();
            System.out.print("Enter row (0, 1, 2, 3...) ");
            rowGuess1 = in.nextInt();
            
            
            board.printBoard(guessedThemeWords, rowGuess1, columnGuess1, -1, -1);
            
            System.out.println();
            System.out.println("Guess 2:");
            System.out.print("Enter column (0, 1, 2, 3...) ");
            columnGuess2 = in.nextInt();
            System.out.println();
            System.out.println("Enter row (0, 1, 2, 3...) ");
            rowGuess2 = in.nextInt();
            
            
            if (board.isMatch(rowGuess1, columnGuess1, rowGuess2, columnGuess2)){
                guessedThemeWords[guessedWordsCount] = board.getElement(rowGuess1, columnGuess1);
                guessedWordsCount++;
            }
            else {
                board.printBoard(guessedThemeWords, rowGuess1, columnGuess1, rowGuess2, columnGuess2); 
                Thread.sleep(guessTime);
            }

            
            board.printBoard(guessedThemeWords, -1, -1, -1, -1);
        }
    }

    
     public void start() throws FileNotFoundException, InterruptedException {
        
        setTheme();
        setDifficultyLevel();
        setTimeDelay();
        board.boardSize = difficultyLevel;
        board.theme = theme;
        board.initializeBoard();
        board.printBoard(guessedThemeWords, -1, -1, -1, -1);
        
        gameLoop();
        
        System.out.println("You won!");
        System.out.println("Philip Pesic 5/21/23");
    }

};
