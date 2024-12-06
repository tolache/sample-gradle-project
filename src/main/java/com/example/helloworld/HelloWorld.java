package com.example.helloworld;

import java.io.PrintStream;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        greet(System.out);
        listJvmArgs(System.out);
        printMaxHeapSize(System.out);
    }

    void implicitCastToLong(int i) {
        long val = 65536 * i; // trigger implicit cast inspection!
    }

    public static void greet(PrintStream out) {
        out.println("Hello, World!");
    }

    public static void listJvmArgs(PrintStream out) {
        RuntimeMXBean bean = ManagementFactory.getRuntimeMXBean();
        List<String> jvmArgs = bean.getInputArguments();

        out.println("JVM args count: " + jvmArgs.size());

        for (String jvmArg : jvmArgs) {
            out.println(jvmArg);
        }
    }

    public static void printMaxHeapSize(PrintStream out) {
        long maxHeapSize = Runtime.getRuntime().maxMemory();
        out.println("Maximum Heap Size: " + (maxHeapSize / (1024 * 1024)) + " MB");
    }
}
