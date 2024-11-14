package de.oose.craft.mathematical;

import de.oose.craft.simplified.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

        @Test
        public void test() {
            var rectangle = new Rectangle(5, 7);

            var width = rectangle.getWidth();

            assertEquals(5, width);
        }
}
