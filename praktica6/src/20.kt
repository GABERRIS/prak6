fun main() {
    // Определяем начальное значение прогрессии
    val startValue = 5
    // Определяем шаг прогрессии
    val step = 3
    // Определяем количество элементов прогрессии
    val count = 10

    // Создаем массив целых чисел для хранения прогрессии
    val progression = IntArray(count)

    // Заполняем массив значениями прогрессии
    for (i in 0 until count) {
        // Вычисляем значение элемента прогрессии
        progression[i] = startValue + i * step
    }

    // Выводим элементы прогрессии
    println("Арифметическая прогрессия:")
    for (value in progression) {
        print("$value ")
    }
}