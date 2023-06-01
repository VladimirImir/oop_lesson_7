package com.dev.oop.lesson7;

public class CompositionRunner {

    /** 8.1 Stack and Heap. Теория */

    public static void main(String[] args) {
        Ram ram = new Ram(1024);
        Ssd ssd = new Ssd(512);
        Computer computer = new Computer(ram, ssd);
        computer.printState();

    }
}
