fun main() {
    // Создаем массив целых чисел
    val numbers = intArrayOf(1, 4, 7, 9, 12, 15)

    // Число, которое нужно найти
    val target = 9

    // Вызываем функцию линейного поиска и выводим результат
    println("Найдено число: ${linearSearch(numbers, target)}")
}


fun linearSearch(array: IntArray, target: Int): Boolean {
    // Проходим по всем элементам массива
    for (i in array.indices) {
        // Если текущий элемент равен целевому элементу
        if (array[i] == target) {
            // Возвращаем true, так как элемент найден
            return true
        }
    }
    // Если элемент не найден, возвращаем false
    return false
}