/*

Class: CMSC203CRN22557

Instructor: Kuijt

Description: TwoDimRaggedArrayUtilityTestStudent tests TwoDimRaggedArrayUtility.java

Due: 11/12/2023

Platform/compiler: Intellij

I pledge that I have completed the programming assignment independently.

I have not copied the code from a student or any source.

I have not given my code to any student.

Print your Name here: Kyle Poudyal

*/
package com.example.holidaybonus;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TwoDimRaggedArrayUtilityTestStudent {
    private double[][] set1 = {{4,5,6,7},{8,9,10},{11,12,13,14}};
    private double[][] set2 = {{15, 20, 25}, {30, 35}, {35, 40, 45, 50}};

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetTotal() { assertEquals(99, TwoDimRaggedArrayUtility.getTotal(set1), .001); }

    @Test
    public void testGetAverage() { assertEquals(9, TwoDimRaggedArrayUtility.getAverage(set1), .001); }

    @Test
    public void testGetRowTotal() {
        assertEquals(27,TwoDimRaggedArrayUtility.getRowTotal(set1,1),.001);
    }

    @Test
    public void testGetColumnTotal() {
        assertEquals(95,TwoDimRaggedArrayUtility.getColumnTotal(set2,1),.001);
    }

    @Test
    public void testGetHighestInRow() { assertEquals(50,TwoDimRaggedArrayUtility.getHighestInRow(set2,2),.001); }

    @Test
    public void testGetHighestInRowIndex() { assertEquals(3,TwoDimRaggedArrayUtility.getHighestInRowIndex(set1,0),.001); }

    @Test
    public void testGetLowestInRow() { assertEquals(30,TwoDimRaggedArrayUtility.getLowestInRow(set2,1),.001); }

    @Test
    public void testGetLowestInRowIndex() { assertEquals(0,TwoDimRaggedArrayUtility.getLowestInRowIndex(set2,0),.001); }

    @Test
    public void testGetHighestInColumn() { assertEquals(11,TwoDimRaggedArrayUtility.getHighestInColumn(set1,0),.001); }

    @Test
    public void testGetHighestInColumnIndex() { assertEquals(2,TwoDimRaggedArrayUtility.getHighestInColumnIndex(set2,1),.001); }

    @Test
    public void testGetLowestInColumn() { assertEquals(25,TwoDimRaggedArrayUtility.getLowestInColumn(set2,2),.001); }

    @Test
    public void testGetLowestInColumnIndex() { assertEquals(0,TwoDimRaggedArrayUtility.getLowestInColumnIndex(set1,2),.001); }

    @Test
    public void testGetHighestInArray() { assertEquals(50,TwoDimRaggedArrayUtility.getHighestInArray(set2),.001); }

    @Test
    public void testGetLowestInArray() { assertEquals(4,TwoDimRaggedArrayUtility.getLowestInArray(set1),.001); }

}
