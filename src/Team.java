
import java.util.Scanner;

public class Team {
    private String name;
    private String ceo;
    private Player[] player;


    private int playerCounter;

    public Team() {
        player=new Player[20];
        playerCounter=0;
    }

    public Team(String name, String ceo) {
        this.name = name;
        this.ceo = ceo;
        player=new Player[20];
        playerCounter=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }






    public void PlayerCreate()
    {
        Scanner scan =new Scanner(System.in);

        System.out.println("Enter 1-> For Batsman || 2-> For Bowler || 3-> For Wicketkeeper");
            int Choice = scan.nextInt();

            switch (Choice) {

                case 1:
                    player[playerCounter] = new Batsman();
                    player[playerCounter].read();
                    break;

                case 2:
                    player[playerCounter] = new Bowler();
                    player[playerCounter].read();
                    break;
                case 3:
                    player[playerCounter] = new Wicketkeeper();
                    player[playerCounter].read();
                    break;
            }
            playerCounter++;



    }


    public void Display()

    {
        System.out.println("Team name : "+name);
        System.out.println("CEO : "+ceo);
        for(int i=0;i<playerCounter;i++)
        {
            System.out.println(player[i].toString());
        }
    }

}
