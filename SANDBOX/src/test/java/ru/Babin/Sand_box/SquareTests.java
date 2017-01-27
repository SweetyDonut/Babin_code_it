package ru.Babin.Sand_box;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.Babin.Sand_Box.Square;

/**
 * Created by user on 24.01.2017.
 */
public class SquareTests {
    @Test
    public void testArea() {
        Square s = new Square(5);

        Assert.assertEquals(s.area(), 25.0);
    }
}
