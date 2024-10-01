fun main() {
    // Создаем массив чисел.
    val numbers = intArrayOf(1, 2, 3, 4, 5)

    // Выводим исходный массив.
    println("Исходный массив: ${numbers.contentToString()}")

    // Реверсируем массив с помощью функции reversedArray().
    val reversedNumbers = numbers.reversedArray()

    // Выводим реверсированный массив.
    println("Реверсированный массив: ${reversedNumbers.contentToString()}")
}