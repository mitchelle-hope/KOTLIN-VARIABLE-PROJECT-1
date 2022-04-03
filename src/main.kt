import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot

fun main(){
    sum()
    add()
    square(4)
    square(7)


}
//1: Write a function that Adds Two Numbers
//2:Write a function that finds the square of a number
//3:Write a function that displays names

fun sum(){
    var a= 456
    var b= 700
    var x=a+b
    println(x)
}
fun add(){
    var anitaB= 700
    var lovelace =900
    var z=anitaB+lovelace
    println(z)
}
fun square(square:Int){
    var squ= square*square
    println(squ)

}
fun squareRoot(squareRoot:Int){
    var roo= squareRoot*squareRoot
    println(roo)

}



