package model

class Categoria(opcion: Int) {
    init {
        var agua = "1. Agua con gas\n2. Agua de coco\n3. Agua sin gas.\n0. Para terminar.\n"
        var leche = "1. Leche Entera\n2. Leche Deslactosada.\n"
        var carne = "1. Carne de cerdo\n2. Carne de pollo\n3. Carne de res\n4. Carne de bufalo\n5. Carne de conejo.\n0. Para terminar.\n"
        var verduras = "1. Coliflor\n2. Tomate\n3. Zanahoria\n4. Rabano\n5. Espinaca\n6. Pimenton.\n0. Para terminar.\n"
        var frutas = "1. Fresa\n2. Platano\n3. Uvas\n4. Manzana\n5. Naranja\n6. Pera\n7. Cereza.\n0. Para terminar.\n"
        var cereal = "1. Avena\n2. Trigo\n3. Arroz\n4. Maiz\n0. Para terminar.\n"
        var huevos = "1. Rojo\n2. Blanco\n0. Para terminar.\n"
        var aceite = "1. Aceite de oliva\n2. Aceite de soya\n3. Aceite de girasol\n0. Para terminar.\n"

        when(opcion){
            1 -> {
            println(agua)
            }
            2 -> {
                println(leche)
            }
            3 -> {
                println(carne)
            }
            4 -> {
                println(verduras)
            }
            5 -> {
                println(frutas)
            }
            6 -> {
                println(cereal)
            }
            7 -> {
                println(huevos)
            }
            8 -> {
                println(aceite)
            }
        }
    }
}