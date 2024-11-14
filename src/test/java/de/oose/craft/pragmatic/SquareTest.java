package de.oose.craft.pragmatic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    @Test
    public void defaultSquareWithZeroSideLength() {
        Square square = new Square();

        var width = square.getWidth();
        var height = square.getHeight();

        assertEquals( 0, width );
        assertEquals( 0, height );
    }

    @Test
    public void defaultSquareWhenModified() {
        Square square = new Square();

        square.setWidth(3);
        square.setHeight(7);

        var width = square.getWidth();
        var height = square.getHeight();

        assertEquals( 7, width );
        assertEquals( 7, height );
    }


    @Test
    public void test() {
        var square = new Square(5);

        var width = square.getWidth();

        assertEquals(5, width);
    }

}
