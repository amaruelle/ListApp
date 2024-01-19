package org.leftbrained.listapp;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Employee {
    private String mName;
    private String mTeam;
    private int rating;
    private int codeLines;
    private int projects;
    private int image;


    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getProjects() {
        return projects;
    }

    public void setProjects(int projects) {
        this.projects = projects;
    }

    public int getCodeLines() {
        return codeLines;
    }

    public void setCodeLines(int codeLines) {
        this.codeLines = codeLines;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getmTeam() {
        return mTeam;
    }

    public void setmTeam(String mTeam) {
        this.mTeam = mTeam;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public Employee(String mName, String mTeam, int rating, int codeLines, int projects, int image) {
        this.mName = mName;
        this.mTeam = mTeam;
        this.rating = rating;
        this.codeLines = codeLines;
        this.projects = projects;
        this.image = image;
    }

    public Employee(String mName, String mTeam, int mImage) {
        this.mTeam = mTeam;
        this.mName = mName;
        this.image = mImage;
        this.rating = ThreadLocalRandom.current().nextInt(1, 6);
        this.codeLines = ThreadLocalRandom.current().nextInt(1000, 50001);
        this.projects = ThreadLocalRandom.current().nextInt(1, 13);
    }

    public static ArrayList<Employee> createEmployeesList(int numEmployees) {
        ArrayList<Employee> employees = new ArrayList<>();
        if (numEmployees > 6) return employees;
        for (int i = 1; i <= numEmployees; i++) {
            employees.add(new Employee("Employee " + i, "Team " + i, R.drawable.avatar3));
        }
        return employees;
    }
}
