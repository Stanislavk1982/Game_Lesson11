import java.util.Date;

public class GameResult {
    private Player player;
    private String result;
    private Date date;

    public GameResult(Player player, String result) {
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

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != GameResult.class) {
            return false;
        }

        GameResult gameResult = (GameResult) obj;

        if (this.player == gameResult.player && this.result == gameResult.result && this.date == gameResult.date) {
            return true;
        }
        return false;
    }
}
