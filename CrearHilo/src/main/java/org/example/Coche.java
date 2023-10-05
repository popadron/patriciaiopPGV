package org.example;

// (extends) thread:
// -> run() (este espera a que termine un hilo para empezar otro)
// -> start() (esta es la que siempre se usa porque funciona concurrente)

public class Coche implements Runnable { // si implements de Runnable sólo tiene el método run()
                                         // -> sólo usado para hilos
    private String symbol;

    public Coche (String symbol) {
        this.symbol = symbol;
    }

    @Override
    public void run() { // -> indicar a nuestro hilo que es lo que queremos que haga
        while (true) {
            System.out.println(symbol);
        }
    }
}
