package com.example.maven_github_demo;

import java.util.Scanner;

public class Grade {

    public String calculateGrade(int marks) {

        if (marks >= 90) {
            return "A";
        }
        else if (marks >= 80) {
            return "B";
        }
        else if (marks >= 68) {
            return "C";
        }
        else if (marks >= 40) {
            return "D";
        }
        else {
            return "Fail";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        Grade g = new Grade();

        System.out.println("Grade: " + g.calculateGrade(marks));

        sc.close();
    }
}