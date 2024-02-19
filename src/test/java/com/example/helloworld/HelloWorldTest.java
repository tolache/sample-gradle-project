package com.example.helloworld;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {
    @Test
    public void printShouldSuccess() throws Exception {
        //Arrange
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        //Act
        HelloWorld.print(new PrintStream(out));
        String str = out.toString();

        //Assert
        Assert.assertEquals("Hello, World!\r\n", str);
    }
}
