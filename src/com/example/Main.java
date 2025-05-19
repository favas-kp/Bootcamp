package com.example;

import com.example.models.Demo;

public class Main {
    public static void main(String[] args) {
        Demo demo = new Demo();
        String message = demo.identity("hello");
        System.out.println(message);
    }
}
