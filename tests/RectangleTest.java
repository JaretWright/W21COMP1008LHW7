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
    void setLength() {
    }

    @Test
    void setWidth() {
    }
}