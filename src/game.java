public class game {
    public static final String RESET = "\033[0m";  // Text Reset
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String WHITE = "\033[0;37m";   // WHITE

    private int count; // index
    private String word;
        public String game() { //no return
            int num = (int) (Math.random() * 10);
            if (num == 0) {
                word = "lemon";
            return word;
        }
            if (num ==1) {
                word = "phone";
                return word;
            }
            if (num ==2){
                word ="mouse";
                return word;
            }
            if (num==3){
                word = "lunch";
                return word;
            }
            if (num==4){
                word = "space";
                return word;
            }
            if (num==5){
                word = "extra";
                return word;
            }
            if (num==6){
                word ="melon";
                return word;
            }
            if (num==7){
                word ="snack";
                return word;
            }
            if (num==8){
                word ="games";
                return word;
            }
            if (num==9){
                word ="dimly";
                return word;
            }
            if (num==10){
                word ="water";
                return word;
            }
            else {
                return "";
            }
        }
    public void wordCheck (String word,String g1){
        this.word = word;
            for (int count = 0;count<5;count++){//checking each letter
                this.count = count;
               if (g1.substring(count,count+1).equals(word.substring(count,count+1))){ //if the letter is in the right place
                   System.out.print(GREEN+g1.substring(count,count+1));
               }
               else if (word.indexOf(g1.substring(count,count+1))==-1){ //check if the letter is not in the right place
                   System.out.print(YELLOW+g1.substring(count,count+1));
               }
               else {
                   System.out.print(WHITE+g1.substring(count,count+1)); //no exist
               }
               System.out.print("\n");
            }
        }
        public boolean gameEnder(String g1){ //change count name thing whatever
            if (count>5 || word.equals(g1)){ //end conditions
                return true;
            }
            if (count<=5 && word.equals(g1)){ //fix this pls arden
                return true;
            }
            else {
                return false; //question my logic
            }
        }
//make round thingy annouce end game make round thingy tostring
        public String annoucement (boolean gameEnder()){
            if (gameEnder()){
                return "You win!It took you "+count+" rounds to win!";
            }

            }
    }
    }


