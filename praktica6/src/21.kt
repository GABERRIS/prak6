fun removeElement(array: IntArray, element: Int): IntArray {
    // Создаем новый массив с размером на 1 меньше, чем исходный
    val newArray = IntArray(array.size - 1)

    // Индекс для нового массива
    var newIndex = 0

    // Проходимся по исходному массиву
    for (i in array.indices) {
        // Если текущий элемент не равен элементу, который нужно удалить
        if (array[i] != element) {
            // Копируем элемент в новый массив
            newArray[newIndex] = array[i]
            // Увеличиваем индекс нового массива
            newIndex++
        }
    }

    // Возвращаем новый массив
    return newArray
}

fun main() {
    // Исходный массив
    val array = intArrayOf(1, 2, 3, 4, 5, 2, 6)
    // Элемент, который нужно удалить
    val element = 2
    // Вызываем функцию для удаления элемента
    val newArray = removeElement(array, element)
    // Выводим результат
    println("Исходный массив: ${array.contentToString()}")
    println("Новый массив: ${newArray.contentToString()}")
}