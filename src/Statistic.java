import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Statistic {

    private static Statistic statistic = null;
    private List<GameResult> results = new ArrayList<GameResult>();
    Scanner scanner = new Scanner(System.in);

    private Statistic() {

    }

    public void addResult(GameResult result) {
        results.add(result);
    }

    //public void viewStatistics() {
    public String toString() {
        System.out.println("What statistic you want?");
        String input = scanner.next(), statisticOut = "";

        for (GameResult tempresult : results) {
            if (tempresult.returnResult().equals(input)) {
                statisticOut = statisticOut + "\n" + tempresult;
            }
        }
        return statisticOut;
    }

    public static Statistic newInstance() {
        if (statistic == null) {
            statistic = new Statistic();
        }
        return statistic;
    }
}
