package com.soobinnn.tdd;

public class Calculator {
    public int plus(int x, int y) {
        if(y == 0) {
            return x;
        }

        return plus(x+1, y-1);
    }

    public int minus(int x, int y) {
        if(y == 0) {
            return x;
        }

        return minus(x - 1,y - 1);
    }

    public int multiply(int x, int y) {
        int result = 0;
        for (int i = 0; i < y; i++){
            result += x;
        }

        return result;
    }
}
