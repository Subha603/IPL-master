import java.util.Scanner;

abstract class Player {
    private int playerId;
    private String playerName;

    public Player() {
    }

    public Player(int playerId, String playerName) {
        this.playerId = playerId;
        this.playerName = playerName;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerId=" + playerId +
                ", playerName='" + playerName + '\'' +
                '}';
    }

    public void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Playerid and Playername");

        this.playerId=sc.nextInt();
        this.playerName=sc.next();
    }
}
