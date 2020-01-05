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

// TDD
// 1. Red
// 2. Green
// 3. Refactoring -> 1 + 2 -> x + y => Clean Code, 제약조건에 따라
import org.junit.Test;


import static org.hamcrest.CoreMatchers.is;
//import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertThat;

public class CaculatorTest {
    @Test
    public void plus() {
        Calculator calculator = new Calculator();
        assertThat(calculator.plus(2, 3), is(5));
    }

    @Test
    public void minus() {
        Calculator calculator = new Calculator();
        assertThat(calculator.minus(5, 3), is(2));
    }
}
