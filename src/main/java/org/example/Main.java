package org.example;

import org.example.entities.Athlete;

public class Main {
    public static void main(String[] args) {
        Athlete a1 = new Athlete(1L, "Giannis", "Chloptsios", "AEL FC", 22, 1);
        System.out.println(a1);
    }
}