package net.emecas.groovyjava8.main;

import net.emecas.groovyjava8.Interoperable;

/**
 * Created by emecas on 10/26/17.
 */
public class Main {

    public static void main(String[] args) {
        Interoperable interoperable = new Interoperable();//"STRING", 10, 'c');
        interoperable.setInteger(100);
        interoperable.setCharacter('X');
        interoperable.setString("STRING");
        System.out.println(interoperable);
    }

}
