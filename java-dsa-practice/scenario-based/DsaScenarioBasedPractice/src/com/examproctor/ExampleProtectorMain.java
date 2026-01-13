package com.examproctor;

import java.util.*;

public class ExampleProtectorMain {
	//method that return all the question
    public static String[] getQuestions() {
        return new String[] {
            "1. What is Java?",
            "2. Who developed Java?",
            "3. What is the default package in Java?",
            "4. Is Java platform independent?",
            "5. What is JVM?",
            "6. What is JDK?",
            "7. What is JRE?",
            "8. Which keyword is used to inherit a class?",
            "9. Which method is the entry point of Java program?",
            "10. What is bytecode?"
        };
    }
    //method that return the options
    public static String[][] getOptions() {
        return new String[][] {
            {"a. Operating System", "b. Programming Language", "c. Database", "d. Browser"},
            {"a. Microsoft", "b. Apple", "c. Sun Microsystems", "d. Google"},
            {"a. java.util", "b. java.io", "c. java.lang", "d. java.net"},
            {"a. No", "b. Yes", "c. Sometimes", "d. Depends on OS"},
            {"a. Java Variable Machine", "b. Java Virtual Machine", "c. Java Visual Machine", "d. Joint Virtual Machine"},
            {"a. Java Runtime", "b. Java Debugger", "c. Java Development Kit", "d. Java Data Kit"},
            {"a. Java Runtime Environment", "b. Java Resource Engine", "c. Java Run Executor", "d. Java Real Engine"},
            {"a. implement", "b. extends", "c. inherits", "d. super"},
            {"a. start()", "b. run()", "c. main()", "d. public static void main(String[] args)"},
            {"a. Source code", "b. Machine code", "c. Intermediate code", "d. Binary code"}
        };
    }
    //correct Answers
    public static Map<Integer, Character> getCorrectAnswers() {
        Map<Integer, Character> map = new HashMap<>();
        map.put(1, 'b');
        map.put(2, 'c');
        map.put(3, 'c');
        map.put(4, 'b');
        map.put(5, 'b');
        map.put(6, 'c');
        map.put(7, 'a');
        map.put(8, 'b');
        map.put(9, 'd');
        map.put(10, 'c');
        return map;
    }
    //score calculation function
    public static int calculateScore(Map<Integer, Character> correct, Map<Integer, Character> student) {
        int score = 0;
        for (int qId : student.keySet()) {
            if (student.get(qId) == correct.get(qId)) {
                score++;
            }
        }
        return score;
    }

    public static void main(String[] args) {

    	//create input object
        Scanner input = new Scanner(System.in);
        //getting question and options
        String[] questions = getQuestions();
        String[][] options = getOptions();

        Stack<Integer> navigationStack = new Stack<>();
        Map<Integer, Character> studentAnswers = new HashMap<>();
        Map<Integer, Character> correctAnswers = getCorrectAnswers();
        //infinate
        while (true) {
            System.out.println("Enter question number (1–10): ");
            int qNo = input.nextInt();
            if (qNo < 1 || qNo > 10) {
                System.out.println("Invalid question number!");
                continue;
            }
            System.out.println(questions[qNo - 1]);
            for (String opt : options[qNo - 1]) {
                System.out.println(opt);
            }
            System.out.println("Enter option (a/b/c/d): ");
            char ans = input.next().charAt(0);
            navigationStack.push(qNo);
            studentAnswers.put(qNo, ans);
            System.out.println("Press n for next or s to submit:");
            char choice = input.next().charAt(0);
            if (choice == 's') {
                break;
            }
        }
        System.out.println("\nnavigation history (last visited first):");
        while (!navigationStack.isEmpty()) {
            System.out.print(navigationStack.pop() + " <- ");
        }

        int score = calculateScore(correctAnswers, studentAnswers);
        System.out.println("\nfinal Score: " + score + " / 10");
    }
}
