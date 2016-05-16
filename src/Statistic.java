import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Statistic {
    private List<GameResult> results = new ArrayList<GameResult>();
    Scanner scanner = new Scanner(System.in);

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

                //System.out.println(tempresult);
            }

        }
        return statisticOut;
        //GAmeResult gAmeResult1 = results.get(0);
        //System.out.println(gAmeResult1.returnPlayer());
        //gAmeResult1=results.get(1);
        //System.out.println(gAmeResult1.returnPlayer());
        //System.out.println(gAmeResult1.toString());

    }

}
