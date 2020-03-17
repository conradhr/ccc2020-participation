
import java.util.Scanner;

/**
 * CCC 2020 Junior Problem 1
 *
 * @author 1886007 | Rudolph Hunter
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        infectedNum();
    }

    /**
     *
     * infectedBoundry - Determine whether a total of more than P people
     * infected intialInfected - The number N of people who have the disease on
     * Day 0 numInfectedDaily - When a person has a disease, they infect R
     * people the next day.
     *
     * @return numDays - the day the number of people who have had the diseases
     * > P
     */
    public static int infectedNum() {
        Scanner kb = new Scanner(System.in);
        int infectedBoundry = Math.abs(kb.nextInt());
        int intialInfected = Math.abs(kb.nextInt());
        int numInfectedDaily = Math.abs(kb.nextInt());

        int numDays = 0;
        int totalSick = 0;

        for (int day = 0; day <= infectedBoundry; day++) {
            totalSick += (int) (intialInfected * Math.pow(numInfectedDaily, day));
            if (totalSick > infectedBoundry) {
                numDays = day;
                break;
            }
        }
        System.out.println(numDays);
        return numDays;
    }
}
