/*
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
*/

fun main() {

    for (i in 0..100){
        if (i % 3 == 0){
            println("fizz 3")
        }
        if (i % 5 == 0){
            println("buzz 5")
        }
        if (i % 3 == 0 && i % 5 == 0){
            println("fizzbuzz 3-5")
        }
    }
}