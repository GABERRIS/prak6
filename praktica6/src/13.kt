import kotlin.random.Random

fun main() {
    // Создаем массив из 20 элементов
    val numbers = IntArray(20)

    // Заполняем массив случайными числами от 1 до 100
    for (i in 0 until numbers.size) {
        numbers[i] = Random.nextInt(1, 101) // Генерация случайного числа в диапазоне от 1 до 100 (включительно)
    }

    // Выводим массив на экран
    println("Случайные числа:")
    for (number in numbers) {
        print("$number ")
    }
}