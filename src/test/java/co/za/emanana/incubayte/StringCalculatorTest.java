package co.za.emanana.incubayte;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {
    StringCalculator stringCalculator;

    @BeforeEach
    void init(){
        stringCalculator = new StringCalculator();
    }

    @Nested
    @DisplayName("Testing stringCalculator")
    class returnSum{
        @Test
        @DisplayName("Testing 0 to 3 numbers")
        void sumToThree(){
                assertAll(  () -> assertEquals(0, stringCalculator.Add(""), "should return a 0"),
                            () -> assertEquals(1, stringCalculator.Add("1"), "should return a 1"),
                            () -> assertEquals(3, stringCalculator.Add("1,3"), "should return a 3"));

        }

        @Test
        @DisplayName("Testing new lines")
        void newLines(){
            assertEquals(6, stringCalculator.Add("1\n2,3"), "should return a 6");
        }

        @Test
        @DisplayName("Testing ; as delimeters")
        void delimitersTest(){
            assertEquals(3, stringCalculator.Add("//;\n1;2"), "should return a 3");
        }

        @Test
        @DisplayName("Testing negatives")
        void negativeNumbers(){
            assertThrows(RuntimeException.class, () ->stringCalculator.Add("//;\n1;-2"), "cannot process negative numbers");
        }
    }


}
