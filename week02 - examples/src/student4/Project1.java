// CMIS 242 
// Duane J. Jarc
// May 26, 2015
// Week 2 Examples

// This program provides a model for project 1. It reads in a file of student
// records that also contain the student's gender. It puts each student
// into a array based on gender. It then displays the contents of both arrays
// with a count of the number of students in each.

package student4;

import java.io.*;
import java.util.*;

class Project1
{
	public static void main(String[] args) throws Exception
	{
		final int MAX_STUDENT = 10;
		Student[] male = new Student[MAX_STUDENT], female = new Student[MAX_STUDENT];
		Scanner file = new Scanner(new File("students.txt"));
		int maleCount = 0, femaleCount = 0;
		double total = 0.;
		while (file.hasNext())
		{
			String gender = file.next();
			String studentType = file.next();
			String name = file.next();
			String major = file.next();
			Student student = null;
			switch (studentType)
			{
				case "Student":
					student = new Student(name, major);
					break;
				case "Undergraduate":
					student = new Undergraduate(name, major);
					break;
				case "Graduate":
					String undergradMajor = file.next();
					student = new Graduate(name, major, undergradMajor);
					break;
			}
			switch (gender)
			{
				case "Male":
					male[maleCount++] = student;
					break;
				case "Female":
					female[femaleCount++] = student;
					break;
			}
		}
		display("Male", male, maleCount);
		display("Female", female, femaleCount);
	}
	private static void display(String gender, Student[] students, int count)
	{
		System.out.printf("\nInformation for %s Students\n\n", gender);
		for (int i = 0 ; i < count; i++)
		{
			Student student = students[i];
			System.out.println(student);
		}
		System.out.println("\nTotal number = " + count);
	}
}