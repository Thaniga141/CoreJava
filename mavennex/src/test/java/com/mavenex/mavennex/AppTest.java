package com.mavenex.mavennex;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


//public class AppTest {
//    @Test
//    void testAddition() {
//        int result = 2 + 3;
//        assertEquals(5, result);
//    }
//}


//public class AppTest {
//    @Test
//    void testAssertions() {
//        String str = "JUnit";
//        assertNotNull(str);
//        assertEquals("JUnit", str);
//        assertTrue(5 > 2);
//    }
//}



//public class AppTest {
//    @BeforeEach
//    void setup() {
//        System.out.println("Setup before test");
//    }
//
//    @Test
//    void test1() {
//        System.out.println("Executing Test 1");
//    }
//
//    @AfterEach
//    void tearDown() {
//        System.out.println("Cleanup after test");
//    }
//}


//public class AppTest{
//	 @ParameterizedTest
//	    @ValueSource(ints = {2, 4, 6, 8,})
//	    void testEvenNumbers(int number) {
//	        assertTrue(number % 2 == 0);
//	    }
//}


public class AppTest {
    @Test
    void testAssertions() {
        String str = "JUnit";
        assertNotNull(str);
        assertEquals("JUnit", str);
        assertTrue(5 > 2);
    }
}