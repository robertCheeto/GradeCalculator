package com.pluralsight;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        // Use Scanner to prompt for 1) Student Name, 2) Score for Tests, Quizzes, and Homework
        // collect 2 tests, 3 quizzes, 4 homeworks
        // calc avg for each category

        double testScore;
        double quizScore;
        double homeworkScore;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("=== Grade Calculator ===");
        System.out.print("Enter Student Name: ");
        keyboard.nextLine();

        System.out.println("Please enter 2 test scores: ");
        double testScore1 = keyboard.nextDouble();
        double testScore2 = keyboard.nextDouble();
        testScore = testScore1 + testScore2;

        System.out.println("\nPlease enter 3 quiz scores: ");
        double quizScore1 = keyboard.nextDouble();
        double quizScore2 = keyboard.nextDouble();
        double quizScore3 = keyboard.nextDouble();
        quizScore = quizScore1 + quizScore2 + quizScore3;

        System.out.println("\nPlease enter 4 homework scores: ");
        double homeworkScore1 = keyboard.nextDouble();
        double homeworkScore2 = keyboard.nextDouble();
        double homeworkScore3 = keyboard.nextDouble();
        double homeworkScore4 = keyboard.nextDouble();
        homeworkScore = homeworkScore1 + homeworkScore2 + homeworkScore3 + homeworkScore4;

    }
}
