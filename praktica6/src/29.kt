fun main() {
    // Создаем массив целых чисел
    val numbers = intArrayOf(1, 3, 5, 7, 9)

    // Находим медиану
    val median = findMedian(numbers)

    // Выводим медиану на консоль
    println("Медиана массива: $median")
}

fun findMedian(numbers: IntArray): Double {
    // Сортируем массив по возрастанию
    numbers.sort()

    // Определяем длину массива
    val n = numbers.size

    // Если длина массива четная, то медиана - это среднее арифметическое двух средних элементов
    if (n % 2 == 0) {
        return (numbers[n / 2 - 1] + numbers[n / 2]).toDouble() / 2
    } else {
        // Если длина массива нечетная, то медиана - это средний элемент
        return numbers[n / 2].toDouble()
    }
}