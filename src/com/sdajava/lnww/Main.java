package com.sdajava.lnww;

public class Main {

    public int NWW (int a, int b) {
        int c = a;
        int d = b;
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return c / a * d;
    }
    public static void main(String[] args) {
        Main obiekt = new Main();
        System.out.println("Najmniejsza wspólna wielokrotność = "+ obiekt.NWW(10,15));
    }
}
