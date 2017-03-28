package com.company;

public class Main {

    public static void main(String[] args) {
        Automat aut = new Automat();

        System.out.println(aut.delta(Automat.Zustand.z1, Automat.Buchstabe.a1));
    }
}
