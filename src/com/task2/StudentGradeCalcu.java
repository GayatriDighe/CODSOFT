package com.task2;
//TASK 2
//STUDENT GRADE CALCULATOR
//Input: Take marks obtained (out of 100) in each subject.
//Calculate Total Marks: Sum up the marks obtained in all subjects.
//Calculate Average Percentage: Divide the total marks by the total number of subjects to get the average percentage.
//Grade Calculation: Assign grades based on the average percentage achieved.
//Display Results: Show the total marks, average percentage, and the corresponding grade to the user.
import java.util.Scanner;

public class StudentGradeCalcu {
    public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Student Grade Calculator!");
	    System.out.print("Enter the number of subjects:");
	        int Subjectsnum = scanner.nextInt();
	       
	        int totalMarks = 0;
	        System.out.println("Enter the marks for each subject (out of 100):");
	        for (int i = 1; i <= Subjectsnum; i++) {
	            System.out.print("Enter marks for subject " + i + ": ");
	            int marks = scanner.nextInt();
	            
	            if (marks < 0 || marks > 100) {
	                System.out.println("Invalid marks! Marks should be between 0 and 100.");
	                i--; 
	                continue;
	            }
	            totalMarks += marks;
	        }
	        double averagePercentage = (double) totalMarks / (Subjectsnum * 100) * 100;
	        
	        char grade;
	        String gradeMessage = "";
	        
	        if (averagePercentage >= 90) {
	            grade = 'A';
	            gradeMessage ="First class with Distinction";
	        } else if (averagePercentage >= 80) {
	            grade = 'B';
	            gradeMessage ="First class";
	        } else if (averagePercentage >= 70) {
	            grade = 'C';
	            gradeMessage ="Second class";
	        } else if (averagePercentage >= 60) {
	            grade = 'D';
	            gradeMessage ="Pass class";
	        } else if (averagePercentage >= 50) {
	            grade = 'E';
	            gradeMessage ="Marginal class";
	        } else {
	            grade = 'F';
	            gradeMessage ="Fail";
	        }
	        
	        System.out.println("\nTotal Marks Obtained:"+totalMarks);
	        System.out.println("Average Percentage:"+averagePercentage + "%");
	        System.out.println("Grade:"+grade);
	        System.out.println("Grade Message:" +gradeMessage); 
	        scanner.close();
	    }
}

