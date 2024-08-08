package com.example.helloworld;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {
    @Test
    public void printShouldSuccess() throws Exception {
        //Arrange
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        //Act
        HelloWorld.print(new PrintStream(out));
        String str = out.toString();

        //Assert
        assertEquals("Hello, World!" + System.lineSeparator(), str);
    }
}
