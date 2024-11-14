package de.oose.craft.simplified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <h1>The code saver</h1>
 * <p>
 *     While this solution - that tries to save some code - might look attractive due to the reuse of the square,
 *     there are some serious issues.
 * </p>
 * <h2>LOGICAL FALLACY</h2>
 * <p>
 *    A rectangle with a width of 5 and a height of 7 is not a square.
 * </p>
 * <p>
 *    The type square is the wrong type, but due to inheritance the instanceof operator says it is.
 *    That's just wrong and we should not allow something like that in our code.
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
    public void test() {
        var rectangle = new Rectangle(5, 7);

        var width = rectangle.getWidth();
        var height = rectangle.getHeight();

        assertEquals(5, width);
        assertEquals(7, height);

        assertTrue(rectangle instanceof Square);
    }
}
