fun main() {
    // Массив чисел
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)

    // Размер каждой группы
    val groupSize = 5

    // Проверка, делится ли размер массива на размер группы
    if (numbers.size % groupSize != 0) {
        println("Размер массива не кратен размеру группы.")
        return
    }

    // Цикл по массиву с шагом равным размеру группы
    for (i in 0 until numbers.size step groupSize) {
        // Вывод группы чисел
        println("Группа: ${numbers.sliceArray(i until i + groupSize).joinToString(", ")}")
    }
}