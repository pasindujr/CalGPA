package com.company;

public class Main {

    public static void main(String[] args) {
        Student pasindu = new Student();
        pasindu.marksoop = 76;
        pasindu.marksdata = 45;
        pasindu.marksstats = 65;
        pasindu.markseng = 88;
        pasindu.marksflash = 55;
        pasindu.markssad=78;
        pasindu.marksethics=70;
        pasindu.marksdcn=66;

        System.out.println("Grade for oop is " + pasindu.getGrade("oop", "")+" and grade point of "+pasindu.getGP(0));

        System.out.println("Grade for data structures is " + pasindu.getGrade("data", ""));

        System.out.println("Grade for stats is " + pasindu.getGrade("stats", ""));

        System.out.println("Grade for english is " + pasindu.getGrade("eng", ""));

        System.out.println("Grade for flash is " + pasindu.getGrade("flash", ""));

        System.out.println("Grade for sad is " + pasindu.getGrade("sad", ""));

        System.out.println("Grade for ethics is " + pasindu.getGrade("ethics", ""));

        System.out.println("Grade for dcn is " + pasindu.getGrade("dcn", ""));


    }
}
