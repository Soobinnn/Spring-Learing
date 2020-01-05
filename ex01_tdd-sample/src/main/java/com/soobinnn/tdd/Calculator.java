package com.soobinnn.tdd;

import java.util.stream.IntStream;

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
        //        int result = 0;
        //        for (int i = 0; i < y; i++){
        //            result += x;
        //        }
        //
        //        return result;
        //return IntStream.range(0, y).reduce(0,(a, e) -> a + x);

        //return IntStream.iterate(0, i -> i+1).limit(y).reduce(0,(a, e) -> a + x);

         return IntStream.generate(() -> 0).limit(y)
                 .reduce(0,(a, e) -> plus(a, x));

    }

    public int fib(int x) {
        if(x <= 0) {
            return 0;
        }

        if(x == 1 || x == 2) {
            return 1;
        }

        return fib(x - 2) + fib(x - 1);
    }
}
