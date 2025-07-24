fun main() {
    // String? = isso significa que a variavel pode ser uma String ou null
    // uma variavel não pode ser declarada sem tipo ou sem inicialização(valor)
    val name:String = "jesse"

    println("Hello World!")
    println("Hello $name! kotlin is awesome!")

    println(Int.MAX_VALUE)
    println(Double.MIN_VALUE)
    println(Float.MAX_VALUE)


    //operadores aritméticos

    val a = 10
    val b = 5

    val soma = a.plus(b) // ou a + b
    val subtracao = a.minus(b) // ou a - b
    val multiplicacao = a.times(b) // ou a * b
    val divisao = a.div(b) // ou a / b
    val resto = a.rem(b) // ou a % b

    println("Soma: $soma")
    println("Subtração: $subtracao")
    println("Multiplicação: $multiplicacao")
    println("Divisão: $divisao")
    println("Resto: $resto")

    // Operadores de comparação
    val x = 20
    val y = 20

    val resultado = x.compareTo(y) // ou x >= y = false

    //se for -1 que é menor, se for 0 é igual, se for 1 é maior

    println("resultado: $resultado")
    println(x.equals(y)) // ou x == y


    // Operadores lógicos

    val condicao1 = true
    val condicao2 = false

    val resultadoLogico = (condicao1) and (condicao2) // ou condicao1 and condicao2
    //bom costume colocar os parênteses para deixar mais claro
    println("Resultado lógico: $resultadoLogico")

    val resultadoLogico2 = (condicao1) || (condicao2 ) // ou condicao1 or condicao2
    println("Resultado lógico 2: $resultadoLogico2")

    // operadores in e range
    val number = listOf(1, 2, 3, 4, 5)
    println(6 in number)
    println(5 in number) // true

    // o ( in ) verifica se o valor está dentro de uma lista ou intervalo
    // print(12 in number) verificando se o número 12 está dentro da lista number
    // print(12 in 0..10) // verificando se o número 12 está dentro do intervalo de 0 a 10

    val number = listOf(1, 2, 3, 4, 5, 12)
    println(12 in number)

    println(12 in 0..10) // false, pois 12 não está no intervalo de 0 a 10

}