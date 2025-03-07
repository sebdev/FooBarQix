package com.sebdev.math.divisiblecriteria;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DivisibleCriteriaFiveTest {

    private static DivisbleCriteriaFive criteria;
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        criteria = new DivisbleCriteriaFive();
    }

    @Test
    public void testIsDivisibleTrueforNumberEndedByZero() {
        assertTrue("Number ended by 0 is divisible by 5", criteria.isDivisible("1000000000000000"));
    }
    
    @Test
    public void testIsDivisibleTrueforNumberEndedByFive() {
        assertTrue("Number ended by 5 is divisible by 5", criteria.isDivisible("1000000000000005"));
    }
        
    @Test
    public void testIsDivisibleFalse() {
        assertFalse("Number ended by 2 is not divisible by 5", criteria.isDivisible("1000000000000002"));
    }
}
