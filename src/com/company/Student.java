package com.company;

public class Student {
    String name;
    double gpa;
    String subject;
    int marksoop;
    int marksdata;
    int marksstats;
    int markseng;
    int marksflash;
    int markssad;
    int marksethics;
    int marksdcn;
    String grade;
    double gp;

    public String getGrade(String subject, String grade) {
        this.grade = grade;
        this.subject = subject;
        if (subject.equals("oop")) {
            if (marksoop >= 70) {
                grade = "aplus";
            } else if (marksoop >= 65) {
                grade = "aminus";
            } else if (marksoop >= 60) {
                grade = "bplus";
            } else if (marksoop >= 55) {
                grade = "b";
            } else if (marksoop >= 50) {
                grade = "bminus";
            } else if (marksoop >= 45) {
                grade = "cplus";
            } else if (marksoop >= 40) {
                grade = "c";
            } else if (marksoop >= 35) {
                grade = "cminus";
            } else if (marksoop >= 30) {
                grade = "dplus";
            } else if (marksoop <= 25) {
                grade = "d";
            } else {
                grade = "e";
            }
        }

        if (subject.equals("data")) {
            if (marksdata >= 70) {
                grade = "aplus";
            } else if (marksoop >= 65) {
                grade = "aminus";
            } else if (marksoop >= 60) {
                grade = "bplus";
            } else if (marksoop >= 55) {
                grade = "b";
            } else if (marksoop >= 50) {
                grade = "bminus";
            } else if (marksoop >= 45) {
                grade = "cplus";
            } else if (marksoop >= 40) {
                grade = "c";
            } else if (marksoop >= 35) {
                grade = "cminus";
            } else if (marksoop >= 30) {
                grade = "dplus";
            } else if (marksoop <= 25) {
                grade = "d";
            } else {
                grade = "e";
            }
        }

        if (subject.equals("stats")) {
            if (marksstats >= 70) {
                grade = "aplus";
            } else if (marksoop >= 65) {
                grade = "aminus";
            } else if (marksoop >= 60) {
                grade = "bplus";
            } else if (marksoop >= 55) {
                grade = "b";
            } else if (marksoop >= 50) {
                grade = "bminus";
            } else if (marksoop >= 45) {
                grade = "cplus";
            } else if (marksoop >= 40) {
                grade = "c";
            } else if (marksoop >= 35) {
                grade = "cminus";
            } else if (marksoop >= 30) {
                grade = "dplus";
            } else if (marksoop <= 25) {
                grade = "d";
            } else {
                grade = "e";
            }
        }

        if (subject.equals("eng")) {
            if (markseng >= 70) {
                grade = "aplus";
            } else if (marksoop >= 65) {
                grade = "aminus";
            } else if (marksoop >= 60) {
                grade = "bplus";
            } else if (marksoop >= 55) {
                grade = "b";
            } else if (marksoop >= 50) {
                grade = "bminus";
            } else if (marksoop >= 45) {
                grade = "cplus";
            } else if (marksoop >= 40) {
                grade = "c";
            } else if (marksoop >= 35) {
                grade = "cminus";
            } else if (marksoop >= 30) {
                grade = "dplus";
            } else if (marksoop <= 25) {
                grade = "d";
            } else {
                grade = "e";
            }
        }

        if (subject.equals("flash")) {
            if (marksflash >= 70) {
                grade = "aplus";
            } else if (marksoop >= 65) {
                grade = "aminus";
            } else if (marksoop >= 60) {
                grade = "bplus";
            } else if (marksoop >= 55) {
                grade = "b";
            } else if (marksoop >= 50) {
                grade = "bminus";
            } else if (marksoop >= 45) {
                grade = "cplus";
            } else if (marksoop >= 40) {
                grade = "c";
            } else if (marksoop >= 35) {
                grade = "cminus";
            } else if (marksoop >= 30) {
                grade = "dplus";
            } else if (marksoop <= 25) {
                grade = "d";
            } else {
                grade = "e";
            }
        }

        if (subject.equals("sad")) {
            if (marksdata >= 70) {
                grade = "aplus";
            } else if (marksoop >= 65) {
                grade = "aminus";
            } else if (marksoop >= 60) {
                grade = "bplus";
            } else if (marksoop >= 55) {
                grade = "b";
            } else if (marksoop >= 50) {
                grade = "bminus";
            } else if (marksoop >= 45) {
                grade = "cplus";
            } else if (marksoop >= 40) {
                grade = "c";
            } else if (marksoop >= 35) {
                grade = "cminus";
            } else if (marksoop >= 30) {
                grade = "dplus";
            } else if (marksoop <= 25) {
                grade = "d";
            } else {
                grade = "e";
            }
        }

        if (subject.equals("ethics")) {
            if (marksdata >= 70) {
                grade = "aplus";
            } else if (marksoop >= 65) {
                grade = "aminus";
            } else if (marksoop >= 60) {
                grade = "bplus";
            } else if (marksoop >= 55) {
                grade = "b";
            } else if (marksoop >= 50) {
                grade = "bminus";
            } else if (marksoop >= 45) {
                grade = "cplus";
            } else if (marksoop >= 40) {
                grade = "c";
            } else if (marksoop >= 35) {
                grade = "cminus";
            } else if (marksoop >= 30) {
                grade = "dplus";
            } else if (marksoop <= 25) {
                grade = "d";
            } else {
                grade = "e";
            }
        }

        if (subject.equals("dcn")) {
            if (marksdata >= 70) {
                grade = "aplus";
            } else if (marksoop >= 65) {
                grade = "aminus";
            } else if (marksoop >= 60) {
                grade = "bplus";
            } else if (marksoop >= 55) {
                grade = "b";
            } else if (marksoop >= 50) {
                grade = "bminus";
            } else if (marksoop >= 45) {
                grade = "cplus";
            } else if (marksoop >= 40) {
                grade = "c";
            } else if (marksoop >= 35) {
                grade = "cminus";
            } else if (marksoop >= 30) {
                grade = "dplus";
            } else if (marksoop <= 25) {
                grade = "d";
            } else {
                grade = "e";
            }
        }
        return grade;

    }

    public double getGP(double gp) {
        this.gp = gp;
        switch (grade) {
            case "aplus":
                gp = 4;
            case "aminus":
                gp = 3.7;
            case "bplus":
                gp = 3.3;
            case "b":
                gp = 3;
            case "bminus":
                gp = 2.7;
            case "cplus":
                gp = 2.3;
            case "c":
                gp = 2;
            case "cminus":
                gp = 1.7;
            case "dplus":
                gp = 1.3;
            case "d":
                gp = 1;
            case "e":
                gp = 0;
        }


        return gp;
    }


}


