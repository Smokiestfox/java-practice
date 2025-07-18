import java.util.Scanner;
import java.util.ArrayList;

public class Student
{
    private String name;
    private int id;
    private double score;

    public Student(String name, int id, double score)
    {
        this.name = name;
        this.id = id;
        this.score = score;
    }

    public void printinfo()
    {
        System.out.println(name + " - " + id + " - " + score);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getScore() {
        return score;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setScore(double score) {
        this.score = score;
    }
}


