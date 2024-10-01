fun main() {
    // Создаем массив целых чисел
    val numbers = intArrayOf(1, 5, 8, 2, 9, 3)

    // Элемент, который нужно найти
    val target = 2

    // Используем цикл for для итерации по массиву
    for (i in numbers.indices) {
        // Если текущий элемент равен целевому
        if (numbers[i] == target) {
            // Выводим индекс найденного элемента
            println("Элемент $target найден по индексу $i")
            // Выходим из цикла, так как элемент найден
            break
        }
    }

    // Если элемент не был найден
    if (target !in numbers) {
        println("Элемент $target не найден в массиве.")
    }
}