import java.util.Date;

public class GAmeResult {
    private Player player;
    private String result;
    private Date date;

    public GAmeResult(Player player, String result) {
        this.result = result;
        this.player = player;
        this.date = new Date();

    }

    public String returnResult() {
        return result;
    }

    public Player returnPlayer() {
        return player;
    }

    public String toString() {
        return player.toString() + " " + date.toString();
    }
}
