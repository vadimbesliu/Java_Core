package Java_Collections;

import java.util.*;

public class RandomList {
    public static void main(String[] args) {
        List<FootballPlayer> list1 = new ArrayList<>();



        FootballPlayer player1 = new FootballPlayer("Karim Benzema", 32, "Forward", "Rear Madrid", 8);
        FootballPlayer player2 = new FootballPlayer("Luka Modric", 35, "Midfielder", "Rear Madrid", 1);
        FootballPlayer player3 = new FootballPlayer("Lionel Messi", 33, "Forword", "Barcelona", 10);
        FootballPlayer player4 = new FootballPlayer("Thibaut Courtois", 28, "Goalkeeper", "Rear Madrid", 0);
        FootballPlayer player5 = new FootballPlayer("Antoine Griezmann", 29, "Forward", "Barcelona", 2);

        list1.add(player1);
        list1.add(player2);
        list1.add(player3);
        list1.add(player4);
        list1.add(player5);
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a method ");
        System.out.println("Type 1 to compare by goals scored this season");
        System.out.println("Type 2 to compare by age");
        int userInput=sc.nextInt();
        if(userInput==1){
            Collections.sort(list1);
            for (FootballPlayer footballPlayer : list1){
                System.out.println(footballPlayer);
            }
        }
        else if (userInput==2){
            Collections.sort(list1, new ComparByAge());
            for(FootballPlayer footballPlayer : list1){
                System.out.println(footballPlayer);
            }
        }



    }
}
