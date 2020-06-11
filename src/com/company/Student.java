package com.company;

public class Student {
    String name;
    double gpa;
    String subject;
    int marksoop;
    int marksdata;
    int marksstat;
    int markseng;
    int marksflash;
    int markssad;
    int marksethics;
    int marksdcn;

    public int getGrade(String subject) {
        double gp;
        this.subject = subject;
        switch (subject) {
            case "oop":
                if (marksoop >= 70) {
                    gp = 4;
                } else if (marksoop >= 65) {
                    gp = 3.7;
                } else if (marksoop >= 60) {
                    gp = 3.3;
                } else if (marksoop >= 55) {
                    gp = 3;
                }

        }
        return -1;

    }
}

