package com.soobinnn.tdd;

// 1 + 2 = 3
// Calculator
// - plus(x, y)
// - minus(x, y)
// - multiply(x, y)
// - divide(x, y)
// lhs, rhs
// lhs operator rhs
// lhs = rhs
// fibonacchi => 1 1 2 3 5 8 13 21 34

// TDD
// 1. Red
// 2. Green
// 3. Refactoring -> 1 + 2 -> x + y => Clean Code, 제약조건에 따라
import org.junit.Before;
import org.junit.Test;


import java.util.stream.IntStream;

import static org.hamcrest.CoreMatchers.is;
//import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertThat;

public class CaculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void plus() {
        assertThat(calculator.plus(2, 3), is(5));
        assertThat(calculator.plus(2, -3), is(-1));
    }

    @Test
    public void minus() {
        assertThat(calculator.minus(5, 3), is(2));
        assertThat(calculator.minus(5, -3), is(8));
    }

    @Test
    public void multiply() {
        assertThat(calculator.multiply(2,3), is(6));
    }

    @Test
    public void fibonacciNormal() {
        int[] numbers = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55};

        IntStream.range(0, numbers.length).forEach(i -> {
            assertThat(calculator.fib(i), is(numbers[i]));
        });
//        for(int i =0; i < numbers.length; i++) {
//            assertThat(calculator.fib(i), is(numbers[i]));
//        }
    }

    @Test
    public void fibonacciError() {
        assertThat(calculator.fib(-1), is( 0));
        assertThat(calculator.fib(-100), is( 0));
    }

}
