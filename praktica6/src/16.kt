fun main() {
    // Создание первого массива
    val array1 = arrayOf(1, 2, 3)
    // Создание второго массива
    val array2 = arrayOf(4, 5, 6)

    // Создание нового массива, который будет хранить объединенные данные
    val combinedArray = array1 + array2

    // Вывод объединенного массива
    println("Объединенный массив: ${combinedArray.contentToString()}")
}