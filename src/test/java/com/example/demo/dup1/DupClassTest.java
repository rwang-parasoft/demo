package com.example.demo.dup1;


import org.junit.Test;


/**
 * Parasoft Jtest UTA: 测试类为 DupClass
 *
 * @author Mrwan
 * @see DupClass
 */
public class DupClassTest {
    /**
     * Parasoft Jtest UTA: 测试为 method()
     *
     * @author Mrwan
     * @see DupClass#method()
     */
    @Test
    public void testMethod() throws Throwable {
        // Given
        DupClass underTest = new DupClass();

        // When
        underTest.method();

    }
}