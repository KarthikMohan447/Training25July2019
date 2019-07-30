package day10;

import java.io.IOException;
import java.util.Scanner;

class Questions {
	
int points = 0;

Scanner sc = new Scanner(System.in);

void firstQuestion() {                                                 
	System.out.println("What is the capital of Australia?");
	System.out.println("1.Sydney");
	System.out.println("2.Canberra");
	System.out.println("3.Adelaide");
	System.out.println("4.Melbourne");
	System.out.println("===========");
	System.out.println("Enter the Choice");
	int choice = sc.nextInt();
	int correctAnswer = 2;
	
	if (choice == correctAnswer) {
		System.out.println("Good, Correct Answer!");
		points = points+1;
	}
	else{
		System.out.println("Wrong Answer!");
	}
	System.out.println("Your current point is" + points);
}

void secondQuestion() {
	System.out.println("What is the capital of United States of America?");
	System.out.println("1.New York");
	System.out.println("2.Texas");
	System.out.println("3.Washington");
	System.out.println("4.Chicago");
	System.out.println("===========");
	System.out.println("Enter the Choice");
	int choice = sc.nextInt();
	int correctAnswer = 3;
	
	if (choice == correctAnswer) {
		System.out.println("Good, Correct Answer!");
		points = points+1;
	}
	else{
		System.out.println("Wrong Answer!");
	}
	System.out.println("Your current point is" + points);
}

void thirdQuestion() {
	System.out.println("What is the capital of China?");
	System.out.println("1.Beijing");
	System.out.println("2.Shanghai");
	System.out.println("3.Tibet");
	System.out.println("4.Hubei");
	System.out.println("===========");
	System.out.println("Enter the Choice");
	int choice = sc.nextInt();
	int correctAnswer = 1;
	
	if (choice == correctAnswer) {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
		System.out.println("Good, Correct Answer!");
		points = points+1;
	}
	else{
		System.out.println("Wrong Answer!");
	}
	System.out.println("Your current point is" + points);
}

void fourthQuestion() {
	System.out.println("What is the capital of Japan?");
	System.out.println("1.Osaka");
	System.out.println("2.Kyoto");
	System.out.println("3.Hiroshima");
	System.out.println("4.Tokyo");
	System.out.println("===========");
	System.out.println("Enter the Choice");
	int choice = sc.nextInt();
	int correctAnswer = 4;
	
	if (choice == correctAnswer) {
		System.out.println("Good, Correct Answer!");
		points = points+1;
	}
	else{
		System.out.println("Wrong Answer!");
	}
	System.out.println("Your current point is" + points);
	System.out.println("===============================");
	System.out.println("Your total points is" + points);
}

}
	
public class Quiz {
	
	public static void main(String[] args) throws IOException
	{
		Questions refQuestions = new Questions();
		refQuestions.firstQuestion();
		refQuestions.secondQuestion();
		refQuestions.thirdQuestion();
		refQuestions.fourthQuestion();
	}
	
}
	