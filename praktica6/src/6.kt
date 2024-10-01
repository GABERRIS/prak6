fun main() {
    // Создаем исходный массив чисел
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // Создаем два пустых массива для хранения четных и нечетных чисел
    val evenNumbers = mutableListOf<Int>() // Использование MutableList для динамического добавления элементов
    val oddNumbers = mutableListOf<Int>()

    // Проходим по каждому числу в исходном массиве
    for (number in numbers) {
        // Проверяем, является ли число четным
        if (number % 2 == 0) {
            // Если четное, добавляем его в массив четных чисел
            evenNumbers.add(number)
        } else {
            // Если нечетное, добавляем его в массив нечетных чисел
            oddNumbers.add(number)
        }
    }

    // Выводим результаты
    println("Четные числа: $evenNumbers")
    println("Нечетные числа: $oddNumbers")
}