fun main() {
    // Определение массива целых чисел
    val numbers = intArrayOf(1, 2, 3, 2, 4, 5, 1, 6)

    // Создание нового набора для хранения уникальных элементов
    val uniqueNumbers = mutableSetOf<Int>()

    // Итерация по массиву и добавление каждого элемента в набор
    for (number in numbers) {
        uniqueNumbers.add(number)
    }

    // Вывод уникальных элементов
    println("Уникальные элементы:")
    for (uniqueNumber in uniqueNumbers) {
        print("$uniqueNumber ")
    }
}