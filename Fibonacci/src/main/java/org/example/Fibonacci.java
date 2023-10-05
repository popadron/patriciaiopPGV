package org.example;
import java.util.ArrayList;

public class Fibonacci implements Runnable {
    private ArrayList<Integer> arrNums = new ArrayList<>();

    arrNums.add(1);
    arrNums.add(1);
    int num1, num2, num3;
    public Fibonacci () {
        num1 = (int) arrNums.get(arrNums.size()-1);
        num2 = (int) arrNums.get(arrNums.size());

        System.out.println(calcularNum3(num1, num2));
    }

    private int calcularNum3 (int num1, int num2) {
        num3 = num1 + num2;
        return num3;
    }
}
