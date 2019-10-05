
import model.Categoria
import java.lang.NumberFormatException


fun main(args: Array<String>) {

        var listInsumos = "1. Agua\n2. Leche\n3. Carne\n4. Verduras\n5. Frutas\n6. Cereal\n7. Huevos\n8. Aceite\n"
        var ag:Int = 0
        var le:Int = 0
        var ca:Int = 0
        var ve:Int = 0
        var fr:Int = 0
        var ce:Int = 0
        var hu:Int = 0
        var ac:Int = 0
        println(":: Bienvenido a Recipes Maker ::\n")
        println("Selecciona la opcion deseada")
        println("1. Hacer una receta")
        println("2. Ver mis recetas")
        println("3. Salir")

         do {
            println("Escoge la opcion 1, 2 ó 3: ")
            val response: String? = readLine()
            try {
                    when(response?.toInt()) {
                        1 -> {
                                //Funcion
                                viewRecipe(1)
                                makeRecipe(listInsumos)

                                println("Para terminar oprime 0")
                                do {
                                        println("Escoge la opcion de ingrediente: ")
                                        val ingrediente: String? = readLine()
                                        try {
                                                when(ingrediente?.toInt()) {
                                                        1 -> {
                                                                println("Agua")
                                                                ag++
                                                                Categoria(1)

                                                        }
                                                        2 -> {
                                                                println("Leche")
                                                                le++
                                                                Categoria(2)
                                                        }
                                                        3 -> {
                                                                println("Carne")
                                                                ca++
                                                                Categoria(3)
                                                        }
                                                        4 -> {
                                                                println("Verduras")
                                                                ve++
                                                                Categoria(4)
                                                        }
                                                        5 -> {
                                                                println("Frutas")
                                                                fr++
                                                                Categoria(5)
                                                        }
                                                        6 -> {
                                                                println("Cereal")
                                                                ce++
                                                                Categoria(6)
                                                        }
                                                        7 -> {
                                                                println("Huevos")
                                                                hu++
                                                                Categoria(7)
                                                        }
                                                        8 -> {
                                                                println("Aceite")
                                                                ac++
                                                                Categoria(8)
                                                        }
                                                        0 -> println("Terminar")
                                                        else -> println("Esta no es una opcion valida")
                                                }
                                        } catch (e: NumberFormatException) {
                                                println("Poner solo numeros")
                                        }

                                } while (!ingrediente.equals("0"))
                                println(":: Fin del listado del usuario ::")
                        }
                        2 -> viewRecipe(2)
                        3 -> viewRecipe(3)
                        else -> println("No esta en alguno de los anteriores")
                    }
                } catch (e: NumberFormatException) {
                        println("Digitar solo numeros por favor")
                }
        } while (!response.equals("3"))


}

fun  makeRecipe(listInsumos: String): Unit {
        var listInsumos = "1. Agua\n2. Leche\n3. Carne\n4. Verduras\n5. Frutas\n6. Cereal\n7. Huevos\n8. Aceite\n"
        println("Escoge los ingredientes")
        println(listInsumos)
}

fun viewRecipe(category: Int): Unit {
        when(category) {
                1 -> println(":: Hacer una receta ::")
                2 -> println(":: Ver mis recetas ::")
                3 -> println(":: Salir ::")
        }
}