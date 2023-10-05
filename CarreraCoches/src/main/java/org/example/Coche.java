package org.example;

import static java.lang.Thread.sleep;

public class Coche extends Thread {
    private int avance = 0;


    public Coche () {}

    @Override
    public void run() { // -> indicar a nuestro hilo que es lo que queremos que haga
        while (true) {
            if (avance >= 50) {
                try {
                    Thread.interrupt();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            } else {
                avance += (int) (Math.random() * 10);
                System.out.println(avance);
                try {
                    Thread.sleep((long) (Math.random() * 10));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
