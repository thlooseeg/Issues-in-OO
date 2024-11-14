package de.oose.craft.simplified;

import org.junit.jupiter.api.Test;
import org.w3c.dom.css.Rect;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

        @Test
        public void test() {
            var rectangle = new Rectangle(5, 7);

            var width = rectangle.getWidth();

            assertEquals(5, width);
        }
}
