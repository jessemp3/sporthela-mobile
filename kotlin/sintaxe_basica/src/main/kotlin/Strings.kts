fun Strings () {
    val s = "Hello, Kotlin!"

    println(s.length) // Tamanho da string
    println(s[0]) // Primeiro caractere
    println(s.substring(0, 5)) // Substring do índice 0 ao


    //concatenação

    val name = "Kotlin"
    val greeting = "Hello $name!" // Interpolação de string

    println(greeting) // Saída: Hello Kotlin!
    println("A string original é: $s")

    //formatação

    val age:String = "jurandir"

    println(age.capitalize())
    println(age.lowercase())
    println(age.uppercase())

    //espacos brancos

    val textWithSpaces = "   Hello, Kotlin!   "
    println(textWithSpaces.trim()) // Remove espaços em branco no início e no final
    println(textWithSpaces.trimStart()) // Remove espaços em branco no início
    println(textWithSpaces.trimEnd()) // Remove espaços em branco no final

    //replace

    val replacedText = s.replace("Kotlin", "Java")
    println(replacedText) // Substitui "Kotlin" por "Java"

    //formatação avançada
    val number = 42
    val formattedString = "The answer is %d".format(number) // Formatação com especificador de formato
    println(formattedString)


    //empty e blank
    // se o tamanho da string for 0 esta empty e black
    // se o tamano da strinf for maior que 0 e tiver apenas espaços em branco, esta blank apenas

}

private fun getFullName(firstName: String, lastName: String) = "$firstName $lastName"

// funçoes de ordem superior

//recebem outra função ou lambda por parametro
//bastante uteis para a generalização de funções e tratamento de erros

//val x = calculate(5, 10::sum)
//val y = calculate(12,4){a, b -> a * b} // lambda
