package org.example;

public class RecursoJardin {
    // Clase que simula la entrada y la salida de personas (hilos) de un jardin
    private int cuenta;

    public RecursoJardin() {
        this.cuenta = 100;
    }

    public void incrementarCuenta() { //  Método que incrementa en 1 la variable de cuenta
        System.out.println(Thread.currentThread().getName());
        // Mostramos el hilo que entra
        this.cuenta++;
        // Incrementar la variable
        System.out.println("Hay" + getCuenta() + "personas en el jardín");
        // Mostramos el número actual de personas en el jardín
    }

    public void decrementarCuenta() { //  Método que incrementa en 1 la variable de cuenta
        System.out.println(Thread.currentThread().getName());
        // Mostramos el hilo que entra
        this.cuenta++;
        // Incrementar la variable
        System.out.println("Hay" + getCuenta() + "personas en el jardín");
        // Mostramos el número actual de personas en el jardín
    }

    public int getCuenta() {
        return this.cuenta;
    }
}
