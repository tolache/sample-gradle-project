package com.example.helloworld;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void add_TwoPlusTwo_ReturnsFour() {
        //Arrange
        Calculator calc = new Calculator();

        //Act
        int actual = calc.add(2,2);

        //Assert
        assertEquals(4, actual);
    }

    @Test
    public void add_TwoByTwo_ReturnsFour() {
        //Arrange
        Calculator calc = new Calculator();

        //Act
        int actual = calc.multiply(2,2);

        //Assert
        assertEquals(4, actual);
    }
}
