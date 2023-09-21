package org.example;

public class ifconfig {
    public static void processBuilderMethod() {
        ProcessBuilder processBuilder = new ProcessBuilder("ifconfig");
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
