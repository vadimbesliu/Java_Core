package Java_Collections;

import java.util.Objects;

public class FootballPlayer implements Comparable<FootballPlayer> {
    private String name;
    private int age;
    private String position;
    private String team;
    private int goalsThisSeason;

    public FootballPlayer(String name, int age, String position, String team, int goalsThisSeason) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.team = team;
        this.goalsThisSeason = goalsThisSeason;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getGoalsThisSeason() {
        return goalsThisSeason;
    }

    public void setGoalsThisSeason(int goalsThisSeason) {
        this.goalsThisSeason = goalsThisSeason;
    }

    @Override
    public String toString() {
        return "Name: " + this.name +"; Age: " + this.age + "; Position: " + this.position
                +"; Team: " + this.team + "; Goals This Season: " + this.goalsThisSeason+"}";
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof FootballPlayer) {
            FootballPlayer footballPlayer = (FootballPlayer) o;
            return footballPlayer.age == this.age && footballPlayer.goalsThisSeason == this.goalsThisSeason;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, position, team, goalsThisSeason);
    }

    @Override
    public int compareTo(FootballPlayer o) {
        if (this.goalsThisSeason == o.goalsThisSeason )
            return 0;
        else if (this.goalsThisSeason < o.goalsThisSeason) {
            return -1;
        }
        return 1;
    }

}
