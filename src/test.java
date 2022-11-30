import java.util.Scanner;
public class test {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Welcome to knock off wordle. You have 5 guesses starting now.(lowercase please)");
        game game1 = new game();
        String g1 = scan.nextLine();
        g1.wordcheck(game1,g1);
        if (gameEnder(g1)){
            System.out.println("You won after ")
        }



    }
}
