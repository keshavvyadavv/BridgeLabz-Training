package com.examcell;
//Create ExamCellMain class.
public class ExamCellMain {

    // merge two sorted subarrays
    public static void merge(Student[] arr, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;
        Student[] left = new Student[n1];
        Student[] right = new Student[n2];
        for (int i = 0; i < n1; i++) {
        	left[i] = arr[low + i];        	
        }
        for (int j = 0; j < n2; j++) {
        	right[j] = arr[mid + 1 + j];        	
        }
        int i = 0, j = 0, k = low;
        while (i < n1 && j < n2) {
            if (left[i].getScore() >= right[j].getScore()) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < n1)
            arr[k++] = left[i++];

        while (j < n2)
            arr[k++] = right[j++];
    }
    // method merge Sort
    public static void mergeSort(Student[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }
    // main method
    public static void main(String[] args) {
        //scores from different centers
        Student[] students = {
            new Student("a", 450),
            new Student("b", 430),
            new Student("c", 470),
            new Student("d", 420),
            new Student("e", 480),
            new Student("f", 440)
        };
        //sort for state-level rank list using mergeSort
        mergeSort(students, 0, students.length - 1);

        System.out.println("state-Level rank list:");
        int rank = 1;
        for (Student s : students) {
            System.out.println("Rank " + rank++ + ": " + s);
        }
    }
}
