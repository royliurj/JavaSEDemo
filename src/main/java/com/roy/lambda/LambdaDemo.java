package com.roy.lambda;

import java.util.function.Consumer;

public class LambdaDemo {

    public static void main(String[] args) {
        Runnable r = () -> System.out.println("123");
        r.run();

        Consumer<String> c = c1 -> System.out.println(c1);
        c.accept("asdf");
    }
}
