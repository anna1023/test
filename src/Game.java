/**
 * This is a class that is a game where you guess the word.
 */
public class Game {
    /** This changes the color of the print to green. */
    public static final String GREEN = "\033[0;32m";   // GREEN
    /** This changes the color of the print to yellow. */
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    /** This changes the color of the print to red. */
    public static final String RED = "\033[0;31m";// RED
    /** This changes the color of the print to white. */
    public static final String WHITE = "\033[0;37m";   // WHITE

    /** This is the number of rounds happening in the game. */
    private int rounds;
    /** This is the answer/word that the player is trying to guess. */
    private String word;
    /** This is all the results of the guesses that are printed so far.  */
    private String results;

    /**
     * it sets the custom word to the variable word and set round to 0
     * @param word - custom word
     */
    public Game (String word){
        rounds = 0;
        this.word = word;
        this.results = "";
        }

    /**
     * it's a default constructor that generates the word based on a random number generated */
    public Game() {
        this.results = "";
            int num = (int) (Math.random() * 10);
            if (num == 0) {
                word = "lemon";

        }
            if (num ==1) {
                word = "phone";

            }
            if (num ==2){
                word ="mouse";

            }
            if (num==3){
                word = "lunch";

            }
            if (num==4){
                word = "space";

            }
            if (num==5){
                word = "extra";

            }
            if (num==6){
                word ="melon";

            }
            if (num==7){
                word ="snack";

            }
            if (num==8){
                word ="games";

            }
            if (num==9){
                word ="dimly";

            }
            if (num==10){
                word ="water";

            }
            else {

            }

        }

    /** shows all the results of the guesses
     @return String - results */
        public String toString(){

        return results;
        }

    /** checks the word letter by letter and adds one to round everytime it's run
     @param guess - the user input
     @return String - the user input color coded to show what's right and what's wrong
     */
        public String wordCheck (String guess){
        String result = "";
           for (int count = 0;count<5;count++){//checking each letter
               String letter = guess.substring(count,count+1);
               if ((letter).equals(word.substring(count,count+1))){ //if the letter is in the right place
                    result += GREEN+letter;
               }
               else if (word.indexOf(letter)!=-1){ //check if the letter is not in the right place
                     result += YELLOW+letter;
               }
               else {
                    result +=WHITE+letter; //no exist
               }
            }
           rounds ++;
           results += result + "\n"; //delete a println somewhere
           return result;
        }

    /** checks to see if any of the end conditions have been met
     @param guess - the user input
     @return boolean - whether the game is ended or not
     */
        public boolean gameEnder(String guess){
            if (rounds==5 || word.equals(guess)){ //end conditions
                return true;
            }
            else {
                return false;
            }
        }

    /** announces to the user whether they win or not
     @param guess - the user input
     */
        public void announcement (String guess){
            if (gameEnder(guess)){
                if (word.equals(guess)) {
                    System.out.println("You win! It took you " + rounds + " rounds to win!");
                }
                else {
                    System.out.println(RED+"You lose.The word is "+word+".");
                }
            }

    }
}


