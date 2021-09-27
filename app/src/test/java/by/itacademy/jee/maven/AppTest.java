package by.itacademy.jee.maven;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */

    @Test
    public void sum() {
        //given
        int a = 5;
        int b = 10;
        int expectedSum = 15;
        //when
        int actualSum = App.sum(a, b);
        //then
        assertEquals(expectedSum, actualSum);

    }
}
