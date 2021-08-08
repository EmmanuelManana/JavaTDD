package co.za.emanana.incubayte;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {
    StringCalculator stringCalculator;

//    @BeforeAll
//    static void init(){
//        System.out.println("Nothing here");
//    }

    @BeforeEach
    void init(){
        stringCalculator = new StringCalculator();
    }

    @Nested
    @DisplayName("Testing stringCalculator")
    class returnSum{
        @Test
        @DisplayName("Testing 0 to 3 numbers")
        void testSumToThree(){
                assertAll(  () -> assertEquals(0, stringCalculator.Add(""), "should return a 0"),
                            () -> assertEquals(1, stringCalculator.Add("1"), "should return a 1"),
                            () -> assertEquals(3, stringCalculator.Add("1,3"), "should return a 3"),
                            () -> assertEquals(6, stringCalculator.Add("1\n2,3"), "should return a 6"));

        }
    }


}
