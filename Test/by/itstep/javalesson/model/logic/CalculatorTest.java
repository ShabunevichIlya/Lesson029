package by.itstep.javalesson.model.logic;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    // AAA
    // Arrange  (60%)
    // Act      (10%)
    // Assert   (30%)

    @Test
    public void testSum() {
        //arrange
        int a = 10;
        int b = 20;
        int expected = 30;

        // act
        int actual = Calculator.sum(a, b);

        // assert
        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testSub() {
        //arrange
        int a = 30;
        int b = 20;
        int expected = 10;

        // act
        int actual = Calculator.sub(a, b);

        // assert
        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testMul() {
        //arrange
        int a = 2;
        int b = 5;
        int expected = 10;

        // act
        int actual = Calculator.mul(a, b);

        // assert
        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testDiv() {
        //arrange
        int a = 10;
        int b = 2;
        int expected = 5;

        // act
        int actual = Calculator.div(a, b);

        // assert
        if (expected != actual) {
            Assert.fail();
        }
    }

    @Test
    public void testDivByZero() {
        //arrange
        int a = 10;
        int b = 0;

        // act
        try {
            Calculator.div(a, b);
            Assert.fail();
        } catch (ArithmeticException exception) {

        }

        // assert
    }
}
