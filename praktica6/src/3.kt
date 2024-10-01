fun main() {
    // Создаем массив из 10 чисел
    val numbers = intArrayOf(5, 2, 9, 1, 7, 3, 8, 4, 6, 10)

    // Находим максимальное значение
    var max = numbers[0] // Инициализируем максимальное значение первым элементом массива
    for (number in numbers) {
        if (number > max) {
            max = number
        }
    }

    // Находим минимальное значение
    var min = numbers[0] // Инициализируем минимальное значение первым элементом массива
    for (number in numbers) {
        if (number < min) {
            min = number
        }
    }

    // Выводим результаты
    println("Максимальное значение: $max")
    println("Минимальное значение: $min")
}