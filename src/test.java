import java.util.Scanner; //*** IT DOES NOT RUN
public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        game game1;
        System.out.println("Welcome to knock off wordle. You have 5 guesses starting now.(lowercase please)Please enter make or no make"); //ask the user if they want mode
        String yn = scan.nextLine();
        if (yn.equals("make")) {
            System.out.println("Enter your word.");
            String word = scan.nextLine();
            int length = word.length();
            while (length != 5) {
                System.out.println("Your word is " + length + " not 5 letters long.");
                System.out.println("Enter your word.");
                word = scan.nextLine();
                length = word.length();
            }
            game1 = new game(word);
        } else {
            game1 = new game();
        }
        for (int round = 0; round<5; round++) {
            String guess = scan.nextLine();
            game1.wordCheck(guess);
            System.out.println(game1);
            game1.announcement(guess);

        }

    }
}


