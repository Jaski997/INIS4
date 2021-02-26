package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int x = 0;
        Animal dog = new Animal();
        dog.Species = "dog";
        dog.name = "haiku";
        dog.Weight = 8.0;
        dog.feed();

        Phone iPhone = new Phone();
         iPhone.screenSize = 4.5;
        iPhone.producer = "apple";
        iPhone.model = "6s";
        iPhone.operationSystem = "ios";
    }
}
