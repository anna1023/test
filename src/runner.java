public class runner {
    private int count;
    private String word;
        public String generate() {
            int num = (int) (Math.random() * 10);
            if (num == 0) {
                word = "lemon";
            return word;
        }
            if (num ==1) {
                word = "pizza";
                return word;
            }
            if (num ==2){
                word ="jazzy";
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
                word ="eerie";
                return word;
            }
            else {
                return "";
            }
        }
    public String wordCheck (String word,String g1){
        this.word = word;
        while (!(word.equals(g1))){
            if (g1.equals(word.substring(0,1))){

            }
        }

    }
}
