fun main() {
    // Определение двух массивов
    val array1 = intArrayOf(1, 2, 3, 4, 5)
    val array2 = intArrayOf(3, 4, 5, 6, 7)

    // Создание пустого массива для хранения пересечения
    val intersection = mutableListOf<Int>()

    // Проход по первому массиву
    for (element1 in array1) {
        // Проход по второму массиву
        for (element2 in array2) {
            // Если элементы совпадают
            if (element1 == element2) {
                // Добавление элемента в список пересечений
                intersection.add(element1)
                // Прерывание внутреннего цикла после нахождения совпадения
                break
            }
        }
    }

    // Вывод пересечения
    println("Пересечение массивов: $intersection")
}