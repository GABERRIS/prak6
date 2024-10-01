fun main() {
    // Создаем массив из 100 случайных целых чисел
    val numbers = Array(100) { (0..100).random() }

    // Создаем массив для хранения 10 групп
    val groups = Array(10) { mutableListOf<Int>() }

    // Распределение элементов по группам
    for (i in 0 until numbers.size) {
        // Вычисляем индекс группы для текущего элемента
        val groupIndex = i / 10
        // Добавляем элемент в соответствующую группу
        groups[groupIndex].add(numbers[i])
    }

    // Вывод результатов
    println("Результаты распределения:")
    for (i in 0 until groups.size) {
        println("Группа ${i + 1}: ${groups[i].joinToString(", ")}")
    }
}