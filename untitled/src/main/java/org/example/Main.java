package org.example;

public class Main {
    public static void processBuilderMethod() {
        // Creamos el proceso. Ejecutamos el programa que le indiquemos por parámetros.
        ProcessBuilder processBuilder = new ProcessBuilder("cat", "text.txt");

        try {
            processBuilder.redirectOutput(ProcessBuilder.Redirect.INHERIT);
            Process process = processBuilder.start();
            process.waitFor();
        }catch (Exception ex) {
            System.out.println("Error al lanzar el proceso");
            ex.printStackTrace();
        }

    }

    public static void main(String[] args) {
        processBuilderMethod();
    }
}