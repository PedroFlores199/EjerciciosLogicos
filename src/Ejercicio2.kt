import java.util.*

/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */

fun main (){

    val sc = Scanner(System.`in`)

    print("Dame la primera palabra: ")
    val palabraUno = sc.nextLine()
    print("Dame la segunda palabra")
    val palabraDos = sc.nextLine()

    val palabraTroceadaUno = palabraUno.toCharArray().sortedArray()
    val palabraToceadaDos = palabraDos.toCharArray().sortedArray()

    if (palabraTroceadaUno.contentEquals(palabraToceadaDos)){
        println("Son anagramas")
    } else {
        println("No son anagramas")
    }

}