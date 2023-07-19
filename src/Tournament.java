import java.util.ArrayList;
import java.util.Scanner;

public class Tournament  {

    private String tourName;

    private int year;
    private int teamcounter;
    private Team[] teams;


    public Tournament() {

        teamcounter=0;
        teams=new Team[20];
    }

    public Tournament(String tourName, int year) {
        this.tourName = tourName;
        this.year = year;
        teamcounter=0;
        teams=new Team[20];
    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }



    public void Teammaker()
    {

        Scanner sc=new Scanner(System.in);
        teams[teamcounter]=new Team();

        System.out.println("Enter Team name");
        teams[teamcounter].setName(sc.next());

        System.out.println("Enter Team Ceo");
        teams[teamcounter].setCeo(sc.next());

        System.out.println("How many Player you want to add");

        int no= sc.nextInt();

        for(int i=0;i<no;i++)
        {
            teams[teamcounter].PlayerCreate();
        }




        teamcounter++;

    }

    public void diplay()
    {
        System.out.println("Name of the Tournament :"+getTourName()+" Year : "+getYear());
        for(int i=0;i<teamcounter;i++)
        {
            teams[i].Display();
        }
    }



}
