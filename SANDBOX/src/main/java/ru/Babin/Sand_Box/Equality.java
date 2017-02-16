package ru.Babin.Sand_Box;

import javax.jws.soap.SOAPBinding;

/**
 * Created by user on 16.02.2017.
 */
public class Equality {
    public static void main(String[] args) {
        String s1="Firefox";
        String s2=new String(s1);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

    }
}
