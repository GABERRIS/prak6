fun main() {
    // Массив целых чисел
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // Переменная для хранения суммы четных чисел
    var sumOfEvenNumbers = 0

    // Итерируем по массиву
    for (number in numbers) {
        // Если число четное
        if (number % 2 == 0) {
            // Добавляем число к сумме
            sumOfEvenNumbers += number
        }
    }

    // Выводим сумму четных чисел
    println("Сумма четных чисел: $sumOfEvenNumbers")
}