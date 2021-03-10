import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.w3c.dom.css.Rect;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    private Rectangle rectangle;
    private Rectangle square;

    @BeforeEach
    void setUp() {
        rectangle = new Rectangle(20,30);
        square = new Rectangle(20,20);
    }

    @Test
    void getPerimeterSquare()
    {
        //length = 20, width = 20.  Perimeter = 2*20+2*20=80
        double expResult = 80;
        assertEquals(expResult, square.getPerimeter());
    }

    @Test
    void getPerimeter()
    {
        //length = 20, width = 30.  Perimeter = 2*20+2*30=100
        double expResult = 100;
        assertEquals(expResult, rectangle.getPerimeter());
    }

    @Test
    void getArea()
    {
        //length = 20, width = 30.  Area = 20*30=600
        double expResult = 20*30;
        assertEquals(expResult, rectangle.getArea());
    }

    @Test
    void setLength() {
        rectangle.setLength(75);
        assertEquals(75, rectangle.getLength());
    }

    @Test
    void setLengthInvalidLow() {
        try{
            rectangle.setLength(0);
            fail("length of 0 should throw an Exception");
        }
        catch (IllegalArgumentException exception)
        {
            System.out.println(exception.getMessage());
        }
    }

    @Test
    void setLengthInvalidHigh() {
        try{
            rectangle.setLength(100);
            fail("length of 100 should throw an Exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void setWidth() {
        rectangle.setWidth(40);
        assertEquals(40, rectangle.getWidth());
    }

    @Test
    void setWidthInvalidLow()
    {
        assertThrows(IllegalArgumentException.class, ()->
                rectangle.setWidth(0));
    }

    @Test
    void isSquareTrue()
    {
        assertTrue(square.isSquare());
    }

    @Test
    void isSquareFalse()
    {
        assertFalse(rectangle.isSquare());
    }
}