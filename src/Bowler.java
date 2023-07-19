import java.util.Scanner;

public class Bowler<String> extends Batsman {
    private int overs;

    private int wickets;

    public Bowler() {
    }


    public Bowler(int playerId, String playerName, int runs, int hundreds, int fifties, int overs, int wickets) {
        super(playerId, (java.lang.String) playerName, runs, hundreds, fifties);
        this.overs = overs;
        this.wickets = wickets;
    }

    public int getOvers() {
        return overs;
    }

    public void setOvers(int overs) {
        this.overs = overs;
    }

    public int getWickets() {
        return wickets;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }

    @Override
    public java.lang.String toString() {
        return super.toString()+ "  Bowler{" +
                "overs=" + overs +
                ", wickets=" + wickets +
                '}';
    }

    public void read(){
        super.read();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter overs and Wickets");
        this.overs=sc.nextInt();
        this.wickets=sc.nextInt();

    }
}
