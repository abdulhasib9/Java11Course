package com.java11.example;

import java.util.stream.IntStream;

public class IteratingArraysViaIntStream {
    static String [] animals ={"cat","dog","tiger"};

    public static void main(String[] args) {
        IntStream.range(0,animals.length).forEach(i->{
            System.out.printf("%d. %s\n",i,animals[i]);
        });
    }
}
