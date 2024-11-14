package de.oose.craft.mathematical;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <h1>The mathematician</h1>
 * <p>
 *     A developer with a background in mathematics could say that a square is indeed a rectangle - which is true
 *     in mathematics.
 * </p>
 * <h2>Violation of the LSP</h2>
 * <p>
 *    In this design, the <strong>Liskov Substitution Principle</strong> is violated.
 *    A code that expects a rectangle and receives a square could lead to unexpected
 *    behaviour if the dimensions are modified.
 * </p>
 * <h2>CODE COMPLEXITY</h2>
 * <p>
 *    The complexity of the code is increased due to distribution of properties.
 *    There is no single source - a developer has to look at both classes.
 * </p>
 *
 */
public class IssuesTest {

    @Test
    public void behavior_of_a_rectangle() {
        var rectangle = new Rectangle();

        rectangle.setWidth(3);
        rectangle.setHeight(6);

        var width = rectangle.getWidth();
        var height = rectangle.getHeight();

        assertEquals(3, width);
        assertEquals(6, height);

        assertTrue(rectangle instanceof Square);
    }

    @Test
    public void behaviour_of_a_square() {
        var square = new Square();

        square.setWidth(3);
        square.setHeight(6);

        var width = square.getWidth();
        var height = square.getHeight();

        assertEquals(3, width);
        assertEquals(6, height);
    }

    @Test
    public void behaviour_of_a_() {
        var rectangle = createRectangle();

        rectangle.setWidth(3);
        rectangle.setHeight(6);

        var width = rectangle.getWidth();
        var height = rectangle.getHeight();

        assertEquals(3, width);
        assertEquals(6, height);
    }

    private Rectangle createRectangle() {
        return new Square();
    }

}
