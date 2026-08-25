fun main() {
    for (celsius in 10..100 step 10) {
        val fahrenheit = (9 * celsius + 160) / 5

        println("$celsius°C = $fahrenheit°F")
    }
}