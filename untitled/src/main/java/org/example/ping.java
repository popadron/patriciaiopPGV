package org.example;

public class ping {
    public static void processBuilderMethod() {
        ProcessBuilder processBuilder = new ProcessBuilder("ping");
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
