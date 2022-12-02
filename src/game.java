public class game {  //*** IT DOES NOT RUN
    public static final String RESET = "\033[0m";  // Text Reset
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String WHITE = "\033[0;37m";   // WHITE

    private int rounds;
    private String word;
    private String results;

    public game (String word){
        rounds = 0;
        this.word = word;
        this.results = "";
        }

    public game() { //no return
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
        public String toString(){

        return results;
        }

        public String wordCheck (String g1){
        String result = "";
           for (int count = 0;count<5;count++){//checking each letter
               if (g1.substring(count,count+1).equals(word.substring(count,count+1))){ //if the letter is in the right place
                    result += GREEN+g1.substring(count,count+1);
               }
               else if (word.indexOf(g1.substring(count,count+1))!=-1){ //check if the letter is not in the right place
                     result += YELLOW+g1.substring(count,count+1);
               }
               else {
                    result +=WHITE+g1.substring(count,count+1); //no exist
               }
            }
           rounds ++;
           results += result + "\n";
           return result;
        }
        public boolean gameEnder(String g1){
            if (rounds>5 || word.equals(g1)){ //end conditions
                return true;
            }
            else {
                return false;
            }
        }

        public void announcement (String g1){  //void
            if (gameEnder(g1)){
                if (word.equals(g1)) {
                    System.out.println("You win! It took you " + rounds + " rounds to win!");
                }
                else {
                    System.out.println("You lose.");
                }
            }

    }
    }


