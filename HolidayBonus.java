/*

Class: CMSC203CRN22557

Instructor: Kuijt

Description: HolidayBonus creates an array with the bonuses of each store, and calculates the total bonuses between all the businesses.

Due: 11/12/2023

Platform/compiler: Intellij

I pledge that I have completed the programming assignment independently.

I have not copied the code from a student or any source.

I have not given my code to any student.

Print your Name here: Kyle Poudyal

*/
package com.example.holidaybonus;

import com.example.holidaybonus.TwoDimRaggedArrayUtility;

public class HolidayBonus
{
    private static final int HIGHEST_BONUS = 5000;
    private static final int BONUS = 2000;
    private static final int LOWEST_BONUS = 1000;
    public HolidayBonus(){}
    public static double [] calculateHolidayBonus(double[][] data) {
        double [] bonuses = new double[data.length];
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {
                if (data[row][col] == TwoDimRaggedArrayUtility.getHighestInColumn(data, col)) {
                    bonuses[row] += HIGHEST_BONUS;
                } else
                if (data[row][col] == TwoDimRaggedArrayUtility.getLowestInColumn(data, col)) {
                    bonuses[row] += LOWEST_BONUS;
                }
                else {
                    bonuses[row] += BONUS;
                }
            }
        }
        return bonuses;
    }

    public static double calculateTotalHolidayBonus(double[][] data) {
        double [] bonuses = new double[data.length];
        double totalBonuses = 0.0;
        bonuses = calculateHolidayBonus(data);
        for (int i = 0; i < bonuses.length; i++) {
            totalBonuses += bonuses[i];
        }
        return totalBonuses;
    }
}
