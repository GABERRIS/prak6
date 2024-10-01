fun main() {
    // Создаем исходный массив.
    val originalArray = intArrayOf(1, 2, 3, 4, 5)

    // Создаем новый массив с тем же размером, что и исходный.
    val copiedArray = IntArray(originalArray.size)

    // Копируем элементы из исходного массива в новый массив.
    for (i in originalArray.indices) {
        copiedArray[i] = originalArray[i]
    }

    // Выводим исходный и скопированный массивы.
    println("Исходный массив: ${originalArray.contentToString()}")
    println("Скопированный массив: ${copiedArray.contentToString()}")
}