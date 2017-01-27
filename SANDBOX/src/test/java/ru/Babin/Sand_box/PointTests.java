package ru.Babin.Sand_box;
import org.testng.annotations.Test;
import org.testng.Assert;
import ru.Babin.Sand_Box.Point;

/**
 * Created by user on 27.01.2017.
 */
public class PointTests {

    @Test
    public void testArea() {
        Point p1 = new Point(0.0, 1.0);
        Point p2 = new Point(0.0, 0.0);
        Assert.assertEquals(p1.mDistance(p2),1.0);
    }
    @Test
    public void testArea2(){
        Point p1 = new Point(1.0, 1.0);
        Point p2 = new Point(0.0, -1.0);

        Assert.assertEquals(p1.mDistance(p2),2.23606797749979);
    }



}
