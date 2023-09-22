package org.JavaTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest
{

    @BeforeEach
    void setUp()
    {
    }
    @Test
    public void AddTwoNumber()
    {
        SimpleCalculator AddObj = new SimpleCalculator();
        assertEquals(4,AddObj.add(2,2));
    }
    @Test
    public void SubTwoNumber()
    {
        SimpleCalculator SubObj = new SimpleCalculator();
        assertEquals(2,SubObj.sub(4,2));
        assertNotEquals(0,SubObj.sub(4,2));

    }
    @Test
    public void CheckNumber()
    {
        SimpleCalculator Check = new SimpleCalculator();
        assertEquals(5,Check.contain(5));
    }
    @Test
    public  void StringChecker()
    {
        SimpleCalculator StringCheck = new SimpleCalculator();
        assertEquals("Hello",StringCheck.getStringValue());
    }
    @Test
    public void Price()
    {
        SimpleCalculator PriceChecker = new SimpleCalculator();
        assertEquals(10,PriceChecker.Price(2,5));
    }
}