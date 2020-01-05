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
    }

    @Test
    public void minus() {
        assertThat(calculator.minus(5, 3), is(2));
    }

    @Test
    public void multiply() {
        assertThat(calculator.multiply(2,3), is(6));
    }

    @Test
    public void fibonacciNormal() {
        assertThat(calculator.fib(0), is( 0));
        assertThat(calculator.fib(1),is(1));
        assertThat(calculator.fib(1),is(1));
        assertThat(calculator.fib(3),is(2));
        assertThat(calculator.fib(4),is(3));
        assertThat(calculator.fib(5),is(5));
    }

    @Test
    public void fibonacciError() {
        assertThat(calculator.fib(-1), is( 0));
    }
}
