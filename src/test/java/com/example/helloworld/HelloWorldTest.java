package com.example.helloworld;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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
