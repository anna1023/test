import java.util.Scanner;
public class test {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Welcome to knock off wordle. You have 5 guesses starting now.(lowercase please)"); //ask the user if they want mode
        String yn = scan.nextLine();
        if (yn.equals("make")){
            System.out.println("Enter your word.");
            String word = scan.nextLine();
            int length = word.length();
            while (length!=5){
                System.out.println("Enter your word.");
                word = scan.nextLine();
                length = word.length();
                System.out.println("Your word is "+length+" not 5 letters long.");
            }
            game game1 = new game(word);
        }
        else {
            game game1 = new game();
        }

        //make getter
        public boolean gameEnder(String g1){ //change count name thing whatever
            if (rounds>5 || word.equals(g1)){ //end conditions
                return true;
            }
            else {
                return false; //question my logic
            }
        }
    }
}
