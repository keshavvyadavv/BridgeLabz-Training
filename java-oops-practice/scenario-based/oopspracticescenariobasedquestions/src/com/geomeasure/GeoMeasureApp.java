package com.geomeasure;

import java.util.*;
public class GeoMeasureApp {
    public static void main(String[] args) {
    	
    	//create scanner object 
        Scanner sc = new Scanner(System.in);
        List<Line> lines = new ArrayList<>();
        for (int i = 1; i <= 2; i++) {
            System.out.println("Enter x1 y1  x2 y2 for line " + i + ":");
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            lines.add(new Line(x1, y1, x2, y2));
        }
        double len1 = lines.get(0).getLength();
        double len2 = lines.get(1).getLength();

        // Comparison
        if (len1 == len2)
            System.out.println("Both lines are equal in  length.");
        else if (len1 > len2)
            System.out.println("line 1 is  longer.");
        else
            System.out.println("Line  2 is longer.");
    }
}
