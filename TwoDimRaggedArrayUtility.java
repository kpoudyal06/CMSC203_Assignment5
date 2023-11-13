/*

Class: CMSC203CRN22557

Instructor: Kuijt

Description: TwoDimRaggedArrayUtility holds multiple methods that work with a ragged array and/or files.

Due: 11/12/2023

Platform/compiler: Intellij

I pledge that I have completed the programming assignment independently.

I have not copied the code from a student or any source.

I have not given my code to any student.

Print your Name here: Kyle Poudyal

*/
package com.example.holidaybonus;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class TwoDimRaggedArrayUtility {
    private static final int MAX_ROW = 10;
    private static final int MAX_COLUMN = 10;

    public static double[][] readFile(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String [][] temp = new String[MAX_ROW][MAX_COLUMN];
        int stringRow = 0;
        int rowCount = 0;
        while (scanner.hasNextLine()) {
           String s = scanner.nextLine();
           temp[stringRow] = s.split(" ");
           if (temp[stringRow][0] != null) {
               rowCount++;
           }
           stringRow++;
        }
        double [][] data = new double[rowCount][];
        for (int row = 0; row < rowCount; row++) {
            data[row] = new double[temp[row].length];
            for (int col = 0; col < temp[row].length; col++) {
                data[row][col] = Double.parseDouble(temp[row][col]);
            }
        }
        return data;
    }

    public static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException {
        PrintWriter output = new PrintWriter(outputFile);
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {
                output.print(data[row][col] + " ");
            }
            output.println("");
        }
    }

    public static double getTotal(double[][] data) {
        double total = 0.0;
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {
                total += data[row][col];
            }
        }
        return total;
    }

    public static double getAverage(double[][] data) {
        double total = 0.0;
        int num = 0;
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {
                total += data[row][col];
                num++;
            }
        }
        return (total / num);
    }

    public static double getRowTotal(double[][] data, int row) {
        double total = 0.0;
        for (int col = 0; col < data[row].length; col++) {
            total += data[row][col];
        }
        return total;
    }

    public static double getColumnTotal(double[][] data, int col) {
        double total = 0.0;
        for (int row = 0; row < data.length; row++) {
            if (data[row].length > col) {
                total += data[row][col];
            }
        }
        return total;
    }

    public static double getHighestInRow(double[][] data, int row) {
        double highest = data[row][0];
        for (int col = 0; col < data[row].length; col++) {
            if (highest < data[row][col]) {
                highest = data[row][col];
            }
        }
        return highest;
    }

    public static int getHighestInRowIndex(double[][] data, int row) {
        int highest = 0;
        for (int col = 0; col < data[row].length; col++) {
            if (highest < data[row][col]) {
                highest = col;
            }
        }
        return highest;
    }

    public static double getLowestInRow(double[][] data, int row) {
        double lowest = data[row][0];
        for (int col = 0; col < data[row].length; col++) {
            if (lowest > data[row][col]) {
                lowest = data[row][col];
            }
        }
        return lowest;
    }

    public static int getLowestInRowIndex(double[][] data, int row) {
        int lowest = 0;
        for (int col = 0; col < data[row].length; col++) {
            if (lowest > data[row][col]) {
                lowest = col;
            }
        }
        return lowest;
    }

    public static double getHighestInColumn(double[][] data, int col) {
        double highest = Double.MIN_VALUE;
        for (int row = 0; row < data.length; row++) {
            if (data[row].length > col) {
                if (highest < data[row][col]) {
                    {
                        highest = data[row][col];
                    }
                }
            }
        }
        return highest;
    }

    public static int getHighestInColumnIndex(double[][] data, int col) {
        int highest = 0;
        for (int row = 0; row < data.length; row++) {
            if (highest < data[row][col]) {
                highest = row;
            }
        }
        return highest;
    }

    public static double getLowestInColumn(double[][] data, int col) {
        double lowest = Double.MAX_VALUE;
        for (int row = 0; row < data.length; row++) {
            if (data[row].length > col) {
                if (lowest > data[row][col]) {
                    lowest = data[row][col];
                }
            }
        }
        return lowest;
    }

    public static int getLowestInColumnIndex(double[][] data, int col) {
        int lowest = 0;
        for (int row = 0; row < data.length; row++) {
            if (lowest > data[row][col]) {
                lowest = row;
            }
        }
        return lowest;
    }

    public static double getHighestInArray(double[][] data) {
        double highest = data[0][0];
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {
                if (highest < data[row][col]) {
                    highest = data[row][col];
                }
            }
        }
        return highest;
    }

    public static double getLowestInArray(double[][] data) {
        double lowest = data[0][0];
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {
                if (lowest > data[row][col]) {
                    lowest = data[row][col];
                }
            }
        }
        return lowest;
    }
}
