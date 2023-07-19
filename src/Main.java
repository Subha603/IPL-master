import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        Tournament tournament=new Tournament();

        System.out.println("Enter Name of The Tournament");
        tournament.setTourName(sc.next());
        System.out.println("Enter The Year");
        tournament.setYear(sc.nextInt());

        int choice;
        do{

            System.out.println("Enter 1: for Add Team 2: for Display team 3: for exit");
             choice=sc.nextInt();

            switch (choice)
            {
                case 1:
                    tournament.Teammaker();
                    break;
                case 2:
                    tournament.diplay();
                    break;
                case 3:
                    break;
            }


        }while(choice!=3);
    }
}