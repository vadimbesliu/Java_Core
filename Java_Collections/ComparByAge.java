package Java_Collections;

import java.util.Comparator;

public class ComparByAge implements Comparator<Object> {
    @Override
    public int compare(Object o1, Object o2) {
        FootballPlayer footballPlayer1 = (FootballPlayer) o1;
        FootballPlayer footballPlayer2 = (FootballPlayer) o2;
        return Integer.compare(footballPlayer1.getAge(), footballPlayer2.getAge());
    }
}
