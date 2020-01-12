package com.sj4a.utils;

public class SjMath {
    static public long calcRandomTime() {
        double num = Math.random() * 1000;
        return Math.round(num);
    }
}
