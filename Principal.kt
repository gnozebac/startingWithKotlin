fun main(args : Array<String>) {
    val rawString : String = """
        :: Bienvenido a Recipe Maker ::

        Selecciona la opción deseada
        1. Hacer una receta
        2. Ver mis recetas
        3. Salir
        
    """.trimIndent()


    do{
        println(rawString)
        print("ingrese un valor")
        val response : Int = Integer.valueOf(readLine())

        when(response){
            1 -> println ("ingresa tu receta")
            2 -> println ("Tus recetas son: ")
            3 -> println ("Salida...")


            }
    }while (response != 3)
}
