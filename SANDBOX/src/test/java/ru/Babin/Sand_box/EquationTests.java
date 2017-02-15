package ru.Babin.Sand_box;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.Babin.Sand_Box.Equation;

/**
 * Created by user on 15.02.2017.
 */
public class EquationTests {
    @Test
    public void test0(){
        Equation eq1= new Equation(1,3,-4);
        Assert.assertEquals(eq1.getn(),2);
    }
}
