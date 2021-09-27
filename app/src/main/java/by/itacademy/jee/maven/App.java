package by.itacademy.jee.maven;

import by.itacademy.jee.maven.logic.Calculator;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println(Calculator.sum(List.of(1,2,3,4)));
    }

    public static int sum(int a, int b) {
        return a+b;
    }
}
