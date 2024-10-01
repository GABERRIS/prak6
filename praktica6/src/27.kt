fun main() {
    // Создаем массив целых чисел
    val numbers = intArrayOf(1, 2, 3, 4, 5)

    // Инициализируем переменную для хранения суммы чисел
    var sum = 0

    // Цикл по всем элементам массива
    for (number in numbers) {
        // Суммируем все числа
        sum += number
    }

    // Вычисляем среднее арифметическое
    val average = sum.toDouble() / numbers.size

    // Выводим результат
    println("Среднее арифметическое: $average")
}