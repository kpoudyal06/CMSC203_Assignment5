/*

Class: CMSC203CRN22557

Instructor: Kuijt

Description: HolidayBonusTestStudent tests HolidayBonus.java

Due: 11/12/2023

Platform/compiler: Intellij

I pledge that I have completed the programming assignment independently.

I have not copied the code from a student or any source.

I have not given my code to any student.

Print your Name here: Kyle Poudyal

*/

package com.example.holidaybonus;

import static org.junit.Assert.*;

import com.example.holidaybonus.HolidayBonus;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HolidayBonusTestStudent {

    private double[][] set1 = {{4,5,6,7},{8,9,10},{11,12,13,14}};
    private double[][] set2 = {{15, 20, 25}, {30, 35}, {35, 40, 45, 50}};

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testCalculateHolidayBonus() {
        try {
            double[] result = HolidayBonus.calculateHolidayBonus(set1);
            assertEquals(4000.0, result[0], .001);
            assertEquals(6000.0, result[1], .001);
            assertEquals(20000.0, result[2], .001);
        } catch (Exception e) {
            fail("This should not have caused an Exception");
        }

    }

    @Test
    public void testCalculateTotalHolidayBonus() {
        assertEquals(27000.0, HolidayBonus.calculateTotalHolidayBonus(set2), .001);
    }

}