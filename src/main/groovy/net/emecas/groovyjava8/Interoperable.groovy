package net.emecas.groovyjava8;

import groovy.transform.Canonical

/**
 * Created by emecas on 10/26/17.
 */



@Canonical
class Interoperable {
    String string
    Integer integer
    Character character

    String toString() {
        "Interoperable [string:$string, integer:$integer, character:$character]"
    }
}
