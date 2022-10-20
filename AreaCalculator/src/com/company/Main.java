package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println(area(6));
        System.out.println(area(5,6));
    }

    private static double area(double radius) {
            if (radius < 0) {
                return -1.0;
            } else {
                return radius * radius * Math.PI;
            }
        }

        private static double area(double x, double y) {
            if (x < 0 || y < 0) {
                return -1.0;
            } else {
                return 0.5 * x * y;
            }
        }
}
