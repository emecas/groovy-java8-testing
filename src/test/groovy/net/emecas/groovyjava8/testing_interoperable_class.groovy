package net.emecas.groovyjava8

/**
 * Created by emecas on 10/26/17.
 */

Interoperable interoperable = new Interoperable(string: 'This is a string',integer:0,character:'c')
println interoperable
assert interoperable.getCharacter()=='c'
assert interoperable.getString()=='This is a string'
assert interoperable.getInteger()==0
println interoperable.getString()[-1..0]
println interoperable.getString().split()
interoperable.getString().split().each {println it}

Interoperable interoperable2 = new Interoperable(integer:0,character:'c')
def val = interoperable2.getString()
assert val==null
def elvis=val?.charAt(1)=='S'//?: "a"
assert elvis==false

elvis=val?.charAt(1)==null//?: "a"
assert elvis==true
