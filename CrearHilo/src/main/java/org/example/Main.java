package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("+");
        Coche coche1 = new Coche("/");
        Coche coche2 = new Coche("-");

//        coche.start(); // startea hilo coche (start funciona concurrente, run no.)
//        coche1.start(); // startea hilo coche1
//        coche2.start(); // startea hilo coche2

        new Thread(coche).start();
        new Thread(coche1).start();
        new Thread(coche2).start();
    }
}