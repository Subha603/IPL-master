import java.util.Scanner;

public class Wicketkeeper extends Batsman{
    private int stump;
    private int catches;

    public Wicketkeeper() {
    }

    public Wicketkeeper(int playerId, String playerName, int runs, int hundreds, int fifties, int stump, int catches) {
        super(playerId, playerName, runs, hundreds, fifties);
        this.stump = stump;
        this.catches = catches;
    }

    public int getStump() {
        return stump;
    }

    public void setStump(int stump) {
        this.stump = stump;
    }

    public int getCatches() {
        return catches;
    }

    public void setCatches(int catches) {
        this.catches = catches;
    }

    @Override
    public String toString() {
        return super.toString()+"  Wicketkeeper{" +
                "stump=" + stump +
                ", catches=" + catches +
                '}';
    }

    public void read (){
        super.read();
        System.out.println("Enter Stumps and Catches ");
        Scanner sc=new Scanner(System.in);

        this.stump=sc.nextInt();
        this.catches=sc.nextInt();

    }
}
