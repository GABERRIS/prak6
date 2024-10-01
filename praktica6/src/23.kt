fun main() {
    // Массивы, которые нужно объединить
    val array1 = intArrayOf(1, 2, 3)
    val array2 = intArrayOf(4, 5, 6)
    val array3 = intArrayOf(7, 8, 9)

    // Вызов функции объединения массивов
    val mergedArray = mergeArrays(array1, array2, array3)

    // Вывод объединенного массива
    println("Объединенный массив: ${mergedArray.joinToString(", ")}")
}

fun mergeArrays(vararg arrays: IntArray): IntArray {
    // Вычисление общей длины всех массивов
    val totalLength = arrays.sumBy { it.size }

    // Создание нового массива с общей длиной
    val mergedArray = IntArray(totalLength)

    // Инициализация индекса для объединенного массива
    var index = 0

    // Цикл по каждому массиву в списке
    for (array in arrays) {
        // Копирование элементов из каждого массива в объединенный массив
        for (element in array) {
            mergedArray[index] = element
            index++
        }
    }

    // Возвращение объединенного массива
    return mergedArray
}