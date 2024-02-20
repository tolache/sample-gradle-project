package com.example.helloworld;

import java.io.PrintStream;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.*;

public class HelloWorld {

    public static void main(String[] args) {
        print(System.out);
        listJvmArgs();
    }

    void implicitCastToLong(int i) {
        long val = 65536 * i;
    }

    public static void print(PrintStream out) {
        out.println("Hello, World!");
    }

    public static void listJvmArgs() {
        RuntimeMXBean bean = ManagementFactory.getRuntimeMXBean();
        List<String> jvmArgs = bean.getInputArguments();

        System.out.println("JVM args count: " + jvmArgs.size());

        for (String jvmArg : jvmArgs) {
            System.out.println(jvmArg);
        }
    }
}
