package com.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestLion {
    @Test
    public void getKittensTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самец", feline);
        int actual = lion.getKittens();
        int expected = 1;
        assertEquals(expected, actual);
    }
}
