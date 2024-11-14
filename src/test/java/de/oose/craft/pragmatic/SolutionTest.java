package de.oose.craft.pragmatic;

import de.oose.craft.mathematical.Rectangle;
import de.oose.craft.mathematical.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * <h1>The software developer</h1>
 * <p>
 *     Software development is not about tricky reuse of code. It is also related, but independent from
 *     mathematics. In software development, it is common to work with abstraction.
 *     The abstraction <em>Shape</em> to represent a geometrical form provides the best solution.
 * </p>
 * <h2>Adherence to the LSP</h2>
 * <p>
 *    Using the abstraction <em>Shape</em> it is possible to use Rectangle and Square
 *    interchangeably where needed without violation the LSP.
 * </p>
 * <h2>Clear and flexible design</h2>
 * <p>
 *    The abstraction documents the relationship between two different geometric forms, the rectangle and the
 *    square. The individual classes for Rectangle and Square provide the flexibility to enhance each shape
 *    without negative effects on the other shape.
 * </p>
 *
 */
public class SolutionTest {

    @Test
    public void behavior_of_a_rectangle() {
        var rectangle = new de.oose.craft.mathematical.Rectangle();

        rectangle.setWidth(3);
        rectangle.setHeight(6);

        var width = rectangle.getWidth();
        var height = rectangle.getHeight();

        assertEquals(3, width);
        assertEquals(6, height);

        assertTrue(rectangle instanceof de.oose.craft.mathematical.Square);
    }

    @Test
    public void behaviour_of_a_square() {
        var square = new de.oose.craft.mathematical.Square();

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
