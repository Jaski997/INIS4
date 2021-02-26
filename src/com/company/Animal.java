package com.company;

import java.io.File;

public class Animal {
    String Species;
    Double Weight;
    String name;
    File pic;

    void feed() {
        Weight += 1;
        System.out.println("thx");
    }
}