package com.dev.oop.task;

public class TimeInterval {

    /** prsf + tab - создание private static final. */
    /** По код-конвеншину все статические константы должны именоваться в снейк кейсе. */
    private static final int SECONDS_IN_MINUTE = 60;
    private static final int MINUTE_IN_HOUR = 60;

    private int seconds;
    private int minutes;
    private int hours;

    public TimeInterval(int totalSeconds) {
        // 3750
        // 150
        this.hours = totalSeconds / 3600;
        this.minutes = totalSeconds % 3600 / 60;
        this.seconds = totalSeconds % 3600 % 60;
    }

    public TimeInterval(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public int totalSeconds() {
        return seconds + minutes * SECONDS_IN_MINUTE + hours * SECONDS_IN_MINUTE * MINUTE_IN_HOUR;
    }

    public TimeInterval sum(TimeInterval second) {
        return new TimeInterval(totalSeconds() + second.totalSeconds());
    }

    public void print() {
        System.out.println("h " + hours + ", m " + minutes + ", s " + seconds);
    }
}
