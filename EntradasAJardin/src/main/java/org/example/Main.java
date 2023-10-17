package org.example;

public class Main {
    public static void main(String[] args) {
        RecursoJardin jardin = new RecursoJardin();
        for (int i = 0; i < 10; i++) {
            (new EntraJardin("Entra el hilo" + i, jardin)).start();
        }
        for (int i = 0; i < 15; i++) {
            (new EntraJardin("Sale el hilo" + i, jardin)).start();
        }
    }
}