package com.dev.oop.lesson7;

public class Computer {

    private Ram ram;
    private Ssd ssd;
    /** Модификатора static - с англ. "статичный", "постоянный"
     *  - делает переменную или метод "независимыми" от объекта. */
    private static int counter = 0;


    public Computer(Ram ram, Ssd ssd) {
        this.ram = ram;
        this.ssd = ssd;
        /** this.counter - мы не можем использовать. */
        /** static - относется не к объектам, а к классам. */
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public void printState() {
        System.out.println("Computer: ram " + ram.getValue() + ", ssd " + ssd.getValue());
    }
}
