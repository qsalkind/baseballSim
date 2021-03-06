package baseballsim;
import java.util.*;
/**
 * @author Quinn
 */
public class ScoreCard {
    //change runs to an array for a box score...
    private int runs;
    private int currentOuts;
    private int inning;
    private ArrayList<String> scoringSummary;
    
    public ScoreCard() {
        runs = 0;
        currentOuts = 0;
        inning = 1;
        scoringSummary = new ArrayList<>();
    }
    
    /**
     * Reset at the send of a game, clears all fields.
     */
    public void reset() {
        this.runs = 0;
        this.currentOuts=0;
        this.inning = 0;
        this.scoringSummary.clear();
    }
    
    public void addRuns(int runs) {
        this.runs += runs;
    }
    
    public void addOut() {
        currentOuts++;
    }
    
    public void clearOuts() {
        currentOuts = 0;
    }
    
    public void addScoringSummary(String s) {
        scoringSummary.add(s);
    }
    
    public void incrimentInning() {
        inning++;
    }

    public int getRuns() {
        return runs;
    }

    public int getCurrentOuts() {
        return currentOuts;
    }

    public int getInning() {
        return inning;
    }
    
    @Override
    public String toString() {
        return "Outs: " + currentOuts + ", Inning: " + inning + ", Runs: " + runs;
    }
    
}

