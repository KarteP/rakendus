package com.homework;

public class Sum {

    int a;
    int b;
    int sum;

    public Sum(int a, int b) {
        if (a >= 0 & b >= 0 & a <= 100 & b <= 100) {
            this.a = a;
            this.b = b;
            this.sum = a + b;
            
            System.out.println("Sum: " + this.sum);
        } else {
            System.out.println("Integers have to be between 0 and 100 (included).");
        }
    }
}
