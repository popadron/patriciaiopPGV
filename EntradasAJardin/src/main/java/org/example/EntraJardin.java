package org.example;

public class EntraJardin extends Thread {
    private RecursoJardin recurso;

    public EntraJardin(String nombre, RecursoJardin recurso) {
        this.setName(nombre);
        this.recurso = recurso;
    }

    @Override
    public void run() { // Le indicamos al hilo lo que debe de hacer durante su ejecución
        recurso.incrementarCuenta();
    }
}
