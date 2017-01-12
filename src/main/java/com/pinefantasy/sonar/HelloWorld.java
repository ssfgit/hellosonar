package com.pinefantasy.sonar;

// The Sonar Demo Example
public class HelloWorld {

    // sayHelloWorld
    public void sayHelloWorld() {
        String str = "hello";
        // if 1==1 printHelloWorld
        if (1 == 1) {
            printHelloWorld(str);
        } else {
            System.out.println("test");
        }
		// the end of method
		// Comments this
    }

    // printHelloWorld
    public void printHelloWorld(String str) {
        String rs = "sonar-";
        for (int i = 1; i <= 100; i++) {
            rs += str + i;
        }
        System.out.println(rs);
    }
}
