fun main() {
    val n1 = null ?: 1f
    val n2 = null ?: 1.2f

    fun soma () {
        println(n1 + n2)
    }

    soma()
}