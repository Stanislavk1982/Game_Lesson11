import java.util.ArrayList;
import java.util.List;

public class Statistic {
    private List<GAmeResult> results = new ArrayList<GAmeResult>();

    public void addResult(GAmeResult result) {
        results.add(result);
    }

    public void viewS(String game) {
        for (GAmeResult tempresult : results) {
            if (tempresult.returnResult() == game ) {
                System.out.println(tempresult);
            }
        }

        //GAmeResult gAmeResult1 = results.get(0);
        //System.out.println(gAmeResult1.returnPlayer());
        //gAmeResult1=results.get(1);
        //System.out.println(gAmeResult1.returnPlayer());
        //System.out.println(gAmeResult1.toString());

    }

}
