import static org.junit.jupiter.api.Assertions.*;

import org.example.Triangle;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    void testEquilateral() {
        assertEquals("Equilateral", Triangle.classify(10, 10, 10));
    }

    @Test
    void testIsosceles() {
        assertEquals("Isosceles", Triangle.classify(10, 10, 5));
    }

    @Test
    void testIsoscelesDifferentPair() {
        assertEquals("Isosceles", Triangle.classify(5, 3, 5));
    }

    @Test
    void testScalene() {
        assertEquals("Scalene", Triangle.classify(4, 5, 6));
    }

    @Test
    void testAnotherScalene() {
        assertEquals("Scalene", Triangle.classify(7, 8, 9));
    }

    @Test
    void testNotATriangle() {
        assertEquals("NotATriangle", Triangle.classify(1, 2, 3));
    }

    @Test
    void testEdgeNotTriangleEquality() {
        assertEquals("NotATriangle", Triangle.classify(5, 5, 10));
    }

    @Test
    void testInvalidA() {
        assertEquals("Value of a is not in range", Triangle.classify(0, 5, 5));
    }

    @Test
    void testInvalidB() {
        assertEquals("Value of b is not in range", Triangle.classify(5, 0, 5));
    }

    @Test
    void testInvalidC() {
        assertEquals("Value of c is not in range", Triangle.classify(5, 5, 0));
    }

    @Test
    void testBoundaryMin() {
        assertEquals("Isosceles", Triangle.classify(1, 100, 100));
    }

    @Test
    void testBoundaryMax() {
        assertEquals("NotATriangle", Triangle.classify(200, 100, 100));
    }
    @Test
    void testIsoscelesThirdCase() {
        assertEquals("Isosceles", Triangle.classify(3, 5, 5));
    }
}