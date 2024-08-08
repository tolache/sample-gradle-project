package com.example.helloworld;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void add_TwoPlusTwo_ReturnsFour() throws Exception {
        //Arrange
        Calculator calc = new Calculator();

        //Act
        int actual = calc.add(2,2);

        //Assert
        assertEquals(4, actual);
    }
}
