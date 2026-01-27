package com.examscanner;

import java.util.PriorityQueue;

public class MainApp {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\thisi\\OneDrive\\Desktop\\confident\\ClassFile.csv";

        PriorityQueue<StudentResult> results =
                ExamScanner.scanExam(filePath);

        System.out.println("-- Student Rankings ----");

        while (!results.isEmpty()) {
            System.out.println(results.poll());
        }
    }
}