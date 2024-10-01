fun main() {
    // Задаем массив чисел для сортировки
    val numbers = intArrayOf(5, 2, 9, 1, 7, 3)

    // Сортировка массива с использованием функции sort()
    numbers.sort()

    // Вывод отсортированного массива
    println("Отсортированный массив:")
    for (number in numbers) {
        print("$number ")
    }
}