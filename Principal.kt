fun main(args: Array<String>) {
    println("::::Sistema::::")
    showMenu()
}

fun showMenu() {
    val rawString: String = """
        :: Bienvenido a Recipe Maker ::
        Selecciona la opción deseada
        1. Hacer una receta
        2. Ver mis recetas
        3. Salir
    """.trimIndent()
    println(rawString)
    do {

        val response: Int = Integer.valueOf(readLine())
        when (response) {
            1 -> makeRecipe()
            2 -> viewRecipe()
            3 -> println("Salida...")
        }

    } while (response != 3)

}


fun makeRecipe() {
    println(" Seleccione Categoria: ")
    val categorias = listOf<String>("Agua", "Leche", "Carne", "Verduras", "Frutas", "Cereal", "Huevos", "Aceites")
    for ((i, cat) in categorias.withIndex()) {
        println("${i + 1} $cat")
    }

    println("0. Salir ")
    do {

        val response: Int = Integer.valueOf(readLine())
        when (response) {
            1 -> println("Opcion")
            2 -> println("Opcion")
            3 -> println("Opcion")
        }

    } while (response != 0)
    showMenu()
}

fun viewRecipe() {
    println("Ver mis recetas")
}
