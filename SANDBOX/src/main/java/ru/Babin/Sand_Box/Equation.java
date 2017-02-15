package ru.Babin.Sand_Box;

/**
 * Created by user on 15.02.2017.
 */
public class Equation  {
    double a;
    double b;
    double c;

    public Equation(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
        double d = b*b - 4*a*c;
    }
}
