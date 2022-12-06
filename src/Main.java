import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Game game1;
        System.out.println("Welcome to knock off wordle.To create your own word, type in create otherwise type anything else.");
        String yn = scan.nextLine();
        if (yn.equals("create")) {
            System.out.println("Enter your word.");
            String word = scan.nextLine();
            int length = word.length();
            while (length != 5) {
                System.out.println("Your word is " + length + " not 5 letters long.");
                System.out.println("Enter your word.");
                word = scan.nextLine();
                length = word.length();
            }
            for (int count = 0; count <5; count++){
                System.out.print("\n");
            }
            game1 = new Game(word);
        } else {
            game1 = new Game();
        }
        for (int count = 0; count <6; count++){
            System.out.println('\n');
        }
        System.out.println("Your 5 guess starts now.");
        for (int round = 0; round<5; round++) {
            String guess = scan.nextLine();
            while (guess.length()!=5){
                System.out.println("Please enter a 5 letter word");
                guess = scan.nextLine();
            }
            game1.wordCheck(guess);
            for (int count = 0; count < 11; count++){
                System.out.println("");
            }
            System.out.print(game1);
            game1.announcement(guess);
            if (game1.gameEnder(guess)){
                break;
            }
        }

    }
}


