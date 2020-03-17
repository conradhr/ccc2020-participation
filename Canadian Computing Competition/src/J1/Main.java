
import java.util.Scanner;

/**
 * CCC 2020 Junior Problem 1
 *
 * @author 1886007 | Rudolph Hunter
 */
public class Main {

    public static void main(String[] args) {
        happinessScore();
    }

    /**
     * A method to determine whether Barley is happy or sad at the end of the
     * day.
     *
     * @param smallTreat number of small treats
     * @param mediumTreat number of medium treats
     * @param largeTreat number of large treats
     * @return String "Happy" or "Sad" depending on the score
     */
    public static String happinessScore() {
        Scanner kb = new Scanner(System.in);
        int smallTreat = Math.abs(kb.nextInt());
        int mediumTreat = Math.abs(kb.nextInt());
        int largeTreat = Math.abs(kb.nextInt());

        int happyFormula = (1 * smallTreat) + (2 * mediumTreat)
                + (3 * largeTreat);

        System.out.println(happyFormula >= 10 ? "happy" : "sad");
        return happyFormula >= 10 ? "happy" : "sad";
    }
}
