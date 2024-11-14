package de.oose.craft.mathematical;

import de.oose.craft.simplified.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    @Test
    public void test() {
        var square = new Square(5);

        var width = square.getWidth();

        assertEquals(5, width);
    }

}